package com.naveenans.olabatteryalert;
import android.appwidget.AppWidgetHost; import android.appwidget.AppWidgetHostView; import android.content.Context;
public class BatteryWidgetHost extends AppWidgetHost { public BatteryWidgetHost(Context c,int id){super(c,id);} @Override protected AppWidgetHostView onCreateView(Context c,int id,android.appwidget.AppWidgetProviderInfo info){return new BatteryWidgetHostView(c);} }
