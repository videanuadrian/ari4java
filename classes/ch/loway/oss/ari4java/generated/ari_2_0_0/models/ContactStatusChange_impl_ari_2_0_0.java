package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Dec 19 09:55:49 CET 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * The state of a contact on an endpoint has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ContactStatusChange_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements ContactStatusChange, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private ContactInfo contact_info;
 public ContactInfo getContact_info() {
   return contact_info;
 }

 @JsonDeserialize( as=ContactInfo_impl_ari_2_0_0.class )
 public void setContact_info(ContactInfo val ) {
   contact_info = val;
 }

  /**    */
  private Endpoint endpoint;
 public Endpoint getEndpoint() {
   return endpoint;
 }

 @JsonDeserialize( as=Endpoint_impl_ari_2_0_0.class )
 public void setEndpoint(Endpoint val ) {
   endpoint = val;
 }

/** No missing signatures from interface */
}

