package com.example.proyectoecorecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   // Button iniciarses = findViewById(R.id.iniciobtn);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button iniciarse =findViewById(R.id.inibt);

        Intent pasariniciarsesi= new Intent(getApplicationContext(), Pantalla_login.class);
        iniciarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(pasariniciarsesi);
            }
        });
    }

}