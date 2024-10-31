package com.example.caintacatholiccollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class about extends AppCompatActivity {
    private CardView cardView1, cardView2, cardView3, cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);

        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, history.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, missionVision.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, recognition.class);
                startActivity(intent);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, facilities.class);
                startActivity(intent);
            }
        });
        ImageView backButton = findViewById(R.id.backButton);

        // Set onClickListener to navigate back to the about class
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: Call finish() if you don't want to keep the history activity in the back stack
            }
        });
    }
}
