package com.learn.selectivas;

import java.util.Scanner;

public class Ejercicio7 {
    //7) Leer dos números y luego una opción
    // (puede ser suma, resta, multiplicación o división),
    // según la opción elegida realizar el cálculo.

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese dos numeros: ");
        double num1 = miScanner.nextDouble();
        double num2 = miScanner.nextDouble();


        System.out.println("Por favor, seleccione el nunero de la opcion que desea realizar: ");
        System.out.println("1. Suma\n" + "2. Resta\n" + "3. Multiplicacion\n" + "4.Division\n");
        double opciones= miScanner.nextDouble();

        switch ((int) opciones){
            case 1:
                System.out.println("La suma entre: "+num1+ " y " + num2 + " es: "+ (num1+num2));
                break;
            case 2:
                System.out.println("La resta entre: "+num1+ " y " + num2 + " es: "+ (num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion entre: "+num1+ " y " + num2 + " es: "+ (num1*num2));
                break;
            case 4:
                System.out.println("La division entre: "+num1+ " y " + num2 + " es: "+ (num1/num2));
                break;
            default:
                System.out.println("No existe esa opcion");
                break;

        }


    }
}
