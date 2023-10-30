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
    Intent pasarpa= new Intent(getApplicationContext(),PantallaEstadisticas.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallacategorias);
        Button boton1 = findViewById(R.id.Registrarresic);
        Button boton2 = findViewById(R.id.Btnatrascatego);

boton1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(pasarpa);
    }
});

    }



}