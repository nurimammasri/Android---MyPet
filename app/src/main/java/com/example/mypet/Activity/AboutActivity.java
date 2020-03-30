package com.example.mypet.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mypet.R;

public class AboutActivity extends AppCompatActivity {

    TextView name, email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String metropolis = "metropolis.otf";
        Typeface font_metropolis = Typeface.createFromAsset(getAssets(), metropolis);

        email = findViewById(R.id.tv_about_email);
        name = findViewById(R.id.tv_about_name);

        email.setTypeface(font_metropolis);
        name.setTypeface(font_metropolis);


    }
}
