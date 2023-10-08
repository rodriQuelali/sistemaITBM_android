package com.example.sistemaitbm_reg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.sistemaitbm_reg.iu_carrera.ListaCarreraFragment;
import com.example.sistemaitbm_reg.Models.Carrera;

import java.util.ArrayList;

public class actividades_itbm extends AppCompatActivity {

    String [] listAct = {"Sistemas Informaticos", "Mecanica Automotriz", "Electricidad Industrial", "Contruccion Civil", "Redes gas y Soldadura en Ductos"};

    ArrayList<Carrera> listaCarrera;

    //fragments
    FragmentTransaction transCarrera;
    Fragment registroCarr, listaCarreraFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades_itbm);

        //intanaciamos fragments
        registroCarr = new registro_carrera();
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, registroCarr).commit();

    }
    
    public void cListaCarrrea(View v){
        listaCarreraFragments = new ListaCarreraFragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, listaCarreraFragments).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, listaCarreraFragments).commit();
    }

    public void carreraRegistro(View v){
        registroCarr = new registro_carrera();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, registroCarr).commit();
    }
}