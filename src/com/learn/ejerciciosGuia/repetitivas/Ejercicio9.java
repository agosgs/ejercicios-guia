package com.learn.ejerciciosGuia.repetitivas;

import java.util.Scanner;

public class Ejercicio9 {
    //9) Dada una serie de números enteros terminada en cero, imprimir los tres mayores.
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese el tamanio de su array: ");

        int tamanioArray = miScanner.nextInt();

        int[] numerosEnteros = new int[tamanioArray];

        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.printf("Introduzca un número terminado en 0: ", i + 1);
            numerosEnteros[i] = miScanner.nextInt();
        }

        boolean hayCambios = false;

        int auxiliar = 0;

        do{
            hayCambios = false;
            for(int i = 0 ; i<numerosEnteros.length-1; i++){
                if(numerosEnteros[i+1] > numerosEnteros[i]){
                    auxiliar = numerosEnteros[i];
                    numerosEnteros[i] = numerosEnteros[i+1];
                    numerosEnteros[i+1] = auxiliar;
                    hayCambios=true;
                }
            }

        }while(hayCambios);

        for(int i = 0 ; i < numerosEnteros.length ; i++) {
            //System.out.print(numerosEnteros[i]+", ");
        }

        int maximo = numerosEnteros[0];
        int maximoDos = numerosEnteros[1];
        int maximoTres = numerosEnteros[2];

        System.out.println("Los tres numeros mayores del array son: "+ maximo + ", "+ maximoDos + " y " + maximoTres);
    }
}
