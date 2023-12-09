package com.example.projectandroid2_mppl2205;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Trams extends AppCompatActivity {

    String textToSave = "Visiting a Christmas Market is one way to celebrate the holiday season. But if you want to make the most of the season, you should also hop onto the Christmas trams. \n\n Prague’s Public Transit Authority runs Christmas trams from November to the first week of January. The Christmas trams are decorated to celebrate the season. \n\n You will find many Christmas trees on the trams and festive ornaments. They make a couple of stops along the way, and you can stay on for a short time or hop off at any stop. \n\n If you want a scenic route, you should catch Lines 42 and 43. They will bring you to the city’s most important landmarks. Hop aboard!";

    SharedPreferences preferences;

    private TextView textTrams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trams);

        preferences = getSharedPreferences("com.amor.egrasia2", MODE_PRIVATE);
        String savedText = preferences.getString("savedText", textToSave);
        textTrams = findViewById(R.id.textTrams);
        textTrams.setText(savedText);
    }

    public void onBackButtonClick(View view) {
        onBackPressed();
    }
}