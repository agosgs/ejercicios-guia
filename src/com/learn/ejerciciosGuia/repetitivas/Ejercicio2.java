package com.learn.ejerciciosGuia.repetitivas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //2) Leer un numero N y calcular su factorial

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresar un numero: ");

        int numero = miScanner.nextInt();
        System.out.println("El factoria de " + numero + " es: " + factorial(numero));
    }

    public static double factorial (int num){

        double aux = 1;

            for (int i = 1; i<= num; i++) {
                aux= aux*i;
            }
            return aux;

    }
    }

















