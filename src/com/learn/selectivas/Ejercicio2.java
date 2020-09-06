package com.learn.selectivas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //2) Leer dos numeros reales e imprimir el mayor de ellos

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros reales: ");
        double numero1 = miScanner.nextDouble();
        double numero2 = miScanner.nextDouble();

        if (numero1>numero2){
            System.out.println("El numero mayor es: " +numero1);
        }else{
            System.out.println("El numero mayor es: "+numero2);
        }


    }
}
