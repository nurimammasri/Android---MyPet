package com.example.mypet.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mypet.R;

public class CardView extends AppCompatActivity {

    ImageView imgPets;
    TextView tvTitle, tvDescription, tvRating;
    Button btnMore, btnFavorite;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_card_view);


        String metropolis = "metropolis.otf";
        Typeface font_metropolis = Typeface.createFromAsset(getAssets(), metropolis);


        imgPets = findViewById(R.id.image_pet);
        tvTitle = findViewById(R.id.title);
        tvDescription = findViewById(R.id.description);
        btnMore = findViewById(R.id.more);
        btnFavorite = findViewById(R.id.favorite);
        tvRating = findViewById(R.id.rating);

        tvTitle.setTypeface(font_metropolis);
        tvDescription.setTypeface(font_metropolis);
        tvRating.setTypeface(font_metropolis);
        btnFavorite.setTypeface(font_metropolis);
        btnMore.setTypeface(font_metropolis);

    }
}