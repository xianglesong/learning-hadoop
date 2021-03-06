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

public class RecInt implements org.apache.hadoop.record.Record, org.apache.hadoop.io.WritableComparable {
  private int mData;
  private java.util.BitSet bs_;
  public RecInt() {
    bs_ = new java.util.BitSet(2);
    bs_.set(1);
  }
  public RecInt(
        int m0) {
    bs_ = new java.util.BitSet(2);
    bs_.set(1);
    mData=m0; bs_.set(0);
  }
  public int getData() {
    return mData;
  }
  public void setData(int m_) {
    mData=m_; bs_.set(0);
  }
  public void serialize(org.apache.hadoop.record.OutputArchive a_, String tag) throws java.io.IOException {
    if (!validate()) throw new java.io.IOException("All fields not set:");
    a_.startRecord(this,tag);
    a_.writeInt(mData,"Data");
    bs_.clear(0);
    a_.endRecord(this,tag);
  }
  public void deserialize(org.apache.hadoop.record.InputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(tag);
    mData=a_.readInt("Data");
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
    a_.writeInt(mData,"Data");
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
    if (!(peer_ instanceof RecInt)) {
      throw new ClassCastException("Comparing different types of records.");
    }
    RecInt peer = (RecInt) peer_;
    int ret = 0;
    ret = (mData == peer.mData)? 0 :((mData<peer.mData)?-1:1);
    if (ret != 0) return ret;
     return ret;
  }
  public boolean equals(Object peer_) {
    if (!(peer_ instanceof RecInt)) {
      return false;
    }
    if (peer_ == this) {
      return true;
    }
    RecInt peer = (RecInt) peer_;
    boolean ret = false;
    ret = (mData==peer.mData);
    if (!ret) return ret;
     return ret;
  }
  public int hashCode() {
    int result = 17;
    int ret;
    ret = (int)mData;
    result = 37*result + ret;
    return result;
  }
  public static String signature() {
    return "LRecInt(i)";
  }
}
