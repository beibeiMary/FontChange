package com.example.zhangshuyang01.fontchange;

import android.content.Context;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebSettings.TextSize;
/**
 * Created by zhangshuyang01 on 2017/7/14 0014.
 */

public class CommonUtils {
    public static void initData(Context context){
        int mode = (Integer) SpUtils.getFontSize(context, "fontSize", -1);
        Log.v("zhsy","mode=="+mode);
        if(mode==-1||mode==1){
            context.setTheme(R.style.Theme_Small);
        }else if(mode==2){
            context.setTheme(R.style.Theme_Medium);
        }else if(mode==3){
            context.setTheme(R.style.Theme_Large);
        }
    }
    @SuppressWarnings("deprecation")
    public static void initWebData(Context context,WebSettings settings){
        int mode = (Integer)SpUtils.getFontSize(context, "fontSize", -1);
        if(mode == -1 && mode == 1){
            settings.setTextSize(TextSize.NORMAL);
        }else if(mode == 2){
            settings.setTextSize(TextSize.LARGER);
        }else if(mode == 3){
            settings.setTextSize(TextSize.LARGEST);
        }
    }
}
