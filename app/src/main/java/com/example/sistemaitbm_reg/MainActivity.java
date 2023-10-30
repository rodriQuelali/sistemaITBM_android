package com.example.sistemaitbm_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sistemaitbm_reg.activitys.inicio;

public class MainActivity extends AppCompatActivity {



    private Button btnIni;
    private CheckBox chechCont;
    private EditText txtUser, txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clasR();
        eventBoton();

    }

    private void clasR (){
        btnIni = (Button) findViewById(R.id.btnI);
        chechCont = (CheckBox) findViewById(R.id.checkBox);
        txtUser = (EditText) findViewById(R.id.txtUsuarioLogin);
        txtPass = (EditText) findViewById(R.id.txtContraLogin);
    }

    private void eventBoton(){
        btnIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("dataIBTBM", Context.MODE_PRIVATE);
                String txtUserPrefe = txtUser.getText().toString();
                String txtPassPrefe = txtPass.getText().toString();
                String c = sharedPreferences.getString("usuario", "");
                String d = sharedPreferences.getString("password", "");
                if(sharedPreferences.getAll().isEmpty()){

                    if(txtUserPrefe.equals("admin") && txtPassPrefe.equals("admin2023")){
                        if(chechCont.isChecked() == true){
                            //SharedPreferences sharedPreferences = getSharedPreferences("dataIBTBM", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString("usuario", txtUser.getText().toString());
                            editor.putString("password", txtPass.getText().toString());
                            editor.commit();
                            Toast.makeText(MainActivity.this, "Se guardo los datos, sha", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(MainActivity.this, inicio.class);
                            startActivity(i);
                        }else{

                            Intent i = new Intent(MainActivity.this, inicio.class);
                            startActivity(i);
                            txtUser.setText("");
                            txtPass.setText("");
                        }
                    }else {
                        Toast.makeText(MainActivity.this, "Usuario Y contraseña Incorrecta", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    if(txtUserPrefe.equals(c) && txtPassPrefe.equals(d)) {

                        Toast.makeText(MainActivity.this, c + d, Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, inicio.class);
                        startActivity(i);

                    }else {
                        Toast.makeText(MainActivity.this, c + d, Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, "Usuario Y contraseña Incorrecta-Sharprefence", Toast.LENGTH_SHORT).show();
                        }
                }


            }
        });
    }
    private void shareContra(){

    }
}