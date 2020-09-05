package com.example.mascotas2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotas2.pojo.Mascotas;
import com.example.mascotas2.R;
import com.example.mascotas2.adapter.AdaptadorMascotas;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascotas> listaMascotas;
    RecyclerView recyclerPersonajes;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v=inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas=new ArrayList<>();
        recyclerPersonajes=(RecyclerView) v.findViewById(R.id.rvMascotas);

        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(getActivity()));

        llenarMascotas();
        AdaptadorMascotas adaptador=new AdaptadorMascotas(listaMascotas);

        recyclerPersonajes.setAdapter(adaptador);


        return v;
    }

    private void llenarMascotas(){

        listaMascotas.add(new Mascotas(R.drawable.afghan_hound, "Afghan", "5"));
        listaMascotas.add(new Mascotas(R.drawable.akita, "Akita", "5"));
        listaMascotas.add(new Mascotas(R.drawable.beagle, "Beagle", "5"));

        listaMascotas.add(new Mascotas(R.drawable.bergamasco, "Bergamasco", "5"));
        listaMascotas.add(new Mascotas(R.drawable.bichon_frise, "Bichon Frise", "10"));
        listaMascotas.add(new Mascotas(R.drawable.border_collie, "Border Collie", "5"));
        listaMascotas.add(new Mascotas(R.drawable.boxer, "Boxer", "5"));

        listaMascotas.add(new Mascotas(R.drawable.briard, "Briard", "20"));
        listaMascotas.add(new Mascotas(R.drawable.bull_terrier, "Bull Terrier", "19"));
        listaMascotas.add(new Mascotas(R.drawable.bulldog, "Bulldog", "17"));
        listaMascotas.add(new Mascotas(R.drawable.chihuahua, "Chihuahua", "15"));

    }
}
