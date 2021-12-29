package com.adarsh.acivitylifecycleexamplelog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class AcivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acivity);

        Log.d("ActivityA_lifeCycle","In On create");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("ActivityA_lifeCycle","In On Start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityA_lifeCycle","In On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityA_lifeCycle","In On Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityA_lifeCycle","In On Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityA_lifeCycle","In On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityA_lifeCycle","In On destroy");
    }
}