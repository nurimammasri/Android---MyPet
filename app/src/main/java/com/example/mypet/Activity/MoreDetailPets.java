package com.example.mypet.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mypet.R;

public class MoreDetailPets extends AppCompatActivity {
    ImageView imagePets, ic_favourite;
    TextView title, descPets, bioPets, detailRating;
    Boolean is_favourite = false;
    AppCompatRatingBar RatingBar;
    TextView getRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_detail_pet);

        imagePets= findViewById(R.id.image_pet);
        title = findViewById(R.id.title);
        bioPets = findViewById(R.id.bio);
        descPets = findViewById(R.id.description);
        detailRating = findViewById(R.id.rating);
        ic_favourite = findViewById(R.id.ic_favourite);

        RatingBar = findViewById(R.id.star_rating);
        getRating = findViewById(R.id.rate);

        showDetail();

        ic_favourite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!is_favourite) {
                    is_favourite = true;
                    ic_favourite.setColorFilter(Color.RED);

                    Toast.makeText(view.getContext(), "I Like it", Toast.LENGTH_SHORT).show();
                } else {
                    is_favourite = false;
                    ic_favourite.setColorFilter(Color.BLACK);
                }
            }
        });

        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {

                String textRating = "Rating: "+nilai;
                getRating.setText(textRating);
            }
        });

    }

    private void showDetail() {
        Intent intent = getIntent();

        int photo = intent.getIntExtra("FOTO", 0);
        String tvTitle = intent.getStringExtra("NAMA_HEWAN");
        String about = intent.getStringExtra("ABOUT");
        String description = intent.getStringExtra("DESKRIPSI");
        String rating = intent.getStringExtra("RATING");

        getSupportActionBar().setTitle(tvTitle);
        getSupportActionBar().show();
        title.setText(tvTitle);

        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(imagePets);

        bioPets.setText(about);

        descPets.setText(description);

        detailRating.setText(rating);
    }
}

