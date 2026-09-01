package com.naveenans.olabatteryalert;
import android.view.*; import android.widget.TextView; import java.util.regex.*;
public final class BatteryParser {
 private static final Pattern P=Pattern.compile("(?<!\\d)(100|[1-9]?\\d)\\s*%"); private BatteryParser(){}
 public static Integer fromText(String s){ if(s==null)return null; Matcher m=P.matcher(s); if(m.find())try{return Integer.parseInt(m.group(1));}catch(Exception ignored){} return null; }
 public static Integer fromView(View v){ if(v==null)return null; if(v instanceof TextView){ CharSequence c=((TextView)v).getText(); Integer x=fromText(c==null?null:c.toString()); if(x!=null)return x;} CharSequence d=v.getContentDescription(); Integer x=fromText(d==null?null:d.toString()); if(x!=null)return x; if(v instanceof ViewGroup){ViewGroup g=(ViewGroup)v; for(int i=0;i<g.getChildCount();i++){x=fromView(g.getChildAt(i)); if(x!=null)return x;}} return null; }
}
