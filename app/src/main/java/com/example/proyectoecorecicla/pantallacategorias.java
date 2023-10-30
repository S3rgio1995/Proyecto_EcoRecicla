package com.example.proyectoecorecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;

public class pantallacategorias extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent pasarpa2= new Intent(getApplicationContext(),PantallaEstadisticas.class);
        setContentView(R.layout.activity_pantallacategorias);
        Button boton1 = findViewById(R.id.Registrarresic);
        Button boton2 = findViewById(R.id.Btnatrascatego);

boton1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        startActivity(pasarpa2);
    }
});

    }



}