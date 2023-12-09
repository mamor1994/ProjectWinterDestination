package com.example.projectandroid2_mppl2205;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SkiPark extends AppCompatActivity {

    String textToSave = "When it comes to winter activities, cross-country skiing is one of the most popular. This is not only a great workout, but it is also a great way to explore the city. \n\n If you’re looking for a place to cross-country ski, SkiPark Praha is the perfect destination. There, you will find skis, boots, and other equipment you need. You can even rent all the equipment and enjoy cross-country skiing without bringing it along. \n\n SkiPark Praha is perfect for all levels. It features a series of trails, so you can choose the one that suits you best. All courses are marked and well-maintained, and they are all illuminated. Try cross-country skiing now!";

    SharedPreferences preferences;

    private TextView textSkiPark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ski_park);

        preferences = getSharedPreferences("com.amor.egrasia2", MODE_PRIVATE);
        String savedText = preferences.getString("savedText", textToSave);
        textSkiPark = findViewById(R.id.textSkiPark);
        textSkiPark.setText(savedText);
    }

    public void onBackButtonClick(View view) {
        onBackPressed();
    }

}