/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class Role implements TBase<Role, Role._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Role");

  private static final TField ROLE_NAME_FIELD_DESC = new TField("roleName", TType.STRING, (short)1);
  private static final TField CREATE_TIME_FIELD_DESC = new TField("createTime", TType.I32, (short)2);
  private static final TField OWNER_NAME_FIELD_DESC = new TField("ownerName", TType.STRING, (short)3);

  private String roleName;
  private int createTime;
  private String ownerName;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ROLE_NAME((short)1, "roleName"),
    CREATE_TIME((short)2, "createTime"),
    OWNER_NAME((short)3, "ownerName");

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
        case 1: // ROLE_NAME
          return ROLE_NAME;
        case 2: // CREATE_TIME
          return CREATE_TIME;
        case 3: // OWNER_NAME
          return OWNER_NAME;
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
  private static final int __CREATETIME_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE_NAME, new FieldMetaData("roleName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CREATE_TIME, new FieldMetaData("createTime", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.OWNER_NAME, new FieldMetaData("ownerName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Role.class, metaDataMap);
  }

  public Role() {
  }

  public Role(
    String roleName,
    int createTime,
    String ownerName)
  {
    this();
    this.roleName = roleName;
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    this.ownerName = ownerName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Role(Role other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    this.createTime = other.createTime;
    if (other.isSetOwnerName()) {
      this.ownerName = other.ownerName;
    }
  }

  public Role deepCopy() {
    return new Role(this);
  }

  @Override
  public void clear() {
    this.roleName = null;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    this.ownerName = null;
  }

  public String getRoleName() {
    return this.roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been asigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public int getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(int createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
  }

  public void unsetCreateTime() {
    __isset_bit_vector.clear(__CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been asigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return __isset_bit_vector.get(__CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bit_vector.set(__CREATETIME_ISSET_ID, value);
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public void unsetOwnerName() {
    this.ownerName = null;
  }

  /** Returns true if field ownerName is set (has been asigned a value) and false otherwise */
  public boolean isSetOwnerName() {
    return this.ownerName != null;
  }

  public void setOwnerNameIsSet(boolean value) {
    if (!value) {
      this.ownerName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((Integer)value);
      }
      break;

    case OWNER_NAME:
      if (value == null) {
        unsetOwnerName();
      } else {
        setOwnerName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_NAME:
      return getRoleName();

    case CREATE_TIME:
      return new Integer(getCreateTime());

    case OWNER_NAME:
      return getOwnerName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLE_NAME:
      return isSetRoleName();
    case CREATE_TIME:
      return isSetCreateTime();
    case OWNER_NAME:
      return isSetOwnerName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Role)
      return this.equals((Role)that);
    return false;
  }

  public boolean equals(Role that) {
    if (that == null)
      return false;

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_createTime = true;
    boolean that_present_createTime = true;
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_ownerName = true && this.isSetOwnerName();
    boolean that_present_ownerName = true && that.isSetOwnerName();
    if (this_present_ownerName || that_present_ownerName) {
      if (!(this_present_ownerName && that_present_ownerName))
        return false;
      if (!this.ownerName.equals(that.ownerName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Role other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Role typedOther = (Role)other;

    lastComparison = Boolean.valueOf(isSetRoleName()).compareTo(typedOther.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = TBaseHelper.compareTo(this.roleName, typedOther.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(typedOther.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = TBaseHelper.compareTo(this.createTime, typedOther.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwnerName()).compareTo(typedOther.isSetOwnerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnerName()) {
      lastComparison = TBaseHelper.compareTo(this.ownerName, typedOther.ownerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ROLE_NAME
          if (field.type == TType.STRING) {
            this.roleName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CREATE_TIME
          if (field.type == TType.I32) {
            this.createTime = iprot.readI32();
            setCreateTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // OWNER_NAME
          if (field.type == TType.STRING) {
            this.ownerName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.roleName != null) {
      oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
      oprot.writeString(this.roleName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
    oprot.writeI32(this.createTime);
    oprot.writeFieldEnd();
    if (this.ownerName != null) {
      oprot.writeFieldBegin(OWNER_NAME_FIELD_DESC);
      oprot.writeString(this.ownerName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Role(");
    boolean first = true;

    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createTime:");
    sb.append(this.createTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ownerName:");
    if (this.ownerName == null) {
      sb.append("null");
    } else {
      sb.append(this.ownerName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
