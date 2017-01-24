package com.ljc.sensortest.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by ljc on 2017/1/24 0024.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
