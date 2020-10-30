package com.learn.claseviernes.ejercicio3;

public class Botella {

    private Contenido contenido;
    private Material material;
    private int capacidad;

    public Contenido getContenido() {
        return contenido;
    }

    public Material getMaterial() {
        return material;
    }

    public String getCapacidad() {
        return capacidad + " litros" ;
    }
    private void setContenido(Contenido contenido){
        this.contenido = Contenido.AGUA;
    }

    private void setMaterial(Material material){
        this.material = Material.VIDRIO;
    }
    private void setCapacidad (int capacidad){
        this.capacidad = 1;
    }
}
