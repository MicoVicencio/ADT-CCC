package com.example.caintacatholiccollege;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class master extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.master);


        // Set up click listeners for social media icons
        ImageView facebookIcon = findViewById(R.id.facebookIcon);
        ImageView linkedinIcon = findViewById(R.id.linkedinIcon);
        ImageView githubIcon = findViewById(R.id.githubIcon);
        ImageView youtubeIcon = findViewById(R.id.youtubeIcon); // Added YouTube Icon
        ImageView backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(master.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: Call finish() if you don't want to keep the history activity in the back stack
            }
        });

        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Facebook in the default browser
                openWebPage("https://www.facebook.com/profile.php?id=100063607280067");
            }
        });

        linkedinIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://www.linkedin.com/in/mico-vicencio-548747307/"); // Your LinkedIn URL
            }
        });

        githubIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://github.com/MicoVicencio"); // Your GitHub URL
            }
        });

        youtubeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://www.youtube.com/@micovicencio6425"); // Your YouTube link
            }
        });
    }


    private void openWebPage(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
