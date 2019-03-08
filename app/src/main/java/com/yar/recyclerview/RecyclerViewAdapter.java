package com.yar.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private List<String> list;

    public RecyclerViewAdapter(List<String> list){
        this.list = list;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView versionName;

        public RecyclerViewHolder(@NonNull TextView itemView) {
            super(itemView);
            versionName = itemView;
        }
    }
}
