package com.example.proyectoecorecicla.models;

public class Usuario {
private String idusuario;
    String nombre;
String apellido;
int Documento;
String email;
String Password;

    public Usuario(String idusuario, String nombre, String apellido, int documento, String email, String password) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        Documento = documento;
        this.email = email;
        this.Password = password;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String nombre) {
        this.idusuario = idusuario;
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
