package com.example.sistemaitbm_reg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;



import com.example.sistemaitbm_reg.ui.activitys.inicio;

public class MainActivity extends AppCompatActivity {
    private Button btnIni;
    private CheckBox chechCont;
    private EditText txtUser, txtPass;

    private static final String CHANNEL_ID = "my_channel_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();
        clasR();
        eventBoton();

    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "My Channel";
            String description = "Channel for my notifications";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    private void sendNotification() {
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.carrera) // Reemplaza con tu icono
                .setContentTitle("Notificación")
                .setContentText("¡Hola! Esta es una notificación.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1, builder.build());
    }

    private void clasR (){
        btnIni = (Button) findViewById(R.id.btnRegistroCarrera);
        chechCont = (CheckBox) findViewById(R.id.checkBox);
        txtUser = (EditText) findViewById(R.id.txtUsuarioLogin);
        txtPass = (EditText) findViewById(R.id.txtContraLogin);
    }

    private void eventBoton(){
        btnIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNotification();
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