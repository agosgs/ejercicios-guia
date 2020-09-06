package com.learn.secuenciales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //4) Dado el radio R de una esfera, calcular e imprimir su superficie y su volumen.

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio de una esfera: ");
        double radio = miScanner.nextDouble();

        double volumen = ( (4.0/3)* Math.PI * Math.pow(radio, 3));
        // superficie = 4 π r 2

        double superficie = ((4 * Math.PI*(radio*radio)));

        System.out.println("La superficie de la esfera es "+ superficie);
        System.out.println("El volumen de la esfera es "+ volumen);

    }
}
