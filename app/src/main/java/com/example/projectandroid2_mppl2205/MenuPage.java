package com.example.projectandroid2_mppl2205;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPage extends AppCompatActivity {
    String textToSave = "If you’re looking for a place to spend the winter months, you should put Prague on top of the list. \n It has one of the coldest winters, and the snow transforms the place like something pulled from a storybook. \n Aside from the beauty, you can enjoy many activities and make lasting memories with your loved ones. \n Here are the top things you can do when you spend your Prague winter vacation. Let’s get to it!";

    SharedPreferences preferences;

    private TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        preferences = getSharedPreferences("com.amor.egrasia2", MODE_PRIVATE);
        String savedText = preferences.getString("savedText", textToSave);
        textViewDescription = findViewById(R.id.textViewDescription);
        textViewDescription.setText(savedText);
    }

    public void go1(View view){
        Intent intent = new Intent(this, MenuPage1.class);
        startActivity(intent);
    }

    public void onBackButtonClick(View view) {
        onBackPressed();
    }

}
