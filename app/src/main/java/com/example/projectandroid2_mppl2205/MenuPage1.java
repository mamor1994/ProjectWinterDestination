package com.example.projectandroid2_mppl2205;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
    }

    public void goCastle(View view){
        Intent intent = new Intent(this, Castle.class);
        startActivity(intent);
    }

    public void goRiver(View view){
        Intent intent = new Intent(this, River.class);
        startActivity(intent);
    }
    public void goSkiPark(View view){
        Intent intent = new Intent(this, SkiPark.class);
        startActivity(intent);
    }
    public void goTrams(View view){
        Intent intent = new Intent(this, Trams.class);
        startActivity(intent);
    }

    public void onBackButtonClick(View view) {
        onBackPressed();
    }
}