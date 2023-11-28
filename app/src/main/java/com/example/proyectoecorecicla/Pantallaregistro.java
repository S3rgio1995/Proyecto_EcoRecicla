package com.example.proyectoecorecicla;

import static com.example.proyectoecorecicla.R.id.editTextTextCantidad;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectoecorecicla.models.Registroreciclaje;
import com.example.proyectoecorecicla.models.Usuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Pantallaregistro extends AppCompatActivity {

    public ArrayList<Registroreciclaje> lisRegis(File fileRegistroReciclaje){
        ArrayList<Registroreciclaje> listr= new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(fileRegistroReciclaje);
            BufferedReader reader = new BufferedReader(fileReader);
            String registrorecicla;
            while ((registrorecicla=reader.readLine())!=null) {
                String[] userArray = registrorecicla.split(",");
                String iduser = userArray[0];
                String mes = userArray[1];
                String item = userArray[2];
                String cantidad = userArray[3];
                String valor = userArray[4];
                int cant = Integer.parseInt(cantidad);
                int val = Integer.parseInt(valor);
                Registroreciclaje Regobj = new Registroreciclaje(iduser,mes, item, cant, val);
                listr.add(Regobj);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listr;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro);
        Intent receive= getIntent();
        String ider= receive.getStringExtra("idusuario");
        Spinner listregis = findViewById(R.id.spinnermaterial);
        ArrayAdapter<CharSequence> Lista = ArrayAdapter.createFromResource(this,
                R.array.opcionesmaterialesresiclaje, android.R.layout.simple_spinner_item);
        Lista.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listregis.setAdapter(Lista);
        Button registrarb = findViewById(R.id.buttonRI);
        Spinner Mes = findViewById(R.id.editTextTextRIM);
        ArrayAdapter<CharSequence> Listames = ArrayAdapter.createFromResource(this,
                R.array.opcionesmes, android.R.layout.simple_spinner_item);
        Lista.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Mes.setAdapter(Listames);
        EditText cantidad = findViewById(R.id.editTextTextCantidad);
        EditText precio = findViewById(R.id.editTextPrice);

        registrarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Mes.getSelectedItemId()==0||cantidad.getText().toString().isEmpty()||precio.getText().toString().isEmpty()||listregis.getSelectedItemId()==0){
                    Toast.makeText(getApplicationContext(), "Todos los datos deben ser diligenciados", Toast.LENGTH_LONG).show();
                }else{
                    Intent receive= getIntent();
                    String iduser= receive.getStringExtra("idusuario");
                    String mes,item;
                    int canti,valor;
                    mes = Mes.getSelectedItem().toString();
                    item = listregis.getSelectedItem().toString();
                    canti = Integer.parseInt(cantidad.getText().toString());
                    valor = Integer.parseInt(precio.getText().toString());
                    Registroreciclaje regis = new Registroreciclaje(iduser,mes,item,canti,valor);
                    almacenaReciclaje(regis);
                    Mes.setSelection(0);
                    cantidad.setText(null);
                    precio.setText(null);
                    listregis.setSelection(0);



                }
            }
        });








    }
    public void almacenaReciclaje(Registroreciclaje registroreciclaje){
        File fileReciclaje = new File(getFilesDir(),"Reciclaje.txt");

        try {
            FileWriter guardar = new FileWriter(fileReciclaje, true);
            BufferedWriter bufferedWriter = new BufferedWriter(guardar);
            bufferedWriter.write(registroreciclaje.getIduser() + "," + registroreciclaje.getMes() + "," + registroreciclaje.getItem() + "," +registroreciclaje.getCantidad()+ "," + registroreciclaje.getValor());
            bufferedWriter.newLine();
            bufferedWriter.close();
            Toast.makeText(getApplicationContext(), "Datos almacenados", Toast.LENGTH_LONG).show();
        }catch (Exception error){
            error.printStackTrace();
        }
    }
}
