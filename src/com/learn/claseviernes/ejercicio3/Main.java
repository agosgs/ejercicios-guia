package com.learn.claseviernes.ejercicio3;

public class Main {

    public static void main(String[] args) {
    myBottle();
    //preguntarle a luis xq muestra null antes del constructor
    }

    public static void myBottle (){
        Bottle myBottle = new Bottle();

        myBottle.setContent(Content.AGUA);

        System.out.println("Mi capacidad es de: " + myBottle.getCapacity());
        System.out.println("Contengo " + myBottle.getContent());
        System.out.println("Estoy hecha de " + myBottle.getMaterial());

    }
}
