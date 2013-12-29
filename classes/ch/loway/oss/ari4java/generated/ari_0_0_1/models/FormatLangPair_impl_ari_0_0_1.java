package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/**********************************************************
 * Identifies the format and language of a sound file
 * 
 * Defined in file: sounds.json
 *********************************************************/

public class FormatLangPair_impl_ari_0_0_1 implements FormatLangPair, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private String format;
 public String getFormat() {
   return format;
 }

 @JsonDeserialize( as=String.class )
 public void setFormat(String val ) {
   format = val;
 }

  /**    */
  private String language;
 public String getLanguage() {
   return language;
 }

 @JsonDeserialize( as=String.class )
 public void setLanguage(String val ) {
   language = val;
 }

/** No missing signatures from interface */
}

