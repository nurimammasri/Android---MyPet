package com.example.mypet.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mypet.R;

public class ItemRowBuah extends AppCompatActivity {
    TextView judul, keterangan;
    Button More, Favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_view);

        judul = findViewById(R.id.judul);
        keterangan = findViewById(R.id.keterangan);
        More = findViewById(R.id.more);
        Favorite = findViewById(R.id.favorite);

        //Buat Text format
        String metropolis = "metropolis.otf";
        Typeface font_metropolis = Typeface.createFromAsset(getAssets(), metropolis);

        judul.setTypeface(font_metropolis);
        keterangan.setTypeface(font_metropolis);
        More.setTypeface(font_metropolis);
        Favorite.setTypeface(font_metropolis);
    }


}
