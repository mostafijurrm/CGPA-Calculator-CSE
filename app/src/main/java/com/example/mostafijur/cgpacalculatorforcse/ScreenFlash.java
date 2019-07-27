package com.example.mostafijur.cgpacalculatorforcse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ScreenFlash extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_flash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(ScreenFlash.this,Home.class);
                ScreenFlash.this.startActivity(mainIntent);
                ScreenFlash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
