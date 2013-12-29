package ch.loway.oss.ari4java.generated.ari_1_0_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_1_0_0.models.*;

public class ActionPlaybacks_impl_ari_1_0_0 extends BaseAriAction  implements ActionPlaybacks {
/**********************************************************
 * Control object for a playback operation.
 * 
 * Get a playback's details.
 *********************************************************/
private void buildGet(String playbackId) {
reset();
url = "/playbacks/" + playbackId + "";
method = "GET";
lE.add( BaseAriAction.HttpResponse.build( 404, "The playback cannot be found") );
}

@Override
public Playback get(String playbackId) throws RestException {
buildGet(playbackId);
String json = httpActionSync();
return deserializeJson( json, Playback_impl_ari_1_0_0.class ); 
}

@Override
public void get(String playbackId, AriCallback<Playback> callback) {
buildGet(playbackId);
httpActionAsync(callback, Playback_impl_ari_1_0_0.class);
}

/**********************************************************
 * Control object for a playback operation.
 * 
 * Stop a playback.
 *********************************************************/
private void buildStop(String playbackId) {
reset();
url = "/playbacks/" + playbackId + "";
method = "DELETE";
lE.add( BaseAriAction.HttpResponse.build( 404, "The playback cannot be found") );
}

@Override
public void stop(String playbackId) throws RestException {
buildStop(playbackId);
String json = httpActionSync();
}

@Override
public void stop(String playbackId, AriCallback<Void> callback) {
buildStop(playbackId);
httpActionAsync(callback);
}

/**********************************************************
 * Control object for a playback operation.
 * 
 * Control a playback.
 *********************************************************/
private void buildControl(String playbackId, String operation) {
reset();
url = "/playbacks/" + playbackId + "/control";
method = "POST";
lParamQuery.add( BaseAriAction.HttpParam.build( "operation", operation) );
lE.add( BaseAriAction.HttpResponse.build( 400, "The provided operation parameter was invalid") );
lE.add( BaseAriAction.HttpResponse.build( 404, "The playback cannot be found") );
lE.add( BaseAriAction.HttpResponse.build( 409, "The operation cannot be performed in the playback's current state") );
}

@Override
public void control(String playbackId, String operation) throws RestException {
buildControl(playbackId, operation);
String json = httpActionSync();
}

@Override
public void control(String playbackId, String operation, AriCallback<Void> callback) {
buildControl(playbackId, operation);
httpActionAsync(callback);
}

/** No missing signatures from interface */
};

