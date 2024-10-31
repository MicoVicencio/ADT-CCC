package com.example.caintacatholiccollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class recognition extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Connect to the XML layout file (e.g., activity_admission.xml)
        setContentView(R.layout.recognition);

        ImageView backButton = findViewById(R.id.backButton);

        // Set onClickListener to navigate back to the about class
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(recognition.this, about.class);
                startActivity(intent);
                finish(); // Optional: Call finish() if you don't want to keep the history activity in the back stack
            }
        });
    }
}
