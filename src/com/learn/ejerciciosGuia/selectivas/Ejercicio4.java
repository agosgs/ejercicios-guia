package com.learn.ejerciciosGuia.selectivas;

import java.util.Scanner;

public class Ejercicio4 {
    //4) Escribir un algoritmo que determine si un número es par.

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        int numero = miScanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par.");
        } else {
            System.out.println("El numero ingresado no es par.");
        }
    }
}
