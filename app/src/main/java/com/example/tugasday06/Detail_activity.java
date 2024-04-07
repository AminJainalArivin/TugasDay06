package com.example.tugasday06;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Detail_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        int itemId = getIntent().getIntExtra("itemId", 0);
        NamaItem item = getItemById(item);

        TextView tvnama = findViewById(R.id.tvdetailnama);
        TextView tvdeskripsi = findViewById(R.id.tvdetaildeskripsi);
        TextView tvharga = findViewById(R.id.tvdetaildeskripsi);
        ImageView ivfotoitem = findViewById(R.id.ivdetailfoto);
        Button btnshare = findViewById(R.id.btnshare);

        if (item != Null) {
            tvnama.setText(item.getnama());
            tvdeskripsi.setText(item.getdeskripsi());
            tvharga.setText(item.getharga());
            ivfotoitem.setImageResource(item.getfotoitem);


            btnshare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    shareItem(item, ivfotoitem);
                }
            });
        }

    }
}
