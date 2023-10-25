package com.example.proyectoecorecicla;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
public class Pantalla_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_login);

        TextView registro = findViewById(R.id.labelregis);
        CardView registarg = findViewById(R.id.Registroc);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registarg.setVisibility(View.VISIBLE);
            }
        });
    }

}