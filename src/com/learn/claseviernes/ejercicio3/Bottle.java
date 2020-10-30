package com.learn.claseviernes.ejercicio3;

public class Bottle {

    private Content content;
    private Material material;
    private int capacity;
    private int remainingContentPercentage;

    public Bottle(int capacity, Material material){
        this.capacity = capacity;
        this.material = material;
        this.content = Content.NO_CONTENT;
        this.remainingContentPercentage = 0;
    }
    public Bottle(int capacity, Material materialP, Content content){
        this.material = materialP;
        this.capacity = capacity;
        this.content = content;
        this.remainingContentPercentage = 100;
    }

    public Bottle (){
        this.material = Material.VIDRIO;
        this.capacity = 2;
        this.content=Content.NO_CONTENT;
        this.remainingContentPercentage = 0;
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
        this.remainingContentPercentage = 100;
    }

    public void leaveContent (int contentPercentage){

        if(this.remainingContentPercentage - contentPercentage >= 0){
            this.remainingContentPercentage = this.remainingContentPercentage - contentPercentage;
        }else{
            this.remainingContentPercentage = 0;
            this.content = Content.NO_CONTENT;
        }
    }

    public int getRemainingContentPercentage(){
        return this.remainingContentPercentage;
    }

}
