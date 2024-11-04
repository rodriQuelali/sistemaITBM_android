package com.example.sistemaitbm_reg.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.example.sistemaitbm_reg.R;

import java.util.ArrayList;

public class inicio extends AppCompatActivity {


    EditText txt;
    private ArrayList<String> carreras = new ArrayList<>();
    private ArrayAdapter<String> listaCar;
    CardView cardCarrera, cardNotificaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        cargarClassR();
        eventoInicio();

    }
    private void cargarClassR(){
        cardCarrera = (CardView) findViewById(R.id.cardCarrera);
        cardNotificaction = (CardView) findViewById(R.id.cardNotificaiones);
    }

    private void eventoInicio(){
        cardCarrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(inicio.this, actividades_itbm.class);
                startActivity(i);
            }
        });

        cardNotificaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(inicio.this, notificaciones.class);
                startActivity(i);
            }
        });
    }

}