package arraylislvclinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> aL = new ArrayList<>();
        LinkedList <Integer> lL= new LinkedList<>();
        Stack<Integer> sL = new Stack<>();

        for (int i = 0; i < 10; i++){
            aL.add(i);
            lL.add(i);
            sL.add(i);
        }


       //LENDO
        final  long startTimeAL = System.nanoTime();
        aL.get(4);
        final long endTimeAL = System.nanoTime();

        final  long startTimeLL = System.nanoTime();
        lL.get(4);
        final long endTimeLL = System.nanoTime();

        final  long startTimeSL = System.nanoTime();
        sL.get(4);
        final long endTimeSL = System.nanoTime();

        long totalTimeAL= endTimeAL - startTimeAL;
        long totalTimeLL= endTimeLL - startTimeLL;
        long totalTimeSL= endTimeSL - startTimeSL;

        System.out.println(aL);
        System.out.println(lL);
        System.out.println(sL);


        // INSERINDO
        final  long startTimeAL1 = System.nanoTime();
        aL.add(8);
        final long endTimeAL1 = System.nanoTime();

        final  long startTimeLL1 = System.nanoTime();
        lL.add(8);
        final long endTimeLL1 = System.nanoTime();

        final  long startTimeSL1 = System.nanoTime();
        sL.add(8);
        final long endTimeSL1= System.nanoTime();

        long totalTimeAL1 = endTimeAL1 - startTimeAL1;
        long totalTimeLL1 = endTimeLL1 - startTimeLL1;
        long totalTimeSL1= endTimeSL1 - startTimeSL1;

        System.out.println(aL);
        System.out.println(lL);
        System.out.println(sL);

        // REMOVENDO
        final  long startTimeAL2 = System.nanoTime();
        aL.remove(7);
        final long endTimeAL2 = System.nanoTime();

        final  long startTimeLL2 = System.nanoTime();
        lL.remove(7);
        final long endTimeLL2 = System.nanoTime();

        final  long startTimeSL2 = System.nanoTime();
        sL.remove(7);
        final long endTimeSL2 = System.nanoTime();


        long totalTimeAL2 = endTimeAL2 - startTimeAL2;
        long totalTimeLL2 = endTimeLL2- startTimeLL2;
        long totalTimeSL2 = endTimeSL2 - startTimeSL2;

        System.out.println(aL);
        System.out.println(lL);
        System.out.println(sL);


        System.out.println("Tempo de execu????o para a cria????o do Arraylist= " + totalTimeAL);
        System.out.println("Tempo de execu????o para a cria????o do Linkedlist= " + totalTimeLL);
        System.out.println("Tempo de execu????o para a cria????o do Stack= " + totalTimeSL);

        System.out.println("============================================================");

        System.out.println("Tempo de execu????o para adicionar do Arraylist= " + totalTimeAL1);
        System.out.println("Tempo de execu????o para adicionar do Linkedlist= " + totalTimeLL1);
        System.out.println("Tempo de execu????o para a cria????o do Stack= " + totalTimeSL1);

        System.out.println("============================================================");

        System.out.println("Tempo de execu????o para remover do Arraylist= " + totalTimeAL2);
        System.out.println("Tempo de execu????o para remover do Linkedlist= " + totalTimeLL2);
        System.out.println("Tempo de execu????o para a cria????o do Stack= " + totalTimeSL2);
    }
}
