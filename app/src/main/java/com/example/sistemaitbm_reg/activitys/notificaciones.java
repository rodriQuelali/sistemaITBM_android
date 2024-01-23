package com.example.sistemaitbm_reg.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.sistemaitbm_reg.R;
import com.example.sistemaitbm_reg.iu_notificaciones.listNotifications;

public class notificaciones extends AppCompatActivity {

    private Fragment fregmentNoti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);

        fregmentNoti = new listNotifications();
        getSupportFragmentManager().beginTransaction().add(R.id.frametNotification, fregmentNoti).commit();

    }
}