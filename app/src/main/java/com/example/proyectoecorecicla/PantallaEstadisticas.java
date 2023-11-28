package com.example.proyectoecorecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.proyectoecorecicla.models.Registroreciclaje;
import com.example.proyectoecorecicla.models.Usuario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class PantallaEstadisticas extends AppCompatActivity {
    Intent receive= getIntent();
    String id= receive.getStringExtra("idusuario");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_estadisticas);
    }

}