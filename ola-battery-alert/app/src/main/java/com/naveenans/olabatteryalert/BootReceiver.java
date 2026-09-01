package com.naveenans.olabatteryalert;
import android.content.*;
public class BootReceiver extends BroadcastReceiver { @Override public void onReceive(Context c,Intent i){ if(c.getSharedPreferences("prefs",0).getBoolean("monitor",false)) try{c.startForegroundService(new Intent(c,WidgetMonitorService.class));}catch(Exception ignored){} } }
