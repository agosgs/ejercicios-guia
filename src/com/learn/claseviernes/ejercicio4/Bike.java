package com.learn.claseviernes.ejercicio4;

public class Bike {

    private TypeOfBike typeOfBike;
    private int rolled; //rodado
    private String colour;

    public Bike(){
        this.typeOfBike = TypeOfBike.FIXIE;
        this.rolled = 28;
        this.colour = "red";
    }
    public int getRolled() {
        return rolled;
    }

    public String getColour() {
        return colour;
    }

    public TypeOfBike getTypeOfBike() {
        return typeOfBike;
    }

}
