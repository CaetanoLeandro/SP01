package collections;

import java.util.*;

public class Set {

    private static HashSet<Integer> hashSetCars = new HashSet<>();
    private static TreeSet<Integer> treeSetCars = new TreeSet<>();
    private static LinkedHashSet<Integer> linkedHashSetCars = new LinkedHashSet<>();

    public static void main(String[] args) {


        // CREATE
        System.out.println("Create a Set cars:");

        HashSetCarsCreate();
        TreeSetCarsCreate();
        linkedHashSetCarsCreate();

        System.out.println("");

        //CREATE 1 OBJECT
        System.out.println("Create object 1:");

        HashSetCarsCreate(80000);
        TreeSetCarsCreate(80000);
        linkedHashSetCarsCreate(80000);

        System.out.println("");

        //READ
        System.out.println("Read:");

        HashSetCarsRead(90000);
        TreeSetCarsRead(90000);
        linkedHashSetCarsRead(90000);

        System.out.println("");

        //DELETE
        System.out.println("Delete:");

        HashSetCarsDelete(100000);
        TreeSetCarsDelete(100000);
        linkedHashSetCarsDelete(100000);

        System.out.println("");
    }
    // #### INITIAL CREATE####

    //Hash
    public static void HashSetCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hashSetCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet create execution time: " + (endTime - startTime)
                + "size: " + hashSetCars.size());
    }

    //Tree
    public static void TreeSetCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            treeSetCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet create execution time: " + (endTime - startTime)
                + "size: " + treeSetCars.size());
    }

    //Linked
    public static void linkedHashSetCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedHashSetCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet create execution time: " + (endTime - startTime)
                + "size: "+ linkedHashSetCars.size());
    }

    //#### CREAT OBJECT ####


    //Hash
    public static void HashSetCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        hashSetCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet create execution time: " + (endTime - startTime)
                + "size: " + hashSetCars.size());
    }
    // Tree
    public static void TreeSetCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        treeSetCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet create execution time: "  + (endTime - startTime)
                + "size: " + treeSetCars.size());
    }

    //Linked
    public static void linkedHashSetCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        linkedHashSetCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet create execution time: " + (endTime - startTime)
                + "size: "+ linkedHashSetCars.size());
    }
    // #### READ ####

    //Hash
    public static void HashSetCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "No values read.";
        hashSetCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet read execution time: " + (endTime - startTime)
                + "last value: \"" + value + "\"");
    }
    //Tree
    public static void TreeSetCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "No values read.";
        treeSetCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet execution time: " + (endTime - startTime)
                + "last value: \"" + value + "\"");
    }
    //Linked
    public static void linkedHashSetCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "No values read.";
        linkedHashSetCars.add(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet read execution time: " + (endTime - startTime)
                + "last value: \"" + value + "\"");
    }

    // #### DELETE ####

    //Hash
    public static void HashSetCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        hashSetCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet delete execution time: " + (endTime - startTime)
                + "size: " + hashSetCars.size());
    }
    //Tree
    public static void TreeSetCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        treeSetCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet delete execution time: " + (endTime - startTime)
                + "size: " + treeSetCars.size());
    }

    //Linked
    public static void linkedHashSetCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        linkedHashSetCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet delete execution time: " + (endTime - startTime)
                + "size: "+ linkedHashSetCars.size());
    }

}

