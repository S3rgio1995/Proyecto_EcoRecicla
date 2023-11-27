package com.example.proyectoecorecicla.models;

public class Registroreciclaje {
    private int Cantidad, Valor;
    private String Mes, item, iduser;

    public Registroreciclaje (String iduser, String mes,String item, int cantidad, int valor){
        this.iduser=iduser;
        this.Mes = mes;
        this.item = item;
        Cantidad=cantidad;
        Valor = valor;


    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        this.Valor = valor;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }
}
