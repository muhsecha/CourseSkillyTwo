package com.example.skillycoursetwo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skillycoursetwo.Model.ModelOrang;
import com.example.skillycoursetwo.R;

import java.util.ArrayList;

public class AdapterOrang extends RecyclerView.Adapter<AdapterOrang.OrangViewHolder> {

    private ArrayList<ModelOrang> datalist;

    public AdapterOrang(ArrayList<ModelOrang> datalist) {
        this.datalist = datalist;
    }

    @Override
    public AdapterOrang.OrangViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_orang, parent, false);
        return new OrangViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AdapterOrang.OrangViewHolder holder, int position) {
        holder.nama.setText(datalist.get(position).getNama());
        holder.umur.setText(datalist.get(position).getUmur());
        holder.gender.setText(datalist.get(position).getGender());
    }

    @Override
    public int getItemCount() {
       return  (datalist != null) ? datalist.size() : 0;
    }

    public class OrangViewHolder extends RecyclerView.ViewHolder {
        TextView nama,umur,gender;

        public OrangViewHolder( View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tvnama);
            umur = itemView.findViewById(R.id.tvumur);
            gender = itemView.findViewById(R.id.tvgender);
        }
    }
}
