package com.example.proyectoecorecicla;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pantallaconsejos extends AppCompatActivity {
    TextView con1, con2, con3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaconsejos);
        con1 = findViewById(R.id.Consejo1text);
        con2 = findViewById(R.id.Consejo2text);
        con3 = findViewById(R.id.Consejo3text);
        consejos();
    }
    public void consejos (){
        con1.setTextSize(22);
        con2.setTextSize(22);
        con3.setTextSize(22);
        con1.setText("Deposita los residuos en el contenedor correspondiente");
        con2.setText("Limpia los envases de comida antes de tirarlos al contenedor");
        con3.setText("Utiliza papel reciclado");
    }
}
