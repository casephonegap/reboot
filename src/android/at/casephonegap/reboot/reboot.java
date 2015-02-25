package at.casephonegap.reboot;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;

public class reboot extends CordovaPlugin 
{ @Override
  public boolean execute(String action, JSONArray args, CallbackContext callback) throws JSONException 
  { // grab the correct methods
    Log.d("Reboot Plugin", action);
    if (action.equalsIgnoreCase("now")) 
    { try 
      { Process proc = Runtime.getRuntime().exec(new String[] { "su", "-c", "reboot" });
        proc.waitFor();
        return true;
      }
      catch (Exception ex) { Log.i("Reboot Plugin", "Could not reboot", ex); }
    } 
    else { callback.error("Unknown Action: " + action); }
  return false;
  }
}
