package com.blurt.blurt;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashBlurtActivity extends AppCompatActivity {
    int DELAY = 5000;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_blurt);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashBlurtActivity.this, LoginBlurtActivity.class);
                startActivity(intent);
            }
        }, DELAY);
    }


}
