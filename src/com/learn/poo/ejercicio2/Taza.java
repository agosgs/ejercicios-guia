package com.learn.poo.ejercicio2;

public class Taza {

    private int temperatura;
    private String contenido;

    public Taza (){
        this.temperatura = 25;
        this.contenido = "Ninguno";
    }

    public String getContenido() {
        return contenido;
    }

    public int getTemperatura() {
        return temperatura;
    }


    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTemperaturaTaza(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getEstadoDeContenido() {
        if (this.temperatura >= 100) {
            return "Hirviendo";
        }else {
            return "Temperatura ambiente";
        }


    }
}
