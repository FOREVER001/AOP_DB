package com.tianzhuan.aop_db;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * 自定义Application
 */
public class BaseApplication extends Application {
    public static final String TAG="BaseApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        //谷歌工程师已经做了AOP的思想
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Log.e(TAG,activity.getComponentName().getClassName()+"created");
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                Log.e(TAG,activity.getComponentName().getClassName()+"destroyed");
            }
        });
    }
}
