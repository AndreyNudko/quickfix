package org.quickfix.fix44; 
import org.quickfix.FieldNotFound; 
import org.quickfix.Group; 
import org.quickfix.field.*; 

public class BusinessMessageReject extends Message 
{ 

  public BusinessMessageReject() 
  { 
    getHeader().setField(new MsgType("j")); 
  } 
  public BusinessMessageReject(    
    org.quickfix.field.RefMsgType aRefMsgType,    
    org.quickfix.field.BusinessRejectReason aBusinessRejectReason ) 
  {  
    getHeader().setField(new MsgType("j")); 
    set(aRefMsgType); 
    set(aBusinessRejectReason);  
  } 

  public void set(org.quickfix.field.RefSeqNum value) 
  { setField(value); } 
  public org.quickfix.field.RefSeqNum get(org.quickfix.field.RefSeqNum value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RefSeqNum getRefSeqNum() throws FieldNotFound 
  { org.quickfix.field.RefSeqNum value = new org.quickfix.field.RefSeqNum(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RefSeqNum field) 
  { return isSetField(field); } 
  public boolean isSetRefSeqNum() 
  { return isSetField(45); } 

  public void set(org.quickfix.field.RefMsgType value) 
  { setField(value); } 
  public org.quickfix.field.RefMsgType get(org.quickfix.field.RefMsgType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RefMsgType getRefMsgType() throws FieldNotFound 
  { org.quickfix.field.RefMsgType value = new org.quickfix.field.RefMsgType(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RefMsgType field) 
  { return isSetField(field); } 
  public boolean isSetRefMsgType() 
  { return isSetField(372); } 

  public void set(org.quickfix.field.BusinessRejectRefID value) 
  { setField(value); } 
  public org.quickfix.field.BusinessRejectRefID get(org.quickfix.field.BusinessRejectRefID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BusinessRejectRefID getBusinessRejectRefID() throws FieldNotFound 
  { org.quickfix.field.BusinessRejectRefID value = new org.quickfix.field.BusinessRejectRefID(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.BusinessRejectRefID field) 
  { return isSetField(field); } 
  public boolean isSetBusinessRejectRefID() 
  { return isSetField(379); } 

  public void set(org.quickfix.field.BusinessRejectReason value) 
  { setField(value); } 
  public org.quickfix.field.BusinessRejectReason get(org.quickfix.field.BusinessRejectReason value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BusinessRejectReason getBusinessRejectReason() throws FieldNotFound 
  { org.quickfix.field.BusinessRejectReason value = new org.quickfix.field.BusinessRejectReason(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.BusinessRejectReason field) 
  { return isSetField(field); } 
  public boolean isSetBusinessRejectReason() 
  { return isSetField(380); } 

  public void set(org.quickfix.field.Text value) 
  { setField(value); } 
  public org.quickfix.field.Text get(org.quickfix.field.Text value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Text getText() throws FieldNotFound 
  { org.quickfix.field.Text value = new org.quickfix.field.Text(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.Text field) 
  { return isSetField(field); } 
  public boolean isSetText() 
  { return isSetField(58); } 

  public void set(org.quickfix.field.EncodedTextLen value) 
  { setField(value); } 
  public org.quickfix.field.EncodedTextLen get(org.quickfix.field.EncodedTextLen value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound 
  { org.quickfix.field.EncodedTextLen value = new org.quickfix.field.EncodedTextLen(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.EncodedTextLen field) 
  { return isSetField(field); } 
  public boolean isSetEncodedTextLen() 
  { return isSetField(354); } 

  public void set(org.quickfix.field.EncodedText value) 
  { setField(value); } 
  public org.quickfix.field.EncodedText get(org.quickfix.field.EncodedText value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EncodedText getEncodedText() throws FieldNotFound 
  { org.quickfix.field.EncodedText value = new org.quickfix.field.EncodedText(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.EncodedText field) 
  { return isSetField(field); } 
  public boolean isSetEncodedText() 
  { return isSetField(355); } 
} 