package com.example.proyectoecorecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantallaprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaprincipal);
        Button pantcatego, pantrecomen, pantestad, panregiselem;
        pantestad =findViewById(R.id.btnestadisp);
        panregiselem = findViewById(R.id.Registelembt);
        pantcatego = findViewById(R.id.pantcategobt);
        pantcatego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasarpa1= new Intent(getApplicationContext(), pantallacategorias.class);
                startActivity(pasarpa1);
            }
        });
        pantrecomen = findViewById(R.id.pantrecomenbt);
    pantrecomen.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent pasarpa2= new Intent(getApplicationContext(), Pantallaconsejos.class);
            startActivity(pasarpa2);
        }
    });
pantestad.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent pasarpa3= new Intent(getApplicationContext(), PantallaEstadisticas.class);
        startActivity(pasarpa3);
    }
});
panregiselem.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent pasarpa4= new Intent(getApplicationContext(), Pantallaregistro.class);
        startActivity(pasarpa4);
    }
});
    }
}