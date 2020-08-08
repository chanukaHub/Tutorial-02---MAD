package com.chanuka.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate() invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Lifecycle", "onStart() invoked");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.i("Lifecycle", "onRestart() invoked");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Lifecycle", "onPause() invoked");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Lifecycle", "onStop() invoked");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "onDestroy() invoked");
    }
}