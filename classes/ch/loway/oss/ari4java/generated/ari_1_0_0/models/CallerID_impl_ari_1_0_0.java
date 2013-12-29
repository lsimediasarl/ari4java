package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/**********************************************************
 * Caller identification
 * 
 * Defined in file: channels.json
 *********************************************************/

public class CallerID_impl_ari_1_0_0 implements CallerID, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**    */
  private String number;
 public String getNumber() {
   return number;
 }

 @JsonDeserialize( as=String.class )
 public void setNumber(String val ) {
   number = val;
 }

/** No missing signatures from interface */
}

