package com.learn.selectivas;

public class Ejercicio5bis {

    public static void main(String[] args) {
        //5) Escribir un algoritmo que lea un número real cualquiera y lo imprima redondeado con dos decimales

        Double numero = 49.9999;
        numero =numero*100;

        String numeroAsString = numero.toString();
        String [] digits = numeroAsString.split("\\.");

        String segundaParte = digits[1];
        String primeraParte = digits[0];

        segundaParte.charAt(0);

        boolean redondeoParaArriba = false;

        for (int i = 0; i <segundaParte.length() ; i++) {
            int numeroActual = Character.getNumericValue(segundaParte.charAt(i));

            if (numeroActual > 4) {
                //redondeamos para arriba
                redondeoParaArriba = true;
                break;
            }else if (numeroActual<4){
                redondeoParaArriba = false;
                break;
            }

        }
    //redondeamos para abajo

        System.out.println(redondeoParaArriba);
        int integerResult = Integer.parseInt(primeraParte);

        if (redondeoParaArriba){
             integerResult++;
        }
        System.out.println(integerResult/100.0);






    }


}
