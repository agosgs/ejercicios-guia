package com.learn.claseviernes.ejercicio3;

public class MainPersonWithBottle {

    public static void main(String[] args) {
        Person person = new Person("Maria");
        Bottle bottle = new Bottle(2, Material.PLASTICO);

        person.setBottle(bottle); //le asignamos la botella a maria
        person.setBottleContent(Content.AGUA); //le dijimos el contenido de la botella

        person.drink();
        person.drink();
        person.drink();
        person.drink();
        person.drink();
        person.drink();
        person.drink();
        person.drink();
        person.drink();
        person.drink();
        person.drink();


        System.out.println(person.getContentPercentageOfBottle());
        System.out.println(person.getBottleContent());


    }
}
