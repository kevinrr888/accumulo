/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.tabletserver.thrift;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TSampleNotPresentException extends TException implements org.apache.thrift.TBase<TSampleNotPresentException, TSampleNotPresentException._Fields>, java.io.Serializable, Cloneable, Comparable<TSampleNotPresentException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSampleNotPresentException");

  private static final org.apache.thrift.protocol.TField EXTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("extent", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSampleNotPresentExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSampleNotPresentExceptionTupleSchemeFactory());
  }

  public org.apache.accumulo.core.data.thrift.TKeyExtent extent; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXTENT((short)1, "extent");

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
        case 1: // EXTENT
          return EXTENT;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXTENT, new org.apache.thrift.meta_data.FieldMetaData("extent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.accumulo.core.data.thrift.TKeyExtent.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSampleNotPresentException.class, metaDataMap);
  }

  public TSampleNotPresentException() {
  }

  public TSampleNotPresentException(
    org.apache.accumulo.core.data.thrift.TKeyExtent extent)
  {
    this();
    this.extent = extent;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSampleNotPresentException(TSampleNotPresentException other) {
    if (other.isSetExtent()) {
      this.extent = new org.apache.accumulo.core.data.thrift.TKeyExtent(other.extent);
    }
  }

  public TSampleNotPresentException deepCopy() {
    return new TSampleNotPresentException(this);
  }

  @Override
  public void clear() {
    this.extent = null;
  }

  public org.apache.accumulo.core.data.thrift.TKeyExtent getExtent() {
    return this.extent;
  }

  public TSampleNotPresentException setExtent(org.apache.accumulo.core.data.thrift.TKeyExtent extent) {
    this.extent = extent;
    return this;
  }

  public void unsetExtent() {
    this.extent = null;
  }

  /** Returns true if field extent is set (has been assigned a value) and false otherwise */
  public boolean isSetExtent() {
    return this.extent != null;
  }

  public void setExtentIsSet(boolean value) {
    if (!value) {
      this.extent = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXTENT:
      if (value == null) {
        unsetExtent();
      } else {
        setExtent((org.apache.accumulo.core.data.thrift.TKeyExtent)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXTENT:
      return getExtent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXTENT:
      return isSetExtent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSampleNotPresentException)
      return this.equals((TSampleNotPresentException)that);
    return false;
  }

  public boolean equals(TSampleNotPresentException that) {
    if (that == null)
      return false;

    boolean this_present_extent = true && this.isSetExtent();
    boolean that_present_extent = true && that.isSetExtent();
    if (this_present_extent || that_present_extent) {
      if (!(this_present_extent && that_present_extent))
        return false;
      if (!this.extent.equals(that.extent))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_extent = true && (isSetExtent());
    list.add(present_extent);
    if (present_extent)
      list.add(extent);

    return list.hashCode();
  }

  @Override
  public int compareTo(TSampleNotPresentException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExtent()).compareTo(other.isSetExtent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extent, other.extent);
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
    StringBuilder sb = new StringBuilder("TSampleNotPresentException(");
    boolean first = true;

    sb.append("extent:");
    if (this.extent == null) {
      sb.append("null");
    } else {
      sb.append(this.extent);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (extent != null) {
      extent.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSampleNotPresentExceptionStandardSchemeFactory implements SchemeFactory {
    public TSampleNotPresentExceptionStandardScheme getScheme() {
      return new TSampleNotPresentExceptionStandardScheme();
    }
  }

  private static class TSampleNotPresentExceptionStandardScheme extends StandardScheme<TSampleNotPresentException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSampleNotPresentException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.extent = new org.apache.accumulo.core.data.thrift.TKeyExtent();
              struct.extent.read(iprot);
              struct.setExtentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSampleNotPresentException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.extent != null) {
        oprot.writeFieldBegin(EXTENT_FIELD_DESC);
        struct.extent.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSampleNotPresentExceptionTupleSchemeFactory implements SchemeFactory {
    public TSampleNotPresentExceptionTupleScheme getScheme() {
      return new TSampleNotPresentExceptionTupleScheme();
    }
  }

  private static class TSampleNotPresentExceptionTupleScheme extends TupleScheme<TSampleNotPresentException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSampleNotPresentException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExtent()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExtent()) {
        struct.extent.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSampleNotPresentException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.extent = new org.apache.accumulo.core.data.thrift.TKeyExtent();
        struct.extent.read(iprot);
        struct.setExtentIsSet(true);
      }
    }
  }

}

