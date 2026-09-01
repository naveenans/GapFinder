package com.naveenans.olabatteryalert;
import android.appwidget.AppWidgetHostView; import android.content.Context; import android.widget.RemoteViews;
public class BatteryWidgetHostView extends AppWidgetHostView { public interface Listener{void onBattery(Integer pct);} private Listener listener; public BatteryWidgetHostView(Context c){super(c);} public void setListener(Listener l){listener=l;} @Override public void updateAppWidget(RemoteViews r){super.updateAppWidget(r); postDelayed(()->{if(listener!=null)listener.onBattery(BatteryParser.fromView(this));},350);} }
