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

public class GridPetAdapter extends RecyclerView.Adapter<GridPetAdapter.GridViewHolder> {
    private ArrayList<Pet> listPet;

    public GridPetAdapter(ArrayList<Pet> list) {
        this.listPet = list;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Pet data);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_view, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        final Pet Pet = listPet.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listPet.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvRating.setText(Pet.getRating());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPet.get(holder.getAdapterPosition()));

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailPets.class);
                goToDetail.putExtra("FOTO", Pet.getPhoto());
                goToDetail.putExtra("NAMA_BUAH", Pet.getNamaHewan());
                goToDetail.putExtra("ABOUT", Pet.getMoreDetailHewan());
                goToDetail.putExtra("DESKRIPSI", Pet.getDetail());
                goToDetail.putExtra("RATING", Pet.getRating());

                v.getContext().startActivity(goToDetail);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listPet.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvRating;

        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_hewan);
            tvRating = itemView.findViewById(R.id.rating);
        }
    }

}
