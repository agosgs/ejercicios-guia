package com.learn.secuenciales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //5) Leer la base y la altura de un rectangulo, calcular el perimetro y la superficie.

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese la base y la altura del rectangulo: ");

        double base = miScanner.nextDouble();
        double altura = miScanner.nextDouble();

        double perimetro = (base*2) + (altura*2);
        double superficie = (base*altura);

        System.out.println("El perimetro del rectangulo es :"+perimetro);
        System.out.println("La superficie del rectangulo es :"+superficie);








    }
}
