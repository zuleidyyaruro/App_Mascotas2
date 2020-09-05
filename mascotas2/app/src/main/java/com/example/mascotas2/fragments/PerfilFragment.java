package com.example.mascotas2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mascotas2.pojo.Mascotas;
import com.example.mascotas2.R;
import com.example.mascotas2.adapter.FotosAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView rvFotosPerfil;
    public FotosAdapter adaptador;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        rvFotosPerfil = (RecyclerView) v.findViewById(R.id.rvFotosPerfil);

        GridLayoutManager glm = new GridLayoutManager(getContext(), 3);

        rvFotosPerfil.setLayoutManager(glm);

        inicializarListaFotos();
        inicializarAdaptadorFotos();

        return v;
    }

    public void inicializarAdaptadorFotos() {
        adaptador = new FotosAdapter(mascotas, getActivity());

        rvFotosPerfil.setAdapter(adaptador);
    }

    public void inicializarListaFotos() {
        mascotas = new ArrayList<Mascotas>();


        mascotas.add(new Mascotas(R.drawable.belgian_shepherd,"3"));
        mascotas.add(new Mascotas(R.drawable.briard,"1"));
        mascotas.add(new Mascotas(R.drawable.bull_terrier,"8"));
        mascotas.add(new Mascotas(R.drawable.belgian_laekenois,"4"));
        mascotas.add(new Mascotas(R.drawable.beagle,"4"));
        mascotas.add(new Mascotas(R.drawable.chinese_crested,"4"));
        mascotas.add(new Mascotas(R.drawable.bulldog,"4"));
        mascotas.add(new Mascotas(R.drawable.boxer,"4"));
        mascotas.add(new Mascotas(R.drawable.chinese_crested,"4"));
        mascotas.add(new Mascotas(R.drawable.bulldog,"4"));
        mascotas.add(new Mascotas(R.drawable.boxer,"4"));
        mascotas.add(new Mascotas(R.drawable.chinese_crested,"4"));
    }
}