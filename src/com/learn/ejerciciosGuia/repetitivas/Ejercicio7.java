package com.learn.ejerciciosGuia.repetitivas;

import java.util.Scanner;

public class Ejercicio7 {
    //Leer A y B, enteros. Calcular C = A B mediante multiplicaciones sucesivas
    // e imprimir el resultado. Tener en cuenta
    //que son números enteros, por lo tanto pueden tomar valores positivos, negativos o cero

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese dos numeros enteros: ");
        int numeroA = miScanner.nextInt(); 
        int numeroB = miScanner.nextInt();
        double numeroC = 1;

        for (int i = 1; i <=numeroB; i++) {
            numeroC = numeroC*numeroA;
        }

        System.out.println("El resultado es: "+numeroC);
    }
}
