package com.yar.recyclerview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerGridAdapter extends RecyclerView.Adapter<RecyclerGridAdapter.GridViewHolder> {

    private int[] images;

    public RecyclerGridAdapter(int[] images) {
        this.images = images;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_layout, viewGroup, false);

        GridViewHolder gridViewHolder = new GridViewHolder(view, images);

        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder viewHolder, int i) {
        int imageId = images[i];
        viewHolder.imageView.setImageResource(imageId);
        viewHolder.textView.setText("Image: - " + i);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }



    public static class GridViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;
        ImageView imageView;
        int[] images;
        public GridViewHolder(@NonNull View itemView, int[] images) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivAlbum);
            textView = itemView.findViewById(R.id.tvAmbumTitle);
            itemView.setOnClickListener(this);
            this.images = images;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(itemView.getContext(), textView.getText().toString(), Toast.LENGTH_LONG).show();

            Intent intent = new Intent(imageView.getContext(), FullResView.class);
            intent.putExtra("imageId", images[getAdapterPosition()]);
            itemView.getContext().startActivity(intent);
        }
    }


}
