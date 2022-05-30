package com.springmaple.learn_hilt;

import androidx.multidex.MultiDexApplication;

import dagger.hilt.android.HiltAndroidApp;

// Tips:
// All apps using Hilt must contain an Application class annotated with @HiltAndroidApp.
@HiltAndroidApp
public class HiltApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        // Tips:
        // Applications are members injected as well.
        // This means you can use injected fields in the Application after
        // super.onCreate() has been called.
    }
}
