package com.example.proyecto_2_grupo_6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Bienvenido1Fragment extends Fragment {

    Button botonSiguiente;
    NavController navController;
    public Bienvenido1Fragment() {
        // Required empty public constructor
    }

    public static Bienvenido1Fragment newInstance(String param1, String param2) {
        Bienvenido1Fragment fragment = new Bienvenido1Fragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1_bienvenida, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        botonSiguiente = view.findViewById(R.id.botonSiguiente);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_onboarding1Fragment_to_integrantes);
            }
        });
    }
}