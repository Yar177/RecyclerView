package com.yar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerGridView extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images = {
            R.drawable.p2, R.drawable.p1, R.drawable.p2, R.drawable.p1
    };

    private RecyclerView.LayoutManager layoutManager;

    private RecyclerGridAdapter recyclerGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_grid_view);

        recyclerView = findViewById(R.id.recyclerGridView);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        recyclerGridAdapter = new RecyclerGridAdapter(images);

        recyclerView.setAdapter(recyclerGridAdapter);



    }



}
