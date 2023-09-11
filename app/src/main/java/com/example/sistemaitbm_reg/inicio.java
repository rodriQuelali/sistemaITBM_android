package com.example.sistemaitbm_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.sistemaitbm_reg.persona.Persona;

import java.util.ArrayList;

public class inicio extends AppCompatActivity {

    String [] listAct = {"Sistemas Informaticos", "Mecanica Automotriz", "Electricidad Industrial", "Contruccion Civil", "Redes gas y Soldadura en Ductos"};

    ListView lv;
    EditText txt;
    private ArrayList<String> carreras = new ArrayList<>();
    private ArrayAdapter<String> listaCar;

    Persona pedro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        txt = (EditText) findViewById(R.id.txtAgrCar);

        lv = (ListView) findViewById(R.id.lvcar);
        listaCar = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, carreras);
        lv.setAdapter(listaCar);
    }
    public void addListCar (View v){
        carreras.add(txt.getText().toString());
        lv.setAdapter(listaCar);
    }
}