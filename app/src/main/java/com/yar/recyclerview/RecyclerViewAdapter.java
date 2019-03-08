package com.yar.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private List<String> list;

    public RecyclerViewAdapter(List<String> list){
        this.list = list;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_view_layout, viewGroup, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(textView);


        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder viewHolder, int i) {
        viewHolder.versionName.setText(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView versionName;

        public RecyclerViewHolder(@NonNull TextView itemView) {
            super(itemView);
            versionName = itemView;
        }
    }
}
