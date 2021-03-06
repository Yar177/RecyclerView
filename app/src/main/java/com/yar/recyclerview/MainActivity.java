package com.yar.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recyclerListView(View view) {
        Intent intent = new Intent(this, RecyclerListView.class);
        startActivity(intent);
    }

    public void recyclerGridView(View view) {
        Intent intent = new Intent(this, RecyclerGridView.class);
        startActivity(intent);
    }
}
