package com.example.mypet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypet.Adapter.CardViewPetAdapter;
import com.example.mypet.Model.Pet;
import com.example.mypet.Model.PetData;
import com.example.mypet.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String title = "Mode List";
    //untuk deklarasi recycler view
    private RecyclerView rvPets;
    private ArrayList<Pet> list = new  ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvPets = findViewById(R.id.rv_list_item);
        rvPets.setHasFixedSize(true);

        list.addAll(PetData.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvPets.setLayoutManager(new LinearLayoutManager(this));
        CardViewPetAdapter cardViewPetAdapter = new CardViewPetAdapter(list);
        rvPets.setAdapter(cardViewPetAdapter);

        cardViewPetAdapter.setOnItemClickCallback(new CardViewPetAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Pet data) {
                showSelectedPet(data);
            }
        });
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedPet(Pet Pet) {
        Toast.makeText(this, "Kamu memilih " + Pet.getNamaHewan(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        if (selectedMode == R.id.menu_about) {
            Intent goToAbout = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(goToAbout);
        }
    }
}
