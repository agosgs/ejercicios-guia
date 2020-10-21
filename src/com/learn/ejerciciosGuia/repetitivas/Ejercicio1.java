 package com.learn.ejerciciosGuia.repetitivas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       // Imprimir por pantalla una lista de 20 numeros consecutivos los
        //cuales comienzan con un numero ingresado por teclado

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresar un numero: ");

        int numero = miScanner.nextInt();

        for (int i = numero; i <=numero+20 ; i++) {
            System.out.println(i);

        }
    }
}
