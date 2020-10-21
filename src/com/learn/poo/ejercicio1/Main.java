package com.learn.poo.ejercicio1;

public class Main {

    public static void main(String[] args) {
        pruebaPersonaDormilona();
       // pruebaPersona();
    }

    public static void pruebaPersonaDormilona(){

        PersonaDormilona maria = new PersonaDormilona();
        maria.setDurmiendo(false);

        PersonaDormilona carlos = new PersonaDormilona();

         boolean durmiendoCarlos = carlos.getEstasDurmiendo();

        System.out.println("Carlos: " + durmiendoCarlos);


       boolean durmiendoMaria  = maria.getEstasDurmiendo();

        System.out.println("Maria: " + durmiendoMaria);

    }

    public static void pruebaPersona(){
        Persona juan = new Persona();

        System.out.println(juan.saludar());

        String saludo = juan.saludarA("Pedro");
        System.out.println(saludo);

        System.out.println(juan.despedirse());
    }
}
