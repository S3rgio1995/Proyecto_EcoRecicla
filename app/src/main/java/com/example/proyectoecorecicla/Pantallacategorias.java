package com.example.proyectoecorecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Pantallacategorias extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallacategorias);
        Intent pasarpa2= new Intent(getApplicationContext(),Pantallaregistro.class);
        Intent pasarpa3= new Intent(getApplicationContext(), Pantallaprincipal.class);
        Intent receive= getIntent();
        String id= receive.getStringExtra("idusuario");
        Button boton1 = findViewById(R.id.Registrarresic);
        Button boton2 = findViewById(R.id.Btnatrascatego);
        TabLayout tabcate = findViewById(R.id.tabcategorias);
        EditText contenidocat = findViewById(R.id.Contenidocatego);
        TabItem tabalum = findViewById(R.id.tabaluminio);
        TextView titulocate = findViewById(R.id.Categoriatitutext);
        ImageView imgcat = findViewById(R.id.imagencat);

        tabcate.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int co = tab.getPosition();
                switch (co){
                    case 0:
                        titulocate.setText("Vidrio");
                        imgcat.setImageResource(R.drawable.imgvidrio);
                        contenidocat.setTextSize(17);
                        contenidocat.setText("El vidrio es un material totalmente reciclable y no hay límite en la cantidad de veces que puede ser reprocesado. Al reciclarlo no se pierden las propiedades y se ahorra una cantidad de energía de alrededor del 30% con respecto al vidrio nuevo. Este reciclaje permite reducir la cantidad de residuos que luego se llevan al vertedero, lo que supone un ahorro tanto de materias primas como de energía respecto a la fabricación de vidrio a partir de materias primas nuevas.\n" +
                                "Tomado de Wikipedia.");
                        break;

                    case 1:
                        titulocate.setText("Papeles y Carton");
                        imgcat.setImageResource(R.drawable.imgcarton);
                        contenidocat.setText("El reciclaje de papel es el proceso de recuperación de papel ya creado o utilizado para transformarlo en nuevos productos de papel. Existen cuatro categorías de papel que pueden utilizarse como materia prima para papel reciclado: molido, desechos de -consumo, desecho de post-consumo, papel del inodoro. \n" +
                                "Tomado de Wikipedia.");
                        break;
                    case 2:
                        titulocate.setText("Pastico");
                        imgcat.setImageResource(R.drawable.imgplastico);
                        contenidocat.setText("Las tres principales finalidades del plástico reciclado son la reutilización directa, el aprovechamiento como materia prima para la fabricación de nuevos productos y su conversión como combustible o como nuevos productos químicos. \n" +
                                "Tomado de Wikipedia.");
                        break;
                    case 3:
                        titulocate.setText("Aluminio");
                        imgcat.setImageResource(R.drawable.imgaluminio);
                        contenidocat.setText("El aluminio es 100 % reciclable sin merma de sus cualidades físicas, y su recuperación por medio del reciclaje se ha convertido en una faceta importante de la industria del aluminio. El proceso de reciclaje del aluminio necesita poca energía. El proceso de refundido requiere solo un 5 % de la energía necesaria para producir el metal primario inicial. \n" +
                                "Tomado de Wikipedia.");
                        break;
                    default:
                        titulocate.setText("");
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
/*
        tabalum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titulocate.setText("Aluminio");
            }
        });
        */
boton2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        pasarpa3.putExtra("idusuario",id);
        startActivity(pasarpa3);
    }
});
boton1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        pasarpa2.putExtra("idusuario",id);
        startActivity(pasarpa2);

    }
});

    }



}