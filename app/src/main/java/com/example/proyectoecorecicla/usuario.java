package com.example.proyectoecorecicla;

public class usuario {
String nombre;
String apellido;
int Documento;
String email;
String Password;

    public usuario(String nombre, String apellido, int documento, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        Documento = documento;
        this.email = email;
        Password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
