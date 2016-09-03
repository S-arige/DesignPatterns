package com.example.toollibs.log;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * @author songjunjun
 *
 */
public class LogUtils {

	public static boolean ISDEBUG = true;
	
	private static boolean DEBUG_I = true;
	private static boolean DEBUG_V = true;
	private static boolean DEBUG_E = true;
	private static boolean DEBUG_TOAST = true;
	
	static {
		if(!ISDEBUG){
			DEBUG_I = false;
			DEBUG_V = false;
			DEBUG_TOAST = false;
		}
	}
	
	public static void i(String tag,String msg){
		if(DEBUG_I){
			Log.i(tag, msg);
		}
	}
	
	public static void v(String tag,String msg){
		if(DEBUG_V){
			Log.v(tag, msg);
		}
	}
	
	public static void e(String tag,String msg){
		if(DEBUG_E){
			Log.e(tag, msg);
		}
	}
	
	public static void toast(Context context, CharSequence text, int duration){
		if(DEBUG_TOAST){
			Toast.makeText(context, text, duration).show();
		}
	}
}
