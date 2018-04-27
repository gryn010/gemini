package tech.sourced.featurext;

import io.grpc.{ManagedChannel, ManagedChannelBuilder}
import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}
import tech.sourced.featurext.generated.service._
import gopkg.in.bblfsh.sdk.v1.uast.generated.Node
import java.nio.file.{Files, Paths}

@tags.FEIntegration
class ClientSpec extends FlatSpec
  with Matchers
  with BeforeAndAfterAll {

  val serverHost = "localhost"
  val serverPort = 9001
  val fixturePath = "src/test/resources/protomsgs/server.py.proto"

  var channel: ManagedChannel = _
  var blockingStub: FeatureExtractorGrpc.FeatureExtractorBlockingStub = _
  var uast: Node = _

  override def beforeAll(): Unit = {
    super.beforeAll()

    val byteArray: Array[Byte] = Files.readAllBytes(Paths.get(fixturePath))
    uast = Node.parseFrom(byteArray)

    channel = ManagedChannelBuilder.forAddress(serverHost, serverPort).usePlaintext(true).build()
    blockingStub = FeatureExtractorGrpc.blockingStub(channel)
  }

  override def afterAll(): Unit = {
    channel.shutdownNow()
  }

  "identifiers call" should "return correct response" in {
    val request = IdentifiersRequest(docfreqThreshold=5, uast=Some(uast))
    val reply = blockingStub.identifiers(request)
    var features = reply.features.sortBy(f => f.name)

    // check correct shape of response
    features.size should be(49)
    features(0).name should be("i.ArgumentParser")
    features(0).weight should be(1)
  }

  "literals call" should "return correct response" in {
    val request = LiteralsRequest(docfreqThreshold=5, uast=Some(uast))
    val reply = blockingStub.literals(request)
    var features = reply.features.sortBy(f => f.name)

    // check correct shape of response
    features.size should be(16)
    features(0).name should be("l.149420d2b7f04801")
    features(0).weight should be(1)
  }

  "uast2seq call" should "return correct response" in {
    val request = Uast2seqRequest(docfreqThreshold=5, uast=Some(uast))
    val reply = blockingStub.uast2Seq(request)
    var features = reply.features.sortBy(f => f.name)

    // check correct shape of response
    features.size should be(207)
    features(0).name should be("s.Assign>Name>Attribute>Call>Expr")
    features(0).weight should be(1)
  }

  "graphlet call" should "return correct response" in {
    val request = GraphletRequest(docfreqThreshold=5, uast=Some(uast))
    val reply = blockingStub.graphlet(request)
    var features = reply.features.sortBy(f => f.name)

    // check correct shape of response
    features.size should be(106)
    features(1).name should be("g.Assign_Call_Attribute")
    features(0).weight should be(1)
  }
}
