package com.yar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullResView extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_res_view);



        imageView = (ImageView) findViewById(R.id.ivFullRes);
        imageView.setImageResource(getIntent().getIntExtra("imageId", R.drawable.p1));

    }
}
