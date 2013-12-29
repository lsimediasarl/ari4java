package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface StatusInfo {

// void setLast_reload_time Date
/**********************************************************
 * Time when Asterisk was last reloaded.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setLast_reload_time(Date val );



// Date getLast_reload_time
/**********************************************************
 * Time when Asterisk was last reloaded.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public Date getLast_reload_time();



// Date getStartup_time
/**********************************************************
 * Time when Asterisk was started.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public Date getStartup_time();



// void setStartup_time Date
/**********************************************************
 * Time when Asterisk was started.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setStartup_time(Date val );


}
;
