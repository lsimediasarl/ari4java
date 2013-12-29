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

public interface AsteriskInfo {

// void setConfig ConfigInfo
/**********************************************************
 * Info about Asterisk configuration
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setConfig(ConfigInfo val );



// void setStatus StatusInfo
/**********************************************************
 * Info about Asterisk status
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setStatus(StatusInfo val );



// StatusInfo getStatus
/**********************************************************
 * Info about Asterisk status
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public StatusInfo getStatus();



// void setBuild BuildInfo
/**********************************************************
 * Info about how Asterisk was built
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setBuild(BuildInfo val );



// BuildInfo getBuild
/**********************************************************
 * Info about how Asterisk was built
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public BuildInfo getBuild();



// ConfigInfo getConfig
/**********************************************************
 * Info about Asterisk configuration
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public ConfigInfo getConfig();



// void setSystem SystemInfo
/**********************************************************
 * Info about the system running Asterisk
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setSystem(SystemInfo val );



// SystemInfo getSystem
/**********************************************************
 * Info about the system running Asterisk
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public SystemInfo getSystem();


}
;
