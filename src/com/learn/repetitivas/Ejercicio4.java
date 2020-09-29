package com.learn.repetitivas;

public class Ejercicio4 {
    //) Dada una serie de números reales, determinar el valor máximo, el mı́nimo
    // y las posiciones en que éstos se encontraban
    //en la serie. El programa deberá ir preguntando si hay más números para ingresar

    public static void main(String[] args) {

        double [] numerosReales = {9.90, 23.78, 12.80, 101.62, 45.67, 3.40, 245.70, 30.34};
        double maximo = numerosReales[0];
        double minimo = numerosReales[0];


        for (int i = 1; i < numerosReales.length; i++) {
            if (numerosReales[i]>maximo){
                maximo = numerosReales[i];
            }

        }
        for (int i = 1; i < numerosReales.length; i++) {
            if (numerosReales[i]<minimo){
                minimo = numerosReales[i];
            }

        }


        System.out.println(maximo);
        System.out.println(minimo);
    }








}
