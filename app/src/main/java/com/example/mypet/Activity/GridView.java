package com.example.mypet.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mypet.R;

public class GridView extends AppCompatActivity {

    TextView tvRating;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_grid_view);

        tvRating = findViewById(R.id.rating);

        String metropolis = "metropolis.otf";
        Typeface font_metropolis = Typeface.createFromAsset(getAssets(), metropolis);

        tvRating.setTypeface(font_metropolis);
    }
}
