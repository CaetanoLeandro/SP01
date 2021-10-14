package stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> car = new Stack<>();


        car.push("Mustang"); // push adiciona um valor a uma posição do stack
        car.push("Camaro");
        car.push("Chellenger");
        car.push("Corvette");
        car.push("Porsche");
        car.push("Charger");

        System.out.println("1° element : " +car.peek()); // retorna o 1°elemento da stack
        System.out.println("Removed element: " +car.pop()); // retorna e retira o 1°elemento da stack
        System.out.println(car);
        car.clear();//Apaga a stack
        System.out.println(car.empty()? "Stack empty" : "Stack full");


    }


}
