package com.example.projectandroid2_mppl2205;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Castle extends AppCompatActivity {

    String textToSave = "Prague Castle is one of the most iconic spots in the city, and it is also one of the most beautiful. \n\n This place is a tourist attraction, and locals don’t hesitate to visit it quite often. \n\n However, the advantage of going in the winter is that you’ll often encounter shorter lines. \n\n You can visit the Prague Castle grounds free of charge. At the same time, you can gain access to the grounds by paying an entrance fee. \n\n The Castle has a lot of impressive attractions. \n\n You can visit the museum, take some fantastic pictures at the Old Royal Palace, or check out one of the towers on top of the hill.";

    SharedPreferences preferences;

    private TextView textCastle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castle);

        preferences = getSharedPreferences("com.amor.egrasia2", MODE_PRIVATE);
        String savedText = preferences.getString("savedText", textToSave);
        textCastle = findViewById(R.id.textCastle);
        textCastle.setText(savedText);
    }

    public void onBackButtonClick(View view) {
        onBackPressed();
    }
}