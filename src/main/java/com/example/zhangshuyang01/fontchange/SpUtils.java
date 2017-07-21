package com.example.zhangshuyang01.fontchange;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zhangshuyang01 on 2017/7/14 0014.
 */

public class SpUtils {
    public static final String CLEAR_FILE = "Clear";
    public static int getFontSize(Context context, String fontsize,int which) {
        SharedPreferences preferences = context.getSharedPreferences("spFont", Context.MODE_PRIVATE);
        return preferences.getInt("fontSize",which);
    }

    public static void spSaveFontSize(Context context, String fontsize,int which) {
        SharedPreferences.Editor editor = context.getSharedPreferences("spFont", Context.MODE_PRIVATE).edit();
        editor.putInt("fontSize", which);
        editor.commit();
    }

    public static void clearFile(Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(CLEAR_FILE, Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }
}
