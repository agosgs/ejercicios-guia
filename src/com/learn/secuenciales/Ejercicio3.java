package com.learn.secuenciales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //3) Escribir un programa que lea el nombre de una persona y luego lo salude.

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre: ");

        String nombre = miScanner.nextLine();

        System.out.println("Hola "+ nombre);




    }
}
