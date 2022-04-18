package edu.uw.tcss450.blynch99.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;

// Ilya Kozorezov was here on April 18 2022

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Debug log.");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e(TAG, "Error log.");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.v(TAG, "Verbose log.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "Info log.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.w(TAG, "Warning log.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.wtf(TAG, "WTF log.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Debug log.");
    }
}
