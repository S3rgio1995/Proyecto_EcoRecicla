package com.example.proyectoecorecicla;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class Pantalla_login extends AppCompatActivity {

    protected void registrar(){

    }
protected Boolean iniciarsesion(String usuario,String Password){


    return null;
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_login);
        TextView registro = findViewById(R.id.labelregis);
        CardView registarg = findViewById(R.id.Registroc);
        Button Iniciars = findViewById(R.id.Loginbt);
        Button cancel = findViewById(R.id.cancelarregistrerbt);
        Intent pasarpag= new Intent(getApplicationContext(),MainActivity.class);
cancel.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
            registarg.setVisibility(View.GONE);

    }
});
        Iniciars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(pasarpag);
            }
        });
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registarg.setVisibility(View.VISIBLE);
            }
        });
    }

}