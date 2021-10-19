package Lambdanlist;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);

        numeros.forEach((v)->{
            dobro.add(v*2);
            if(v%2 ==0){
                pares.add(v);
            }else {
                impares.add(v);
            }
        });

        System.out.println("Números"+ numeros);
        System.out.println("Ímpares"+ impares);
        System.out.println("Pares"+ pares);
        System.out.println("Primos"+ dobro);
    }
}



