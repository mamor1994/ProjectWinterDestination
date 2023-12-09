package com.example.projectandroid2_mppl2205;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class River extends AppCompatActivity {

    String textToSave = "The Vltava River Cruise is one of the best ways to enjoy the Old Town’s beauty. This cruise is perfect for people of all ages. \n\n You can enjoy the cruise at night or by day. The nighttime cruise is perfect for people who want to see the city lit up by the Christmas lights. It’s also an excellent opportunity to capture some amazing pictures of the Old Town and listen to live music on board. \n\n On the other hand, the daytime cruise is perfect for people who want to see the city’s beauty from a different angle. It’s also an excellent opportunity to see the city from the water. \n\n The boat takes you through the city’s major attractions, including Prague Castle, the Charles Bridge, and the Lesser Town Bridge Tower. So, why not try the cruise?";

    SharedPreferences preferences;

    private TextView textRiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_river);

        preferences = getSharedPreferences("com.amor.egrasia2", MODE_PRIVATE);
        String savedText = preferences.getString("savedText", textToSave);
        textRiver = findViewById(R.id.textRiver);
        textRiver.setText(savedText);
    }

    public void onBackButtonClick(View view) {
        onBackPressed();
    }

}