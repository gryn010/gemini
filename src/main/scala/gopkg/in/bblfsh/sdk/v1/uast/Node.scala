// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package gopkg.in.bblfsh.sdk.v1.uast

/** Node is a node in a UAST.
  */
@SerialVersionUID(0L)
final case class Node(
    internalType: _root_.scala.Predef.String = "",
    properties: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = scala.collection.immutable.Map.empty,
    children: _root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Node] = _root_.scala.collection.Seq.empty,
    token: _root_.scala.Predef.String = "",
    startPosition: scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position] = None,
    endPosition: scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position] = None,
    roles: _root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Role] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Node] with scalapb.lenses.Updatable[Node] {
    private[this] def rolesSerializedSize = {
      if (__rolesSerializedSizeField == 0) __rolesSerializedSizeField = {
        var __s: _root_.scala.Int = 0
        roles.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(__i.value))
        __s
      }
      __rolesSerializedSizeField
    }
    @transient private[this] var __rolesSerializedSizeField: _root_.scala.Int = 0
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (internalType != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, internalType) }
      properties.foreach(properties => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toBase(properties).serializedSize) + gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toBase(properties).serializedSize)
      children.foreach(children => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(children.serializedSize) + children.serializedSize)
      if (token != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, token) }
      if (startPosition.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(startPosition.get.serializedSize) + startPosition.get.serializedSize }
      if (endPosition.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(endPosition.get.serializedSize) + endPosition.get.serializedSize }
      if(roles.nonEmpty) {
        val __localsize = rolesSerializedSize
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = internalType
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      properties.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toBase(__v).serializedSize)
        gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toBase(__v).writeTo(_output__)
      };
      children.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      {
        val __v = token
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      startPosition.foreach { __v =>
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      endPosition.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      if (roles.nonEmpty) {
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(rolesSerializedSize)
        roles.foreach((_output__.writeEnumNoTag _).compose((_: gopkg.in.bblfsh.sdk.v1.uast.Role).value))
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): gopkg.in.bblfsh.sdk.v1.uast.Node = {
      var __internalType = this.internalType
      val __properties = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String] ++= this.properties)
      val __children = (_root_.scala.collection.immutable.Vector.newBuilder[gopkg.in.bblfsh.sdk.v1.uast.Node] ++= this.children)
      var __token = this.token
      var __startPosition = this.startPosition
      var __endPosition = this.endPosition
      val __roles = (_root_.scala.collection.immutable.Vector.newBuilder[gopkg.in.bblfsh.sdk.v1.uast.Role] ++= this.roles)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __internalType = _input__.readString()
          case 18 =>
            __properties += gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry.defaultInstance))
          case 26 =>
            __children += _root_.scalapb.LiteParser.readMessage(_input__, gopkg.in.bblfsh.sdk.v1.uast.Node.defaultInstance)
          case 34 =>
            __token = _input__.readString()
          case 42 =>
            __startPosition = Option(_root_.scalapb.LiteParser.readMessage(_input__, __startPosition.getOrElse(gopkg.in.bblfsh.sdk.v1.uast.Position.defaultInstance)))
          case 50 =>
            __endPosition = Option(_root_.scalapb.LiteParser.readMessage(_input__, __endPosition.getOrElse(gopkg.in.bblfsh.sdk.v1.uast.Position.defaultInstance)))
          case 56 =>
            __roles += gopkg.in.bblfsh.sdk.v1.uast.Role.fromValue(_input__.readEnum())
          case 58 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __roles += gopkg.in.bblfsh.sdk.v1.uast.Role.fromValue(_input__.readEnum)
            }
            _input__.popLimit(oldLimit)
          }
          case tag => _input__.skipField(tag)
        }
      }
      gopkg.in.bblfsh.sdk.v1.uast.Node(
          internalType = __internalType,
          properties = __properties.result(),
          children = __children.result(),
          token = __token,
          startPosition = __startPosition,
          endPosition = __endPosition,
          roles = __roles.result()
      )
    }
    def withInternalType(__v: _root_.scala.Predef.String): Node = copy(internalType = __v)
    def clearProperties = copy(properties = scala.collection.immutable.Map.empty)
    def addProperties(__vs: (_root_.scala.Predef.String, _root_.scala.Predef.String)*): Node = addAllProperties(__vs)
    def addAllProperties(__vs: TraversableOnce[(_root_.scala.Predef.String, _root_.scala.Predef.String)]): Node = copy(properties = properties ++ __vs)
    def withProperties(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]): Node = copy(properties = __v)
    def clearChildren = copy(children = _root_.scala.collection.Seq.empty)
    def addChildren(__vs: gopkg.in.bblfsh.sdk.v1.uast.Node*): Node = addAllChildren(__vs)
    def addAllChildren(__vs: TraversableOnce[gopkg.in.bblfsh.sdk.v1.uast.Node]): Node = copy(children = children ++ __vs)
    def withChildren(__v: _root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Node]): Node = copy(children = __v)
    def withToken(__v: _root_.scala.Predef.String): Node = copy(token = __v)
    def getStartPosition: gopkg.in.bblfsh.sdk.v1.uast.Position = startPosition.getOrElse(gopkg.in.bblfsh.sdk.v1.uast.Position.defaultInstance)
    def clearStartPosition: Node = copy(startPosition = None)
    def withStartPosition(__v: gopkg.in.bblfsh.sdk.v1.uast.Position): Node = copy(startPosition = Option(__v))
    def getEndPosition: gopkg.in.bblfsh.sdk.v1.uast.Position = endPosition.getOrElse(gopkg.in.bblfsh.sdk.v1.uast.Position.defaultInstance)
    def clearEndPosition: Node = copy(endPosition = None)
    def withEndPosition(__v: gopkg.in.bblfsh.sdk.v1.uast.Position): Node = copy(endPosition = Option(__v))
    def clearRoles = copy(roles = _root_.scala.collection.Seq.empty)
    def addRoles(__vs: gopkg.in.bblfsh.sdk.v1.uast.Role*): Node = addAllRoles(__vs)
    def addAllRoles(__vs: TraversableOnce[gopkg.in.bblfsh.sdk.v1.uast.Role]): Node = copy(roles = roles ++ __vs)
    def withRoles(__v: _root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Role]): Node = copy(roles = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = internalType
          if (__t != "") __t else null
        }
        case 2 => properties.map(gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toBase)(_root_.scala.collection.breakOut)
        case 3 => children
        case 4 => {
          val __t = token
          if (__t != "") __t else null
        }
        case 5 => startPosition.orNull
        case 6 => endPosition.orNull
        case 7 => roles.map(_.javaValueDescriptor)(_root_.scala.collection.breakOut)
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(internalType)
        case 2 => _root_.scalapb.descriptors.PRepeated(properties.map(gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
        case 3 => _root_.scalapb.descriptors.PRepeated(children.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4 => _root_.scalapb.descriptors.PString(token)
        case 5 => startPosition.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => endPosition.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => _root_.scalapb.descriptors.PRepeated(roles.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor))(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = gopkg.in.bblfsh.sdk.v1.uast.Node
}

object Node extends scalapb.GeneratedMessageCompanion[gopkg.in.bblfsh.sdk.v1.uast.Node] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[gopkg.in.bblfsh.sdk.v1.uast.Node] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): gopkg.in.bblfsh.sdk.v1.uast.Node = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    gopkg.in.bblfsh.sdk.v1.uast.Node(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry]].map(gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toCustom)(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Node]],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position]],
      __fieldsMap.getOrElse(__fields.get(6), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => gopkg.in.bblfsh.sdk.v1.uast.Role.fromValue(__e.getNumber))(_root_.scala.collection.breakOut)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[gopkg.in.bblfsh.sdk.v1.uast.Node] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      gopkg.in.bblfsh.sdk.v1.uast.Node(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(gopkg.in.bblfsh.sdk.v1.uast.Node._typemapper_properties.toCustom)(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Node]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.collection.Seq[_root_.scalapb.descriptors.EnumValueDescriptor]]).getOrElse(_root_.scala.collection.Seq.empty).map(__e => gopkg.in.bblfsh.sdk.v1.uast.Role.fromValue(__e.number))(_root_.scala.collection.breakOut)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = GeneratedProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = GeneratedProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry
      case 3 => __out = gopkg.in.bblfsh.sdk.v1.uast.Node
      case 5 => __out = gopkg.in.bblfsh.sdk.v1.uast.Position
      case 6 => __out = gopkg.in.bblfsh.sdk.v1.uast.Position
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 7 => gopkg.in.bblfsh.sdk.v1.uast.Role
    }
  }
  lazy val defaultInstance = gopkg.in.bblfsh.sdk.v1.uast.Node(
  )
  @SerialVersionUID(0L)
  final case class PropertiesEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Predef.String = ""
      ) extends scalapb.GeneratedMessage with scalapb.Message[PropertiesEntry] with scalapb.lenses.Updatable[PropertiesEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (key != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, key) }
        if (value != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, value) }
        __size
      }
      final override def serializedSize: _root_.scala.Int = {
        var read = __serializedSizeCachedValue
        if (read == 0) {
          read = __computeSerializedValue()
          __serializedSizeCachedValue = read
        }
        read
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
        {
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = value
          if (__v != "") {
            _output__.writeString(2, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): PropertiesEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Predef.String): PropertiesEntry = copy(value = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = value
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => _root_.scalapb.descriptors.PString(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry
  }
  
  object PropertiesEntry extends scalapb.GeneratedMessageCompanion[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = gopkg.in.bblfsh.sdk.v1.uast.Node.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = gopkg.in.bblfsh.sdk.v1.uast.Node.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry(
    )
    implicit class PropertiesEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] =
      _root_.scalapb.TypeMapper[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)](__m => (__m.key, __m.value))(__p => gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry(__p._1, __p._2))
  }
  
  implicit class NodeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, gopkg.in.bblfsh.sdk.v1.uast.Node]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, gopkg.in.bblfsh.sdk.v1.uast.Node](_l) {
    def internalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.internalType)((c_, f_) => c_.copy(internalType = f_))
    def properties: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]] = field(_.properties)((c_, f_) => c_.copy(properties = f_))
    def children: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Node]] = field(_.children)((c_, f_) => c_.copy(children = f_))
    def token: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.token)((c_, f_) => c_.copy(token = f_))
    def startPosition: _root_.scalapb.lenses.Lens[UpperPB, gopkg.in.bblfsh.sdk.v1.uast.Position] = field(_.getStartPosition)((c_, f_) => c_.copy(startPosition = Option(f_)))
    def optionalStartPosition: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position]] = field(_.startPosition)((c_, f_) => c_.copy(startPosition = f_))
    def endPosition: _root_.scalapb.lenses.Lens[UpperPB, gopkg.in.bblfsh.sdk.v1.uast.Position] = field(_.getEndPosition)((c_, f_) => c_.copy(endPosition = Option(f_)))
    def optionalEndPosition: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[gopkg.in.bblfsh.sdk.v1.uast.Position]] = field(_.endPosition)((c_, f_) => c_.copy(endPosition = f_))
    def roles: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[gopkg.in.bblfsh.sdk.v1.uast.Role]] = field(_.roles)((c_, f_) => c_.copy(roles = f_))
  }
  final val INTERNAL_TYPE_FIELD_NUMBER = 1
  final val PROPERTIES_FIELD_NUMBER = 2
  final val CHILDREN_FIELD_NUMBER = 3
  final val TOKEN_FIELD_NUMBER = 4
  final val START_POSITION_FIELD_NUMBER = 5
  final val END_POSITION_FIELD_NUMBER = 6
  final val ROLES_FIELD_NUMBER = 7
  @transient
  private val _typemapper_properties: _root_.scalapb.TypeMapper[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] = implicitly[_root_.scalapb.TypeMapper[gopkg.in.bblfsh.sdk.v1.uast.Node.PropertiesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)]]
}