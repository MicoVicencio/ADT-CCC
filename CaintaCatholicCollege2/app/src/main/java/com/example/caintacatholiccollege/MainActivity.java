package com.example.caintacatholiccollege;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Handler handler;
    private int currentPage = 0; // Track the current page
    private Runnable runnable;
    private final int delay = 3000; // Delay for auto-slide (3 seconds)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this is your layout file

        // Initialize the ViewPager
        viewPager = findViewById(R.id.viewPager);

        // Check if ViewPager is null
        if (viewPager == null) {
            Log.e("MainActivity", "ViewPager is null");
            return; // Exit the method if ViewPager is null
        }

        // Array of image resources
        int[] images = {
                R.drawable.bscs,
                R.drawable.abreed,
                R.drawable.bsoa,
                R.drawable.bsed,
                R.drawable.bsba,
                R.drawable.ad3,
                R.drawable.ad4,
                R.drawable.ad5,
                R.drawable.ad6,

        };

        // Create and set the adapter
        ImageSliderAdapter adapter = new ImageSliderAdapter(this, images);
        viewPager.setAdapter(adapter); // This line should not be null

        // Initialize the Handler and Runnable for auto-sliding
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (currentPage == images.length) {
                    currentPage = 0; // Reset to the first page if at the end
                }
                viewPager.setCurrentItem(currentPage++, true); // Change to the next page
                handler.postDelayed(this, delay); // Schedule the next slide
            }
        };
        handler.postDelayed(runnable, delay); // Start the auto-slide

        // Initialize CardViews
        CardView cardView1 = findViewById(R.id.cardView1);
        CardView cardView2 = findViewById(R.id.cardView2);
        CardView cardView3 = findViewById(R.id.cardView3);
        CardView cardView4 = findViewById(R.id.cardView4);
        CardView cardView5 = findViewById(R.id.cardView5);

        // Set OnClickListener for CardView 1 (Admission)
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adintent = new Intent(MainActivity.this, admission.class);
                startActivity(adintent);
            }
        });

        // Set OnClickListener for CardView 3 (Academics)
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acaintent = new Intent(MainActivity.this, academics.class);
                startActivity(acaintent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(MainActivity.this, about.class);
                startActivity(about);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact = new Intent(MainActivity.this, contact.class);
                startActivity(contact);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent master = new Intent(MainActivity.this, master.class);
                startActivity(master);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove callbacks to prevent memory leaks
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
