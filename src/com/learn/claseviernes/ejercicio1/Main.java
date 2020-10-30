package com.learn.claseviernes.ejercicio1;

public class Main {


    public static void main(String[] args) {

    makeSound();

    }

    public static void makeSound (){
        Flute firstFlute = new Flute();
        //String myFluteSound = firstFlute.makeSound();
        //System.out.println(firstFlute.makeSound());
        String myFluteSound2 = firstFlute.makeSoundWithNote(Note.FA);
        System.out.println(myFluteSound2);

    }


}
