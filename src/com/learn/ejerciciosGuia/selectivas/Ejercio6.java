package com.learn.ejerciciosGuia.selectivas;

import java.util.Scanner;

public class Ejercio6 {
    //6) Escribir un algoritmo que determine si un número N es divisible por M.

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingresar dos numeros: ");
        int numeroN = miScanner.nextInt();
        int numeroM = miScanner.nextInt();

        if (numeroN%numeroM == 0){
            System.out.println("El numero: "+numeroN + " es divisible por " + numeroM);
        }else{
            System.out.println("El numero: "+numeroN + " NO es divisible por " + numeroM);
        }
    }
}
