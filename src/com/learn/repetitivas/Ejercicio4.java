package com.learn.repetitivas;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //) Dada una serie de números reales, determinar el valor máximo, el mı́nimo
        // y las posiciones en que éstos se encontraban
        //en la serie. El programa deberá ir preguntando si hay más números para ingresar

        double[] numerosReales = new double[5];

        Scanner miScanner = new Scanner(System.in);

        for (int i = 0; i < numerosReales.length; i++) {
            System.out.printf("Introduzca número %d: ", i + 1);
            numerosReales[i] = miScanner.nextDouble();
        }
        double maximo = numerosReales[0];
        double minimo = numerosReales[0];
        int firstPosicion = 0, secondPosicion=0;

        for (int i = 0; i < numerosReales.length; i++) {
            if (numerosReales[i] > maximo) {
                maximo = numerosReales[i];
                firstPosicion=i;
            }
        }
        for (int i = 0; i < numerosReales.length; i++) {
            if (numerosReales[i] < minimo) {
                minimo = numerosReales[i];
                secondPosicion=i;
            }
        }
        System.out.println("El numero maximo ingresado es: " + maximo + " Y su posicion es la: "+firstPosicion);
        System.out.println("El numero minimo ingresado es: " + minimo + " Y su posicion es la: "+secondPosicion);
    }

}