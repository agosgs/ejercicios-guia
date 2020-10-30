package com.learn.claseviernes.ejercicio3;

public class Bottle {

    private Content content;
    private Material material;
    private int capacity;

    public Bottle(int capacity, Material material){
        this.capacity = capacity;
        this.material = material;
        this.content = Content.NO_CONTENT;
    }
    public Bottle(int capacity, Material materialP, Content content){
        this.material = materialP;
        this.capacity = capacity;
        this.content = content;
    }

    public Bottle (){
        this.material = Material.VIDRIO;
        this.capacity = 2;
        this.content=Content.NO_CONTENT;
    }

    public Content getContent() {
        return content;
    }

    public Material getMaterial() {
        return material;
    }

    public String getCapacity() {
        return capacity + " litros" ;
    }

    public void setContent(Content contenido){
        this.content = contenido;
    }

}
