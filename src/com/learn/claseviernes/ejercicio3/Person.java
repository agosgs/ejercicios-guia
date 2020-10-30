package com.learn.claseviernes.ejercicio3;

public class Person {

    private Bottle bottle;
    private String name;

    public Person (String name){
        this.name = name;
    }

    public void setBottle (Bottle bottle){
        this.bottle = bottle;
    }

    public void setBottleContent(Content content) {
        this.bottle.setContent(content);
    }

    public Content getBottleContent (){
        return this.bottle.getContent();
    }

    public void drink (){
        this.bottle.leaveContent(10);
    }

    public int getContentPercentageOfBottle(){
        return this.bottle.getRemainingContentPercentage();
    }
}
