package com.example.proyectoecorecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.proyectoecorecicla.models.Registroreciclaje;
import com.example.proyectoecorecicla.models.Usuario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class PantallaEstadisticas extends AppCompatActivity {

    TextView totalreciclajetextv, totextvpesorecic,textvviditot,papeleditext,ttaoeditalumtex,ttaoeditplasticotext,materecitext;
    ProgressBar progBarVidrio,progBarPapel,progBarAluminio,progPlastico;
    Button masinfo;


    public ArrayList<Registroreciclaje> listregis (File Regis,String idus){
        ArrayList<Registroreciclaje> list= new ArrayList<>();

        try {
            FileReader fileReader=new FileReader(Regis);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String ite;
            while ((ite=bufferedReader.readLine())!=null){
                String[] reciArray = ite.split(",");
                String iduser = reciArray[0];
                String mes = reciArray[1];
                String item = reciArray[2];
                String Cantidad = reciArray[3];
                String valor = reciArray[4];
                int cant = Integer.parseInt(Cantidad);
                int val = Integer.parseInt(valor);
                if (idus.equals(iduser)){
                    Registroreciclaje ReresObj= new Registroreciclaje(iduser,mes,item,cant,val);
                    list.add(ReresObj);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
    public ArrayList<Registroreciclaje> listregis2 (File Regis,String idus,String items){
        ArrayList<Registroreciclaje> list= new ArrayList<>();

        try {
            FileReader fileReader=new FileReader(Regis);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String ite;
            while ((ite=bufferedReader.readLine())!=null){
                String[] reciArray = ite.split(",");
                String iduser = reciArray[0];
                String mes = reciArray[1];
                String item = reciArray[2];
                String Cantidad = reciArray[3];
                String valor = reciArray[4];
                int cant = Integer.parseInt(Cantidad);
                int val = Integer.parseInt(valor);
                if (idus.equals(iduser)&&items.equals(item)){
                    Registroreciclaje ReresObj= new Registroreciclaje(iduser,mes,item,cant,val);
                    list.add(ReresObj);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
    public ArrayList<Registroreciclaje> listregispapel (File Regis,String idus,String items){
        ArrayList<Registroreciclaje> list= new ArrayList<>();

        try {
            FileReader fileReader=new FileReader(Regis);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String ite;
            while ((ite=bufferedReader.readLine())!=null){
                String[] reciArray = ite.split(",");
                String iduser = reciArray[0];
                String mes = reciArray[1];
                String item = reciArray[2];
                String Cantidad = reciArray[3];
                String valor = reciArray[4];
                int cant = Integer.parseInt(Cantidad);
                int val = Integer.parseInt(valor);
                if (idus.equals(iduser)&&items.equals(item)){
                    Registroreciclaje ReresObj= new Registroreciclaje(iduser,mes,item,cant,val);
                    list.add(ReresObj);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
    public ArrayList<Registroreciclaje> listconsulaluminio (File Regis,String idus,String items){
        ArrayList<Registroreciclaje> list= new ArrayList<>();

        try {
            FileReader fileReader=new FileReader(Regis);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String ite;
            while ((ite=bufferedReader.readLine())!=null){
                String[] reciArray = ite.split(",");
                String iduser = reciArray[0];
                String mes = reciArray[1];
                String item = reciArray[2];
                String Cantidad = reciArray[3];
                String valor = reciArray[4];
                int cant = Integer.parseInt(Cantidad);
                int val = Integer.parseInt(valor);
                if (idus.equals(iduser)&&items.equals(item)){
                    Registroreciclaje ReresObj= new Registroreciclaje(iduser,mes,item,cant,val);
                    list.add(ReresObj);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
    public ArrayList<Registroreciclaje> listconsulplastico (File Regis,String idus,String items){
        ArrayList<Registroreciclaje> list= new ArrayList<>();

        try {
            FileReader fileReader=new FileReader(Regis);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String ite;
            while ((ite=bufferedReader.readLine())!=null){
                String[] reciArray = ite.split(",");
                String iduser = reciArray[0];
                String mes = reciArray[1];
                String item = reciArray[2];
                String Cantidad = reciArray[3];
                String valor = reciArray[4];
                int cant = Integer.parseInt(Cantidad);
                int val = Integer.parseInt(valor);
                if (idus.equals(iduser)&&items.equals(item)){
                    Registroreciclaje ReresObj= new Registroreciclaje(iduser,mes,item,cant,val);
                    list.add(ReresObj);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_estadisticas);
        totextvpesorecic = findViewById(R.id.ttaoedit8);
        textvviditot = findViewById(R.id.ttaoeditpap);
        progBarVidrio = findViewById(R.id.progressBarVidrio);
        papeleditext = findViewById(R.id.ttaoeditcart);
        progBarPapel = findViewById(R.id.progressBarPapel);
        progBarAluminio = findViewById(R.id.progressBarAluminio);
        ttaoeditalumtex = findViewById(R.id.ttaoeditalum);
        ttaoeditplasticotext = findViewById(R.id.ttaoeditplastico);
        progPlastico = findViewById(R.id.progressBarPlastico);
        materecitext = findViewById(R.id.matemasrecitext);

           totalreciclajetextv = findViewById(R.id.Ttaoedittext);


        Intent receive= getIntent();
        String idf= receive.getStringExtra("idusuario");


            File fileRead = new File(getFilesDir(),"Reciclaje.txt");
            ArrayList<Registroreciclaje> listregis = listregis(fileRead,idf);
            String ite;
                    ite = "Vidrio";
                    ArrayList<Registroreciclaje> listregis2 = listregis2(fileRead, idf, ite);
                    totalresiclajevidrio(listregis2);

                    ite = "Papeles y Carton";
                    ArrayList<Registroreciclaje> listregispapel = listregis2(fileRead, idf, ite);
                    ite = "Aluminio";
                    ArrayList<Registroreciclaje> listconsulaluminio = listregis2(fileRead, idf, ite);
                    ite = "Plasticos";
                     ArrayList<Registroreciclaje> listconsulplastico = listregis2(fileRead, idf, ite);






        /*totalreciclajetextv.setText(idf+"");*/
        totalresiclaje(listregis);
        totalpesoresiclaje(listregis);
        totalresiclajepapel(listregispapel);
        totalresiclajeAluminio(listconsulaluminio);
        totalresiclajePlastico(listconsulplastico);

        int valpap, valplast, valalumn, valvidrio;
        valpap = progBarPapel.getProgress();
        valplast = progPlastico.getProgress();
        valalumn = progBarAluminio.getProgress();
        valvidrio = progBarVidrio.getProgress();

        if (valpap>valplast&&valpap>valalumn&&valpap>valvidrio){
            materecitext.setText("Papel y Carton");
        } else if (valplast>valpap&&valplast>valalumn&&valplast>valvidrio) {
            materecitext.setText("Plastico");
        } else if (valalumn>valplast&&valalumn>valpap&&valalumn>valvidrio) {
            materecitext.setText("Aluminio");
        } else if (valvidrio>valplast&&valvidrio>valalumn&&valvidrio>valpap) {
            materecitext.setText("Vidrio");
        }else {
            materecitext.setText("Sin determinar");
        }


    }
    public void totalresiclaje(ArrayList<Registroreciclaje>list){
        int totalv=0;
        int max=0;
        for (Registroreciclaje i: list){
            totalv+=i.getValor();
            if(max<i.getValor()){
                max=i.getValor();
            }
        }
        totalreciclajetextv.setText("$"+totalv+" Pesos");

    }
    public void totalresiclajevidrio(ArrayList<Registroreciclaje>list){
        int totalv=0;
        int max=0;
        for (Registroreciclaje i: list){
            totalv+=i.getCantidad();
            if(max<i.getCantidad()){
                max=i.getCantidad();
            }
        }
        textvviditot.setText(totalv+" KG");
        progBarVidrio.setProgress(totalv);

    }
    public void totalresiclajepapel(ArrayList<Registroreciclaje>list){
        int totalv=0;
        int max=0;
        for (Registroreciclaje i: list){
            totalv+=i.getCantidad();
            if(max<i.getCantidad()){
                max=i.getCantidad();
            }
        }
        papeleditext.setText(totalv+" KG");
        progBarPapel.setProgress(totalv);

    }
    public void totalresiclajeAluminio(ArrayList<Registroreciclaje>list){
        int totalv=0;
        int max=0;
        for (Registroreciclaje i: list){
            totalv+=i.getCantidad();
            if(max<i.getCantidad()){
                max=i.getCantidad();
            }
        }
        ttaoeditalumtex.setText(totalv+" KG");
        progBarAluminio.setProgress(totalv);

    }
    public void totalresiclajePlastico(ArrayList<Registroreciclaje>list){
        int totalv=0;
        int max=0;
        for (Registroreciclaje i: list){
            totalv+=i.getCantidad();
            if(max<i.getCantidad()){
                max=i.getCantidad();
            }
        }
        ttaoeditplasticotext.setText(totalv+" KG");
        progPlastico.setProgress(totalv);

    }
    public void totalpesoresiclaje(ArrayList<Registroreciclaje>list){
        int totalp=0;
        int max=0;
        for (Registroreciclaje i: list){
            totalp+=i.getCantidad();
            if(max<i.getCantidad()){
                max=i.getCantidad();
            }
        }
        totextvpesorecic.setText(totalp+" KG");
        progBarAluminio.setMax(totalp);
        progPlastico.setMax(totalp);
        progBarPapel.setMax(totalp);
        progBarVidrio.setMax(totalp);


    }


}