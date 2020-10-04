package com.learn.repetitivas;

import java.util.Scanner;

public class Ejercicio6 {
    //6) Leer A y B, enteros. Calcular C = A ∗ B mediante sumas sucesivas e imprimir el resultado.

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese dos numeros enteros: ");
        int numeroA = miScanner.nextInt();
        int numeroB = miScanner.nextInt();
        int numeroC = 0;

        for (int i = 0; i <= numeroB ; i++) {
            numeroC = numeroA + numeroA;
        }

        System.out.println("El resultado es: "+numeroC);



    }
}