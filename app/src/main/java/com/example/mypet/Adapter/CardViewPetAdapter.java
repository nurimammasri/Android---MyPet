package com.example.mypet.Adapter;

    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.TextView;
    import android.widget.Toast;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import com.bumptech.glide.Glide;
    import com.bumptech.glide.request.RequestOptions;
    import com.example.mypet.Model.Pet;
    import com.example.mypet.Activity.MoreDetailPets;
    import com.example.mypet.R;

    import java.util.ArrayList;

    import android.content.Intent;

    public class CardViewPetAdapter extends RecyclerView.Adapter<CardViewPetAdapter.CardViewViewHolder> {
        private ArrayList<Pet> listPet;

        public CardViewPetAdapter(ArrayList<Pet> list) {
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
        public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_view, viewGroup, false);
            return new CardViewViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

            final Pet pet = listPet.get(position);

            Glide.with(holder.itemView.getContext())
                    .load(pet.getPhoto())
                    .apply(new RequestOptions().override(350, 550))
                    .into(holder.imgPhoto);

            holder.tvName.setText(pet.getNamePet());
            holder.tvDetail.setText(pet.getDescription());
            holder.tvRating.setText(pet.getRating());

            holder.btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(holder.itemView.getContext(), listPet.get(holder.getAdapterPosition()).getNamePet(), Toast.LENGTH_SHORT).show();

                    Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailPets.class);
                    goToDetail.putExtra("FOTO", pet.getPhoto());
                    goToDetail.putExtra("NAMA_HEWAN", pet.getNamePet());
                    goToDetail.putExtra("ABOUT", pet.getBioPet());
                    goToDetail.putExtra("DESKRIPSI", pet.getDescription());
                    goToDetail.putExtra("RATING", pet.getRating());

                    v.getContext().startActivity(goToDetail);
                }
            });

            holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(holder.itemView.getContext(), listPet.get(holder.getAdapterPosition()).getNamePet()+" telah ditambahkan dalam list Favorite Anda", Toast.LENGTH_SHORT).show();
                }
            });

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickCallback.onItemClicked(listPet.get(holder.getAdapterPosition()));

                    Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailPets.class);
                    goToDetail.putExtra("FOTO", pet.getPhoto());
                    goToDetail.putExtra("NAMA_HEWAN", pet.getNamePet());
                    goToDetail.putExtra("ABOUT", pet.getBioPet());
                    goToDetail.putExtra("DESKRIPSI", pet.getDescription());
                    goToDetail.putExtra("RATING", pet.getRating());

                    v.getContext().startActivity(goToDetail);
                }
            });
        }

        @Override
        public int getItemCount() {
            return listPet.size();
        }

        class CardViewViewHolder extends RecyclerView.ViewHolder {
            ImageView imgPhoto;
            TextView tvName, tvDetail, tvRating;
            Button btnMore, btnFavorite;

            CardViewViewHolder(View itemView) {
                super(itemView);
                imgPhoto = itemView.findViewById(R.id.image_pet);
                tvName = itemView.findViewById(R.id.title);
                tvDetail = itemView.findViewById(R.id.description);
                btnMore = itemView.findViewById(R.id.more);
                btnFavorite = itemView.findViewById(R.id.favorite);
                tvRating = itemView.findViewById(R.id.rating);
            }
        }
    }