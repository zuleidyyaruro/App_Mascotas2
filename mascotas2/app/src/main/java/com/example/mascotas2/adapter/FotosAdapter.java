package com.example.mascotas2.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotas2.pojo.Mascotas;
import com.example.mascotas2.R;

import java.util.ArrayList;

public class FotosAdapter extends RecyclerView.Adapter<FotosAdapter.FotosViewHolder> {
    ArrayList<Mascotas> mascotas;
    Activity activity;

    public FotosAdapter(ArrayList<Mascotas> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public FotosAdapter.FotosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_fotos_mascotas, parent, false);

        return new FotosAdapter.FotosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final FotosAdapter.FotosViewHolder fotosViewHolder, int position) {
        final Mascotas mascota = mascotas.get(position);

        fotosViewHolder.imgFotoMascotaF.setImageResource(mascota.getImagen());
        fotosViewHolder.tvHardsF.setText((mascota.getNumeroLikes()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class FotosViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFotoMascotaF;
        private TextView tvHardsF;

        public FotosViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFotoMascotaF = (ImageView) itemView.findViewById(R.id.imgFotoMascotaF);
            tvHardsF = (TextView) itemView.findViewById(R.id.tvHardsF);
        }
    }
}
