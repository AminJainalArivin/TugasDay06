package com.example.tugasday06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdapterBuah extends RecyclerView.Adapter<AdapterBuah.ViewHolder> {

    private ArrayList<NamaBarang> namaBarang;

    @NonNull
    @Override
    public AdapterBuah.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBuah.ViewHolder holder, int position) {
        holder.tvnama.setText(NamaBarang.get(position).getNama());
        holder.tvdeskripsi.setText(NamaBarang.get(position).getDeskripsi());
        holder.tvharga.setText(NamaBarang.get(position).getHarga());
        holder.ivfotoitem.setImageResource(NamaBarang.get(position).getFotoitem());
    }

    @Override
    public int getItemCount() {
        return NamaBarang.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvnama, tvdeskripsi, tvharga;
        ImageView ivfotoitem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvnama=itemView.findViewById(R.id.tvnama);
            tvdeskripsi=itemView.findViewById(R.id.tvdeskripsi);
            tvharga=itemView.findViewById(R.id.tvharga);
            ivfotoitem=itemView.findViewById(R.id.ivfotoitem);
        }
    }
}
