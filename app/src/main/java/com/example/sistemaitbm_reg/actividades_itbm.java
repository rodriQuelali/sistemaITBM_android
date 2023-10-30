package com.example.sistemaitbm_reg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.sistemaitbm_reg.buttonNavigation.BottomNavigationListener;
import com.example.sistemaitbm_reg.iu_carrera.ListaCarreraFragment;
import com.example.sistemaitbm_reg.Models.Carrera;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class actividades_itbm extends AppCompatActivity {

    //fragments
    FragmentTransaction transCarrera;
    Fragment registroCarr, listaCarreraFragments;
    private FragmentManager fragmentManager;
    private BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades_itbm);

        fragmentManager = getSupportFragmentManager();
        //intanaciamos fragments
        registroCarr = new registro_carrera();
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, registroCarr).commit();


        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                BottomNavigationListener.onClick(actividades_itbm.this, item.getItemId(), fragmentManager);
                /*switch (item.getItemId()) {
                    case R.id.navigation_home:
                        // Código para el item "Inicio"
                        Toast.makeText(actividades_itbm.this, "holaaaa" + item + R.id.navigation_home, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_dashboard:
                        // Código para el item "Dashboard"
                        Toast.makeText(actividades_itbm.this, "holaaaa 22" + item, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_settings:
                        // Código para el item "Configuraciones"
                        Toast.makeText(actividades_itbm.this, "holaaaa 333" + item.getItemId(), Toast.LENGTH_SHORT).show();
                        break;
                }*/
                return false;
            }
        });
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