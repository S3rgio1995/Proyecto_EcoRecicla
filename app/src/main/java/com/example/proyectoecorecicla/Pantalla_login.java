package com.example.proyectoecorecicla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Pantalla_login extends AppCompatActivity {
public void pantallare (){
    CardView registarg = findViewById(R.id.Registroc);
    registarg.setVisibility(View.VISIBLE);
}

protected void iniciarsesion (String usuari, String Password){
  /*  usuario usu= new usuario();
    String correo, passwor;
correo = usu.getEmail();
passwor = usu.getPassword();*/
Intent pasarpa= new Intent(getApplicationContext(), Pantallaprincipal.class);
    Toast.makeText(getApplicationContext(),"Iniciar sesion",Toast.LENGTH_LONG).show();
if (usuari.equals("qwer")) {
    if (Password.equals("123")){
            Toast.makeText(getApplicationContext(),"Bienvenido " ,Toast.LENGTH_LONG).show();
            startActivity(pasarpa);
        }else{
            Toast.makeText(getApplicationContext(),"Usuario "+" contraseña incorrecta",Toast.LENGTH_LONG).show();
        }
    }else{
        Toast.makeText(getApplicationContext(),"Usuario y contraseña no registrado",Toast.LENGTH_LONG).show();
    }


}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_login);
        TextView registro = findViewById(R.id.labelregis);
        CardView registarg = findViewById(R.id.Registroc);
        EditText editTextd = findViewById(R.id.editTextdocu);
        EditText edtinom = findViewById(R.id.editTextnombreregis);
        EditText edtapellll = findViewById(R.id.editapelli);
        EditText editemail1 =findViewById(R.id.editTextemail1);
        EditText editemail2 =findViewById(R.id.editTextemail2);
        EditText editcontra1 =findViewById(R.id.editpassword1);
        EditText editcontra2 =findViewById(R.id.editTextpassword2);
        Button Iniciars = findViewById(R.id.Loginbt);
        Button cancel = findViewById(R.id.cancelarregistrerbt);
        Button regis = findViewById(R.id.registrerbt);
        EditText usua=findViewById(R.id.editTextusuaini);
        EditText cont =findViewById(R.id.editTextTextPasswordini);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtinom.getText().toString().isEmpty()||edtapellll.getText().toString().isEmpty()||editTextd.getText().toString().isEmpty()||editemail1.getText().toString().isEmpty()||editemail2.getText().toString().isEmpty()||  editcontra1.getText().toString().isEmpty()|| editcontra2.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Todos los datos deben ser diligenciados",Toast.LENGTH_LONG).show();
                }else if (editemail1.getText().toString().equals(editemail2.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Los emails  deben ser iguales",Toast.LENGTH_LONG).show();

                    if (editcontra1.getText().toString().equals(editcontra2.getText().toString())){

                    }
                }

                int docu = Integer.parseInt(editTextd.getText()+"");
                usuario usu = new usuario(edtinom.getText()+"",edtapellll.getText()+"",docu,editemail1.getText()+"",editcontra1.getText()+"");
                Toast.makeText(getApplicationContext(),"Usuario "+usu.getNombre()+" "+"Registrado",Toast.LENGTH_LONG).show();
                edtinom.setText(null);
                edtapellll.setText(null);
                editTextd.setText(null);
                editemail1.setText(null);
                editemail2.setText(null);
                editcontra1.setText(null);
                editcontra2.setText(null);
                registarg.setVisibility(View.GONE);
            }
        });
cancel.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edtinom.setText(null);
        edtapellll.setText(null);
        editTextd.setText(null);
        editemail1.setText(null);
        editemail2.setText(null);
        editcontra1.setText(null);
        editcontra2.setText(null);
        registarg.setVisibility(View.GONE);


    }
});
        Iniciars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = usua.getText().toString();
                String C = cont.getText().toString();

                if (u.isEmpty()||C.isEmpty()){
                        Toast.makeText(getApplicationContext(),"Digite usuario y contraseña",Toast.LENGTH_LONG).show();
                    }else{

                iniciarsesion(u,C);
                usua.setText(null);
                cont.setText(null);
                }
            }
        });
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pantallare();
            }
        });
    }

}