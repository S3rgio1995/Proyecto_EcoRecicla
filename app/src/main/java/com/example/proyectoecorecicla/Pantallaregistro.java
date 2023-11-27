package com.example.proyectoecorecicla;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Pantallaregistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro);
        Spinner listregis = findViewById(R.id.spinnermaterial);
        ArrayAdapter<CharSequence> Lista = ArrayAdapter.createFromResource(this,
                R.array.opcionesmaterialesresiclaje, android.R.layout.simple_spinner_item);
        Lista.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listregis.setAdapter(Lista);





    }
}
