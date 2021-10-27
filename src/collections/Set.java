package collections;

import com.sun.jdi.Value;

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

        HashSetCarsCreate(800000);
        TreeSetCarsCreate(800000);
        linkedHashSetCarsCreate(800000);

        System.out.println("");

        //READ
        System.out.println("Read:");

        HashSetCarsRead(900000);
        TreeSetCarsRead(900000);
        linkedHashSetCarsRead(900000);

        System.out.println("");

        //DELETE
        System.out.println("Delete:");

        HashSetCarsDelete(7000000);
        TreeSetCarsDelete(7000000);
        linkedHashSetCarsDelete(7000000);

        System.out.println("");
    }
    // #### INITIAL CREATE####

    //Hash
    public static void HashSetCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            hashSetCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet create execution time: " + (endTime - startTime)
                + " ms " + " - "  + "size: " + hashSetCars.size());
    }

    //Tree
    public static void TreeSetCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            treeSetCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet create execution time: " + (endTime - startTime)
                + " ms " + " - "  + "size: " + treeSetCars.size());
    }

    //Linked
    public static void linkedHashSetCarsCreate() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            linkedHashSetCars.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet create execution time: " + (endTime - startTime)
                + " ms " + " - " + "size: "+ linkedHashSetCars.size());
    }

    //#### CREAT OBJECT ####


    //Hash
    public static void HashSetCarsCreate(int index) {
        Long startTime = System.nanoTime();
        hashSetCars.add(index);
        Long endTime = System.nanoTime();
        System.out.println("HashSet create execution time: " + (endTime - startTime)
                + " ns " + " - " + "size: " + hashSetCars.size());
    }
    // Tree
    public static void TreeSetCarsCreate(int index) {
        Long startTime = System.nanoTime();
        treeSetCars.add(index);
        Long endTime = System.nanoTime();
        System.out.println("TreeSet create execution time: "  + (endTime - startTime)
                + " ns " + " - "+ "size: " + treeSetCars.size());
    }

    //Linked
    public static void linkedHashSetCarsCreate(int index) {
        Long startTime = System.nanoTime();
        linkedHashSetCars.add(index);
        Long endTime = System.nanoTime();
        System.out.println("LinkedHashSet create execution time: " + (endTime - startTime)
                + " ns " + " - " + "size: "+ linkedHashSetCars.size());
    }
    // #### READ ####

    //Hash
    public static void HashSetCarsRead(int index) {
        Long startTime = System.nanoTime();
        hashSetCars.add(index);
        Long endTime = System.nanoTime();
        System.out.println("HashSet read execution time: " + (endTime - startTime)
                + " ns " + " - " + "last value: \"" + hashSetCars.size() + "\"");
    }
    //Tree
    public static void TreeSetCarsRead(int index) {
        Long startTime = System.nanoTime();
        treeSetCars.add(index);
        Long endTime = System.nanoTime();
        System.out.println("TreeSet execution time: " + (endTime - startTime)
                + " ns " + " - " + "last value: \"" + treeSetCars.size() + "\"");
    }
    //Linked
    public static void linkedHashSetCarsRead(int index) {
        Long startTime = System.nanoTime();
        linkedHashSetCars.add(index);
        Long endTime = System.nanoTime();
        System.out.println("LinkedHashSet read execution time: " + (endTime - startTime)
                + " ns " + " - " + "last value: \"" + linkedHashSetCars.size() + "\"");
    }

    // #### DELETE ####

    //Hash
    public static void HashSetCarsDelete(int index) {
        Long startTime = System.nanoTime();
        hashSetCars.remove(index);
        Long endTime = System.nanoTime();
        System.out.println("HashSet delete execution time: " + (endTime - startTime)
                + " ns " + " - " + "size: " + hashSetCars.size());
    }
    //Tree
    public static void TreeSetCarsDelete(int index) {
        Long startTime = System.nanoTime();
        treeSetCars.remove(index);
        Long endTime = System.nanoTime();
        System.out.println("TreeSet delete execution time: " + (endTime - startTime)
                + " ns " + " - " + "size: " + treeSetCars.size());
    }

    //Linked
    public static void linkedHashSetCarsDelete(int index) {
        Long startTime = System.nanoTime();
        linkedHashSetCars.remove(index);
        Long endTime = System.nanoTime();
        System.out.println("LinkedHashSet delete execution time: " + (endTime - startTime)
                + " ns " + " - " + "size: "+ linkedHashSetCars.size());
    }

}

