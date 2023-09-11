package com.example.sistemaitbm_reg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sistemaitbm_reg.adapter.listaCarreras;
import com.example.sistemaitbm_reg.persona.Carrera;

import java.util.ArrayList;
import java.util.List;

public class actividades_itbm extends AppCompatActivity {

    String [] listAct = {"Sistemas Informaticos", "Mecanica Automotriz", "Electricidad Industrial", "Contruccion Civil", "Redes gas y Soldadura en Ductos"};

    ArrayList<Carrera> listaCarrera;

    RecyclerView lisN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades_itbm);

        lisN = (RecyclerView) findViewById(R.id.listaN);
        lisN.setLayoutManager(new LinearLayoutManager(this));



        listaCarrera = new ArrayList<>();
        listaCarrera.add(new Carrera("Sistemas Informaticos","s","ANUAL", 0));
        listaCarrera.add(new Carrera("Sistemas Informaticos","s","ANUAL", 0));
        listaCarrera.add(new Carrera("Sistemas Informaticos","s","ANUAL", 0));
        listaCarrera.add(new Carrera("Sistemas Informaticos","s","ANUAL", 0));
        listaCarrera.add(new Carrera("Sistemas Informaticos","s","ANUAL", 0));
        listaCarrera.add(new Carrera("Sistemas Informaticos","s","ANUAL", 0));
        listaCarrera.add(new Carrera("Sistemas Informaticos","s","ANUAL", 0));

        listaCarreras adapter = new listaCarreras(listaCarrera);
        lisN.setAdapter(adapter);




    }
}