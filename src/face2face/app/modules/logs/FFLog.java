package face2face.app.modules.logs;

import android.util.Log;

public final class FFLog {

	private static String tag = "F2F";

	public static void i(String msg) {
		Log.i(tag, "[ NORMAL ]" + msg);
	}

	public static void e(String msg) {
		Log.e(tag, "[ ERROR ]" + msg);
	}

	public static void d(String msg) {
		Log.d(tag, "[ DEBUG ]" + msg);
	}

	public static void w(String msg) {
		Log.w(tag, "[ WARN ]" + msg);
	}
}
