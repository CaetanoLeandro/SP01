package collections;

import java.util.*;

public class List {


    private static ArrayList<Integer> arrayListCars = new ArrayList<>();
    private static Stack<Integer> stackListCars = new Stack<>();
    private static LinkedList<Integer> linkedListCars = new LinkedList<>();

    public static void main(String[] args) {

        // CREATE
        System.out.println("Create a Lists cars:");

        arrayListCarsCreate();
        stackListCarsCreate();
        linkedListCarsCreate();

        System.out.println("");

        //CREATE 1 OBJECT
        System.out.println("Create object 1:");

        arrayListCarsCreate(440000);
        stackListCarsCreate(440000);
        linkedListCarsCreate(440000);

        System.out.println("");

        //READ
        System.out.println("Read:");

        arrayListCarsRead(900000);
        stackListCarsRead(900000);
        linkedCarsListRead(900000);

        System.out.println("");

        //DELETE
        System.out.println("Delete:");

        arrayListCarsDelete(100000);
        stackListCarsDelete(1000000);
        linkedListCarsDelete(100000);

        System.out.println("");
      
        
    }

    // #### INITIAL CREATE####

    //Array
    public static void arrayListCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            arrayListCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList create execution time: " + (endTime - startTime)
                + " ms " + " - " + "Size: " + arrayListCars.size());

    }
    //Stack
    public static void stackListCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            stackListCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack create execution time: " + (endTime - startTime)
                + " ms " + " - "  + "Size: " + stackListCars.size());
    }
    //Linked
    public static void linkedListCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            linkedListCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList execution time: " + (endTime - startTime)
                + " ms " + " - "  + "Size: " + linkedListCars.size());
    }

    //#### CREAT OBJECT ####

    //Array
    public static void  arrayListCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        arrayListCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList execution time: " + (endTime - startTime)
                + " ms " + " - "  + "Size: " + arrayListCars.size());
    }
    //Stack
    public static void stackListCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        stackListCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList execution time: " + (endTime - startTime)
                + " ms " + " - "  + "Size: " + stackListCars.size());
    }
    //Linked
    public static void linkedListCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        linkedListCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList execution time: " + (endTime - startTime)
                + " ms " + " - "  + "Size: "  + linkedListCars.size());
    }

    // #### READ ####

    //Array
    public static void arrayListCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        int value = 0;
        linkedListCars.get(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList read execution time: " + (endTime - startTime)
                + " ms " + " - " + "Last value: \"" + value + "\"");
    }
    //Stack
    public static void stackListCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        int value = 0;
        linkedListCars.get(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack read execution time: " + (endTime - startTime)
                + " ms " + " - " + "Last value: \"" + value + "\"");
    }
    //Linked
    public static void linkedCarsListRead(int index) {
        Long startTime = System.currentTimeMillis();
        int value = 0;
        linkedListCars.get(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList read execution time: " + (endTime - startTime)
                + " ms " + " - "   + "Last value: \"" + value + "\"");
    }

    //#### DELETE ####

    //Array
    public static void arrayListCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        linkedListCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList delete execution time: " + (endTime - startTime)
                + " ms " + " - " + "Size: "  + arrayListCars.size());
    }
    //Stack
    public static void stackListCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        stackListCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack delete execution time: " + (endTime - startTime)
                + " ms " + " - "  + "Size: " + stackListCars.size());
    }
    //Linked
    public static void linkedListCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        linkedListCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList delete execution time: " + (endTime - startTime)
                + " ms " + " - " + "Size: " + linkedListCars.size());
    }
}
