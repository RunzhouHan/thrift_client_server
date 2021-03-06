/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2021-03-18")
public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable, Comparable<User> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField UNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("uname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USEX_FIELD_DESC = new org.apache.thrift.protocol.TField("usex", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField UAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("uage", org.apache.thrift.protocol.TType.I16, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserTupleSchemeFactory());
  }

  public String uid; // required
  public String uname; // required
  public boolean usex; // required
  public short uage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    UNAME((short)2, "uname"),
    USEX((short)3, "usex"),
    UAGE((short)4, "uage");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // UID
          return UID;
        case 2: // UNAME
          return UNAME;
        case 3: // USEX
          return USEX;
        case 4: // UAGE
          return UAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USEX_ISSET_ID = 0;
  private static final int __UAGE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNAME, new org.apache.thrift.meta_data.FieldMetaData("uname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USEX, new org.apache.thrift.meta_data.FieldMetaData("usex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.UAGE, new org.apache.thrift.meta_data.FieldMetaData("uage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
  }

  public User() {
  }

  public User(
    String uid,
    String uname,
    boolean usex,
    short uage)
  {
    this();
    this.uid = uid;
    this.uname = uname;
    this.usex = usex;
    setUsexIsSet(true);
    this.uage = uage;
    setUageIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public User(User other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetUname()) {
      this.uname = other.uname;
    }
    this.usex = other.usex;
    this.uage = other.uage;
  }

  public User deepCopy() {
    return new User(this);
  }

  @Override
  public void clear() {
    this.uid = null;
    this.uname = null;
    setUsexIsSet(false);
    this.usex = false;
    setUageIsSet(false);
    this.uage = 0;
  }

  public String getUid() {
    return this.uid;
  }

  public User setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public void unsetUid() {
    this.uid = null;
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return this.uid != null;
  }

  public void setUidIsSet(boolean value) {
    if (!value) {
      this.uid = null;
    }
  }

  public String getUname() {
    return this.uname;
  }

  public User setUname(String uname) {
    this.uname = uname;
    return this;
  }

  public void unsetUname() {
    this.uname = null;
  }

  /** Returns true if field uname is set (has been assigned a value) and false otherwise */
  public boolean isSetUname() {
    return this.uname != null;
  }

  public void setUnameIsSet(boolean value) {
    if (!value) {
      this.uname = null;
    }
  }

  public boolean isUsex() {
    return this.usex;
  }

  public User setUsex(boolean usex) {
    this.usex = usex;
    setUsexIsSet(true);
    return this;
  }

  public void unsetUsex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USEX_ISSET_ID);
  }

  /** Returns true if field usex is set (has been assigned a value) and false otherwise */
  public boolean isSetUsex() {
    return EncodingUtils.testBit(__isset_bitfield, __USEX_ISSET_ID);
  }

  public void setUsexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USEX_ISSET_ID, value);
  }

  public short getUage() {
    return this.uage;
  }

  public User setUage(short uage) {
    this.uage = uage;
    setUageIsSet(true);
    return this;
  }

  public void unsetUage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UAGE_ISSET_ID);
  }

  /** Returns true if field uage is set (has been assigned a value) and false otherwise */
  public boolean isSetUage() {
    return EncodingUtils.testBit(__isset_bitfield, __UAGE_ISSET_ID);
  }

  public void setUageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UAGE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((String)value);
      }
      break;

    case UNAME:
      if (value == null) {
        unsetUname();
      } else {
        setUname((String)value);
      }
      break;

    case USEX:
      if (value == null) {
        unsetUsex();
      } else {
        setUsex((Boolean)value);
      }
      break;

    case UAGE:
      if (value == null) {
        unsetUage();
      } else {
        setUage((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case UNAME:
      return getUname();

    case USEX:
      return isUsex();

    case UAGE:
      return getUage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID:
      return isSetUid();
    case UNAME:
      return isSetUname();
    case USEX:
      return isSetUsex();
    case UAGE:
      return isSetUage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof User)
      return this.equals((User)that);
    return false;
  }

  public boolean equals(User that) {
    if (that == null)
      return false;

    boolean this_present_uid = true && this.isSetUid();
    boolean that_present_uid = true && that.isSetUid();
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (!this.uid.equals(that.uid))
        return false;
    }

    boolean this_present_uname = true && this.isSetUname();
    boolean that_present_uname = true && that.isSetUname();
    if (this_present_uname || that_present_uname) {
      if (!(this_present_uname && that_present_uname))
        return false;
      if (!this.uname.equals(that.uname))
        return false;
    }

    boolean this_present_usex = true;
    boolean that_present_usex = true;
    if (this_present_usex || that_present_usex) {
      if (!(this_present_usex && that_present_usex))
        return false;
      if (this.usex != that.usex)
        return false;
    }

    boolean this_present_uage = true;
    boolean that_present_uage = true;
    if (this_present_uage || that_present_uage) {
      if (!(this_present_uage && that_present_uage))
        return false;
      if (this.uage != that.uage)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uid = true && (isSetUid());
    list.add(present_uid);
    if (present_uid)
      list.add(uid);

    boolean present_uname = true && (isSetUname());
    list.add(present_uname);
    if (present_uname)
      list.add(uname);

    boolean present_usex = true;
    list.add(present_usex);
    if (present_usex)
      list.add(usex);

    boolean present_uage = true;
    list.add(present_uage);
    if (present_uage)
      list.add(uage);

    return list.hashCode();
  }

  @Override
  public int compareTo(User other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUid()).compareTo(other.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, other.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUname()).compareTo(other.isSetUname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uname, other.uname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsex()).compareTo(other.isSetUsex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usex, other.usex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUage()).compareTo(other.isSetUage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uage, other.uage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("User(");
    boolean first = true;

    sb.append("uid:");
    if (this.uid == null) {
      sb.append("null");
    } else {
      sb.append(this.uid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("uname:");
    if (this.uname == null) {
      sb.append("null");
    } else {
      sb.append(this.uname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("usex:");
    sb.append(this.usex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uage:");
    sb.append(this.uage);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserStandardSchemeFactory implements SchemeFactory {
    public UserStandardScheme getScheme() {
      return new UserStandardScheme();
    }
  }

  private static class UserStandardScheme extends StandardScheme<User> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uid = iprot.readString();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uname = iprot.readString();
              struct.setUnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.usex = iprot.readBool();
              struct.setUsexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.uage = iprot.readI16();
              struct.setUageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uid != null) {
        oprot.writeFieldBegin(UID_FIELD_DESC);
        oprot.writeString(struct.uid);
        oprot.writeFieldEnd();
      }
      if (struct.uname != null) {
        oprot.writeFieldBegin(UNAME_FIELD_DESC);
        oprot.writeString(struct.uname);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(USEX_FIELD_DESC);
      oprot.writeBool(struct.usex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UAGE_FIELD_DESC);
      oprot.writeI16(struct.uage);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserTupleSchemeFactory implements SchemeFactory {
    public UserTupleScheme getScheme() {
      return new UserTupleScheme();
    }
  }

  private static class UserTupleScheme extends TupleScheme<User> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetUname()) {
        optionals.set(1);
      }
      if (struct.isSetUsex()) {
        optionals.set(2);
      }
      if (struct.isSetUage()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetUname()) {
        oprot.writeString(struct.uname);
      }
      if (struct.isSetUsex()) {
        oprot.writeBool(struct.usex);
      }
      if (struct.isSetUage()) {
        oprot.writeI16(struct.uage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.uname = iprot.readString();
        struct.setUnameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.usex = iprot.readBool();
        struct.setUsexIsSet(true);
      }
      if (incoming.get(3)) {
        struct.uage = iprot.readI16();
        struct.setUageIsSet(true);
      }
    }
  }

}

