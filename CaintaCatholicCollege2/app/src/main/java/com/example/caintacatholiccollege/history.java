package com.example.caintacatholiccollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class history extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);

        // Find the back button ImageView
        ImageView backButton = findViewById(R.id.backButton);

        // Set onClickListener to navigate back to the about class
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(history.this, about.class);
                startActivity(intent);
                finish(); // Optional: Call finish() if you don't want to keep the history activity in the back stack
            }
        });
    }
}
