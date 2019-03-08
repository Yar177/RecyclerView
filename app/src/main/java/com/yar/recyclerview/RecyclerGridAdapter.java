package com.yar.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerGridAdapter extends RecyclerView.Adapter<RecyclerGridAdapter.GridViewHolder> {

    private int[] images;

    public RecyclerGridAdapter(int[] images) {
        this.images = images;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_layout, viewGroup, false);

        GridViewHolder gridViewHolder = new GridViewHolder(view);

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

    public static class GridViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivAlbum);
            textView = imageView.findViewById(R.id.tvAmbumTitle);
        }
    }


}
