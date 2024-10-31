package com.example.caintacatholiccollege;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageSliderAdapter extends PagerAdapter {
    private final int[] imageResources;
    private final LayoutInflater inflater;

    public ImageSliderAdapter(Context context, int[] imageResources) {
        this.inflater = LayoutInflater.from(context);
        this.imageResources = imageResources;
    }

    @Override
    public int getCount() {
        return imageResources.length; // Number of images
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object; // Check if the view is associated with the key object
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.viewpager_item, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(imageResources[position]);

        // Add the view to the container
        container.addView(view);
        return view; // Return the view for the current position
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // Remove the view from the container
        container.removeView((View) object);
    }
}
