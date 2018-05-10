package com.nqt.tournote;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by USER on 5/2/2018.
 */

public class MainActivity  extends AppCompatActivity {
    private static final  String TAG="TourNote_Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Debug");
        Log.i(TAG, "onCreate: Information");
        Log.e(TAG, "onCreate: Error");
        Log.w(TAG, "onCreate: Warning" );
        Log.d(TAG, "onCreate() returned: " + 0);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");

//        throw new RuntimeException("Crash here");
    }
}
