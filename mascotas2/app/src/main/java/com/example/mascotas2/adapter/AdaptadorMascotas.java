package com.example.mascotas2.adapter;

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

public class AdaptadorMascotas extends RecyclerView.Adapter<AdaptadorMascotas.ViewHolderMascotas> {

    ArrayList<Mascotas> listaMascotas;

    public AdaptadorMascotas(ArrayList<Mascotas> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @NonNull
    @Override
    public ViewHolderMascotas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_mascotas, null, false);
        return new ViewHolderMascotas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMascotas holder, int position) {

        holder.tvNombreMascota.setText(listaMascotas.get(position).getNombre());
        holder.tvNumero.setText(listaMascotas.get(position).getNumeroLikes());
        holder.imagenMascota.setImageResource(listaMascotas.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaMascotas.size();
    }


    public class ViewHolderMascotas extends RecyclerView.ViewHolder {
        TextView tvNombreMascota;
        TextView tvNumero;
        ImageView imagenMascota;

        public ViewHolderMascotas(@NonNull View itemView) {
            super(itemView);

            tvNombreMascota=(TextView) itemView.findViewById(R.id.tvNombreMascota);
            imagenMascota=(ImageView) itemView.findViewById(R.id.imagenMascota);
            tvNumero=(TextView) itemView.findViewById(R.id.tvNumero);
        }
    }
}
