package com.projeto.atribuicaoreferencia;



public class Main {
    public static void main(String[] args){
        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + "\nintB = " +intB);
        intA = 2;
        System.out.println("intA = " + intA + "\nintB = " +intB);



        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA = " + objA + "\nobjB = " +objB);

        objA.setNum(2);

        System.out.println("objA = " + objA + "\nobjB = " +objB);
    }
}
