package com.learn.selectivas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Leer un numero real y decir si es mayor, menor o igual a cero
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese un numero real: ");

        double numero = miScanner.nextDouble();

        if (numero==0){
            System.out.println("El numero es igual a 0");
        }else if (numero>0){
            System.out.println("El numero es mayor a 0");
        }else{
            System.out.println("El numero es menor a 0");
        }




    }
}
