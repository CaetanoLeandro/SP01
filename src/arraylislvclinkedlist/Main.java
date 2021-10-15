package arraylislvclinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> aL = new ArrayList<>();
        LinkedList <Integer> lL= new LinkedList<>();

        for (int i = 0; i < 5000; i++){
            aL.add(i);
            lL.add(i);
        }


       //LENDO
        final  long startTimeAL = System.nanoTime();
        aL.get(300);
        final long endTimeAL = System.nanoTime();

        final  long startTimeLL = System.nanoTime();
        lL.get(300);
        final long endTimeLL = System.nanoTime();

        long totalTimeAL= endTimeAL - startTimeAL;
        long totalTimeLL= endTimeLL - startTimeLL;


        // INSERINDO
        final  long startTimeAL1 = System.nanoTime();
        aL.add(300);
        final long endTimeAL1 = System.nanoTime();

        final  long startTimeLL1 = System.nanoTime();
        lL.add(300);
        final long endTimeLL1 = System.nanoTime();

        long totalTimeAL1 = endTimeAL1 - startTimeAL1;
        long totalTimeLL1 = endTimeLL1 - startTimeLL1;


        // REMOVENDO
        final  long startTimeAL2 = System.nanoTime();
        aL.remove(300);
        final long endTimeAL2 = System.nanoTime();

        final  long startTimeLL2 = System.nanoTime();
        lL.remove(300);
        final long endTimeLL2 = System.nanoTime();

        long totalTimeAL2 = endTimeAL2 - startTimeAL2;
        long totalTimeLL2 = endTimeLL2- startTimeLL2;


        System.out.println("Tempo de execução para a criação do Arraylist= " + totalTimeAL);
        System.out.println("Tempo de execução para a criação do Linkedlist= " + totalTimeLL);
        //System.out.println(aL);
       // System.out.println(lL);
        System.out.println("");
        System.out.println("Tempo de execução para adicionar do Arraylist= " + totalTimeAL1);
        System.out.println("Tempo de execução para adicionar do Linkedlist= " + totalTimeLL1);
       // System.out.println(aL);
       // System.out.println(lL);
        System.out.println("");
        System.out.println("Tempo de execução para remover do Arraylist= " + totalTimeAL2);
        System.out.println("Tempo de execução para remover do Linkedlist= " + totalTimeLL2);
       // System.out.println(aL);
      //  System.out.println(lL);

    }
}
