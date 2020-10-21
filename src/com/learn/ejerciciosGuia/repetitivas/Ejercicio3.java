package com.learn.ejerciciosGuia.repetitivas;

public class Ejercicio3 {
    public static void main(String[] args) {

        int [] numeros = {1,5,3,6,98,78,9,65,4,110};
        //Hallar el maximo
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i]<minimo){
                minimo = numeros[i];
            }

        }
        System.out.println(minimo);

    }
}
