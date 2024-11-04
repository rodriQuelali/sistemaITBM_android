package com.example.sistemaitbm_reg.buttonNavigation;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.sistemaitbm_reg.R;
import com.example.sistemaitbm_reg.iu_carrera.ListaCarreraFragment;
import com.example.sistemaitbm_reg.iu_carrera.registro_carrera;

public class BottomNavigationListener {

    public static void onClick(Context context, int num, FragmentManager fragmentManager) {
        Fragment registroCarr, listaCarreraFragments;
        switch (num) {
            case R.id.navigation_home:
                listaCarreraFragments = new ListaCarreraFragment();
                fragmentManager.beginTransaction().replace(R.id.frameLayout, listaCarreraFragments).commit();
                break;
            case R.id.navigation_dashboard:
                registroCarr = new registro_carrera();
                fragmentManager.beginTransaction().replace(R.id.frameLayout, registroCarr).commit();
                break;
            case R.id.navigation_settings:
                // Execute settings action
                break;
        }
    }

}
