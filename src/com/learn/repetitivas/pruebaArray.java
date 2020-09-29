package com.learn.repetitivas;

import java.util.Scanner;

public class pruebaArray{

    public static void main(String[] args) {
        double[] numerosReales = new double[5];
        double maximo = numerosReales[0];
        double minimo = numerosReales[0];

        Scanner miScanner = new Scanner(System.in);

        for (int i = 0; i < numerosReales.length; i++) {
            System.out.printf("Introduzca número %d: ", i + 1);
            numerosReales[i] = miScanner.nextDouble();
        }

        for (int i = 0; i < numerosReales.length; i++) {
            if (numerosReales[i] > maximo) {
                maximo = numerosReales[i];
            }
        }
        for (int i = 0; i < numerosReales.length; i++) {
            if (numerosReales[i] < minimo) {
                minimo = numerosReales[i];
            }
        }
        System.out.println("El numero maximo ingresado es: " + maximo);
        System.out.println("El numero minimo ingresado es: " + minimo);
    }

}