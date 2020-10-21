package com.learn.ejerciciosGuia.secuenciales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
//        Leer dos numeros por teclado e imprimir
//        La suma de ambos
//        La resta (el primero menos el segundo)
//        La multiplicacion
//        La division
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");
        int numero1 = miScanner.nextInt();
        int numero2 = miScanner.nextInt();

        System.out.println("Los numeros ingresados son: " + numero1 + " " + numero2);

        int suma = numero1+numero2;
        int resta= numero1-numero2;
        int multiplicacion= numero1*numero2;
        double division= (double)numero1/numero2;

        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La resta de los numeros es: "+resta);
        System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
        System.out.println("La division de los numeros es: "+division);










    }


}
