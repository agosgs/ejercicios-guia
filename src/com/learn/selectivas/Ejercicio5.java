package com.learn.selectivas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio5 {
    //5) Escribir un algoritmo que lea un número real cualquiera y lo imprima redondeado con dos decimales.

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese un numero real: ");

        double numero = miScanner.nextDouble();


            System.out.println("El numero: "+ numero + " redondeado es: "+ format((numero)));


    }
    public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return format.format(n);
    }

}
