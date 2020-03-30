package com.example.mypet.Adapter;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mypet.Activity.MoreDetailPets;
import com.example.mypet.Model.Pet;
import com.example.mypet.R;

import java.util.ArrayList;


public class ListPetAdapter extends RecyclerView.Adapter<ListPetAdapter.ListViewHolder> {

    private ArrayList<Pet> listPet;
    public ListPetAdapter(ArrayList<Pet> list) {
        this.listPet = list;
    }
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Pet data);
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_view, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Pet Pet = listPet.get(position);

        Glide.with(holder.itemView.getContext())
                .load(Pet.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(Pet.getNamePet());

        holder.tvDetail.setText(Pet.getDescription());

        holder.tvRating.setText(Pet.getRating());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPet.get(holder.getAdapterPosition()));

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailPets.class);

                goToDetail.putExtra("FOTO", Pet.getPhoto());
                goToDetail.putExtra("NAMA_HEWAN", Pet.getNamePet());
                goToDetail.putExtra("ABOUT", Pet.getBioPet());
                goToDetail.putExtra("DESKRIPSI", Pet.getDescription());
                goToDetail.putExtra("RATING", Pet.getRating());

                v.getContext().startActivity(goToDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPet.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvRating;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_pet);
            tvName = itemView.findViewById(R.id.title);
            tvDetail = itemView.findViewById(R.id.description);
            tvRating = itemView.findViewById(R.id.rating);
        }
    }
}
