package com.example.lifecycleaware;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class DemoLifeCycles implements LifecycleObserver {

    String activityName;
    public static final String TAG = "State is";


    public DemoLifeCycles(String activityName) {
        this.activityName = activityName;
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected void onCreate() {

        Log.i(TAG,  " onCreate: ****** " + activityName);

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    protected void onStart() {

        Log.i(TAG, " onStart: ****** " + activityName);


    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    protected void onPause() {

        Log.i(TAG, " onPause: ****** " + activityName);


    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    protected void onResume() {

        Log.i(TAG, " onResume: ****** " + activityName);


    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    protected void onStop() {

        Log.i(TAG, " onStop: ****** " + activityName);



    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected void onDestroy() {

        Log.i(TAG, " onDestroy: ****** " + activityName);


    }







}
