package com.example.mascotas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mascotas2.adapter.AdaptadorMascotas;
import com.example.mascotas2.pojo.Mascotas;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascotas> listaMascotas;
    RecyclerView rvMascotasFavoritas;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listaMascotas=new ArrayList<>();
        rvMascotasFavoritas=(RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        mToolbar=findViewById(R.id.main_toolbar2);
        setSupportActionBar(mToolbar);

        rvMascotasFavoritas.setLayoutManager(new LinearLayoutManager(this));

        llenarMascotas();

        AdaptadorMascotas adaptador=new AdaptadorMascotas(listaMascotas);
        rvMascotasFavoritas.setAdapter(adaptador);


        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void llenarMascotas(){

        listaMascotas.add(new Mascotas(R.drawable.briard, "Briard", "20"));
        listaMascotas.add(new Mascotas(R.drawable.bull_terrier, "Bull Terrier", "19"));
        listaMascotas.add(new Mascotas(R.drawable.bulldog, "Bulldog", "17"));
        listaMascotas.add(new Mascotas(R.drawable.chihuahua, "Chihuahua", "15"));
        listaMascotas.add(new Mascotas(R.drawable.bichon_frise, "Bichon Frise", "10"));

    }
}