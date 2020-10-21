package com.learn.ejerciciosGuia.secuenciales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //6) Leer dos numeros A y B e intercambiar el valor de sus variables
        Scanner miScanner = new Scanner(System.in);

        int numero1, numero2, auxiliar;

        System.out.println("Ingrese el primer numero: ");
        numero1 = miScanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = miScanner.nextInt();

        auxiliar=numero1;
        numero1=numero2;
        numero2=auxiliar;

        System.out.println("El nuevo valor del primer numero es: "+numero1);
        System.out.println("El nuevo valor del segundo numero es: "+numero2);

        //System.out.println("Los numeros ingresados son "+numero1 + numero2);
        //preguntar a luis como concatenar






    }
}
