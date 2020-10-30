package com.learn.claseviernes.ejercicio2;

public class Main {
    //crear una entidad llamada Calculate q entienda los mensajes sum, rest, div, mult, cada uno
    //recibe dos parametros enteros y devuelve lo necesario para devolver


    public static void main(String[] args) {

        addCalculate();
        subtractCalculate();
        multiplicationCalculate();
        divisionCalculate();
    }

    public static void addCalculate(){

        Calculate sumCalculate = new Calculate();

        int resultAdd = sumCalculate.add(5,10);

        System.out.println(resultAdd);
        System.out.println(sumCalculate.getLastOperation());
    }
    public static void subtractCalculate(){

        Calculate restCalculate = new Calculate();

        int resultSub = restCalculate.subtract(20,16);

        System.out.println(resultSub);
        System.out.println(restCalculate.getLastOperation());

    }
    public static void multiplicationCalculate(){

        Calculate multCalculate = new Calculate();

        int resultMult = multCalculate.multiplication(5,10);

        System.out.println(resultMult);
        System.out.println(multCalculate.getLastOperation());

    }
    public static void divisionCalculate(){

        Calculate divisionCalculate = new Calculate();

        int resultDivision= (int) divisionCalculate.division(20,2);

        System.out.println(resultDivision);
        System.out.println(divisionCalculate.getLastOperation());

    }
}
