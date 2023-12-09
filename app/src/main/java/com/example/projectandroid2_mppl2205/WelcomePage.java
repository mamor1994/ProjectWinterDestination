package com.example.projectandroid2_mppl2205;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        int delay = 4000;

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(WelcomePage.this, MenuPage.class);
            startActivity(intent);
            finish();
        }, delay);
    }
}