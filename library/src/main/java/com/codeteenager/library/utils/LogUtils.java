package com.codeteenager.library.utils;

import android.util.Log;

/**
 * Created by codeteenager on 2017/5/10.
 * 日志打印相关类
 */

public class LogUtils {
    public static boolean isDebug = true;// 是否需要打印bug，可以在application的onCreate函数里面初始化

    public static void i(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug)
            Log.d(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug)
            Log.e(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (isDebug) {
            Log.w(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug)
            Log.v(tag, msg);
    }
}
