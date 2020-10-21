package com.learn.poo.ejercicio2;

public class Main {
    /* Se requiere modelar una entidad llamada Taza
    Esta entidad tiene temperatura, un contenido (bebible)
    Si la temperatura es mayor o igual a 100 C, al preguntarle por el estado del contenido
    el mensaje respuesta es "Hirviendo" si no, el mensaje es "a temperatura ambiente"
     */

    public static void main(String[] args) {
        //pruebaDeTaza();
        pruebaTaza2();
    }

    public static void pruebaTaza2 (){
        Taza segundaTaza = new Taza();

        System.out.println(segundaTaza.getContenido());
        System.out.println(segundaTaza.getTemperatura());


    }

    public static void pruebaDeTaza(){
        Taza primerTaza = new Taza();

        primerTaza.setContenido("Cafe");
        primerTaza.setTemperaturaTaza(100);

        int temperatura = primerTaza.getTemperatura();
        String contenido = primerTaza.getContenido();

        System.out.println("El contenido de la taza es: " + contenido);
        System.out.println("La temperatura de la taza es: " + temperatura);

        System.out.println(primerTaza.getEstadoDeContenido());
    }
}
