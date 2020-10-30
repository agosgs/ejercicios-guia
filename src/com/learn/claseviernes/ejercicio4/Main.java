package com.learn.claseviernes.ejercicio4;

public class Main {
    public static void main(String[] args) {

        firstBike();
    }


    public static void firstBike() {
        Bike firstBike = new Bike();

        System.out.println("My colour is: " + firstBike.getColour());
        System.out.println("My rolled is: " + firstBike.getRolled());
        System.out.println("I am a " + firstBike.getTypeOfBike() + " bike");
    }
}
