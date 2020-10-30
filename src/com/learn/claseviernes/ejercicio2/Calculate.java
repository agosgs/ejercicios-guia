package com.learn.claseviernes.ejercicio2;

public class Calculate {

    private Operation lastOperation;


public int add (int num1, int num2){
    this.lastOperation = Operation.ADD;
    return num1+num2;
}

public int subtract (int num1, int num2){
    this.lastOperation = Operation.SUBSTRACT;

    return num1-num2;
}
    public int multiplication (int num1, int num2){
        this.lastOperation = Operation.MULTIPLICATION;
        return num1*num2;
    }
    public double division (int num1, int num2){
        this.lastOperation = Operation.DIVISION;

        return (double) (num1/num2);
    }

    public Operation getLastOperation(){

    return lastOperation;

    }

    private void setLastOperation(Operation operation) {
    this.lastOperation = operation;

    }




}
