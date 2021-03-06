/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// File generated by hadoop record compiler. Do not edit.
package org.apache.hadoop.record.test;

import org.apache.hadoop.io.Text;

public class RecRecord0 implements org.apache.hadoop.record.Record, org.apache.hadoop.io.WritableComparable {
  private Text mStringVal;
  private java.util.BitSet bs_;
  public RecRecord0() {
    bs_ = new java.util.BitSet(2);
    bs_.set(1);
  }
  public RecRecord0(
        Text m0) {
    bs_ = new java.util.BitSet(2);
    bs_.set(1);
    mStringVal=m0; bs_.set(0);
  }
  public Text getStringVal() {
    return mStringVal;
  }
  public void setStringVal(Text m_) {
    mStringVal=m_; bs_.set(0);
  }
  public void serialize(org.apache.hadoop.record.OutputArchive a_, String tag) throws java.io.IOException {
    if (!validate()) throw new java.io.IOException("All fields not set:");
    a_.startRecord(this,tag);
    a_.writeString(mStringVal,"StringVal");
    bs_.clear(0);
    a_.endRecord(this,tag);
  }
  public void deserialize(org.apache.hadoop.record.InputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(tag);
    mStringVal=a_.readString("StringVal");
    bs_.set(0);
    a_.endRecord(tag);
}
  public String toString() {
    try {
      java.io.ByteArrayOutputStream s =
        new java.io.ByteArrayOutputStream();
      org.apache.hadoop.record.CsvOutputArchive a_ = 
        new org.apache.hadoop.record.CsvOutputArchive(s);
      a_.startRecord(this,"");
    a_.writeString(mStringVal,"StringVal");
      a_.endRecord(this,"");
      return new String(s.toByteArray(), "UTF-8");
    } catch (Throwable ex) {
      ex.printStackTrace();
    }
    return "ERROR";
  }
  public void write(java.io.DataOutput out) throws java.io.IOException {
    org.apache.hadoop.record.BinaryOutputArchive archive = new org.apache.hadoop.record.BinaryOutputArchive(out);
    serialize(archive, "");
  }
  public void readFields(java.io.DataInput in) throws java.io.IOException {
    org.apache.hadoop.record.BinaryInputArchive archive = new org.apache.hadoop.record.BinaryInputArchive(in);
    deserialize(archive, "");
  }
  public boolean validate() {
    if (bs_.cardinality() != bs_.length()) return false;
    return true;
}
  public int compareTo (Object peer_) throws ClassCastException {
    if (!(peer_ instanceof RecRecord0)) {
      throw new ClassCastException("Comparing different types of records.");
    }
    RecRecord0 peer = (RecRecord0) peer_;
    int ret = 0;
    ret = mStringVal.compareTo(peer.mStringVal);
    if (ret != 0) return ret;
     return ret;
  }
  public boolean equals(Object peer_) {
    if (!(peer_ instanceof RecRecord0)) {
      return false;
    }
    if (peer_ == this) {
      return true;
    }
    RecRecord0 peer = (RecRecord0) peer_;
    boolean ret = false;
    ret = mStringVal.equals(peer.mStringVal);
    if (!ret) return ret;
     return ret;
  }
  public int hashCode() {
    int result = 17;
    int ret;
    ret = mStringVal.hashCode();
    result = 37*result + ret;
    return result;
  }
  public static String signature() {
    return "LRecRecord0(s)";
  }
}
