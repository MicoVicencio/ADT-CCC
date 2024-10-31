package com.example.caintacatholiccollege;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class admission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admission);

        // Find the CardView by its ID
        CardView cardView1 = findViewById(R.id.cardView1);

        // Set an OnClickListener to open the URL
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the URL in a browser
                String url = "https://www.facebook.com/@caintacatholiccollege.official";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        ImageView backButton = findViewById(R.id.backButton);

        // Set onClickListener to navigate back to the about class
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admission.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: Call finish() if you don't want to keep the history activity in the back stack
            }
        });
    }
}
