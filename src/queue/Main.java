package queue;

import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {

        Queue <String> car = new LinkedList<>();


        car.add("Mustang"); // push adiciona um valor a uma posição do Queue
        car.add("Camaro");
        car.add("Chellenger");
        car.add("Corvette");
        car.add("Porsche");
        car.add("Charger");

        System.out.println(car);
        System.out.println("");
        System.out.println("1° element : " +car.peek()); // retorna o 1°elemento da Queue
        System.out.println("");
        System.out.println("Removed element: " +car.poll()); // retorna e retira o da Queue
        System.out.println("");
        System.out.println(car);
        System.out.println("");
        car.clear();//Apaga a stack
        System.out.println("");
        System.out.println(car.isEmpty()? "Queue empty" : "Stack full");


    }


}
