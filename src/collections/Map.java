package collections;


import java.util.*;

public class Map {

    private static final HashMap<Integer, String> hashMapCars = new HashMap<>();
    private static final TreeMap<Integer, String> treeMapCars = new TreeMap<>();
    private static final LinkedHashMap<Integer, String> linkedHashMapCars = new LinkedHashMap<>();

    public static void main(String[] args) {


        // CREATE
        System.out.println("Create a Map cars:");

        HashMapCarsCreate();
        TreeMapCarsCreate();
        linkedHashMapCarsCreate();

        System.out.println("");

        //CREATE 1 OBJECT
        System.out.println("Create object 1:");

        HashMapCarsCreate(800000);
        TreeMapCarsCreate(800000);
        linkedHashMapCarsCreate(800000);

        System.out.println("");

        //READ
        System.out.println("Read:");

        HashMapCarsRead(900000);
        TreeMapCarsRead(900000);
        linkedHashMapCarsRead(900000);

        System.out.println("");

        //DELETE
        System.out.println("Delete:");

        HashMapCarsDelete(1000000);
        TreeMapCarsDelete(1000000);
        linkedHashMapCarsDelete(1000000);

        System.out.println("");
    }
    // #### INITIAL CREATE####

        //Hash
        public static void HashMapCarsCreate() {
            Long startTime = System.currentTimeMillis();
            String value = "Hash value";
            for (int i = 0; i < 10000000; i++) {
                hashMapCars.put(i, value);
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("HashMap create execution time: " + (endTime - startTime)
               + " ms " + " - "+"size: " + hashMapCars.size());
        }

        //Tree
        public static void TreeMapCarsCreate() {
        Long startTime = System.currentTimeMillis();
        String value = "Tree value";
        for (int i = 0; i < 10000000; i++) {
            treeMapCars.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap create execution time: " + (endTime - startTime)
                + " ms " + " - "+ "size: " + treeMapCars.size());
    }

        //Linked
        public static void linkedHashMapCarsCreate() {
        Long startTime = System.currentTimeMillis();
        String value = "Linked value";
        for (int i = 0; i < 10000000; i++) {
            linkedHashMapCars.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap create execution time: " + (endTime - startTime)
                + " ms " + " - "+ "size: "+ linkedHashMapCars.size());
    }

        //#### CREAT OBJECT ####


        //Hash
        public static void HashMapCarsCreate(int index) {
        Long startTime = System.nanoTime();
        String value = "Hash value";
        hashMapCars.put(index, value);
        Long endTime = System.nanoTime();
        System.out.println("HashMap create execution time: " + (endTime - startTime)
                + " ns " + " - "+ "size: " + hashMapCars.size());
    }
        // Tree
        public static void TreeMapCarsCreate(int index) {
        Long startTime = System.nanoTime();
        String value = "Tree value";
        treeMapCars.put(index, value);
        Long endTime = System.nanoTime();
        System.out.println("TreeMap create execution time: "  + (endTime - startTime)
                + " ns " + " - "+ "size: " + treeMapCars.size());
    }

        //Linked
        public static void linkedHashMapCarsCreate(int index) {
        Long startTime = System.nanoTime();
        String value = "Linked value";
        linkedHashMapCars.put(index, value);
        Long endTime = System.nanoTime();
        System.out.println("LinkedHashMap create execution time: " + (endTime - startTime)
                + " ns " + " - "+ "size: "+ linkedHashMapCars.size());
    }
       // #### READ ####

        //Hash
        public static void HashMapCarsRead(int index) {
        Long startTime = System.nanoTime();
        hashMapCars.get(index);
        Long endTime = System.nanoTime();
        System.out.println("HashMap read execution time: " + (endTime - startTime)
                + " ns " + " - "+ "last value: \"" + hashMapCars.size() + "\"");
    }
        //Tree
        public static void TreeMapCarsRead(int index) {
        Long startTime = System.nanoTime();
        treeMapCars.get(index);
        Long endTime = System.nanoTime();
        System.out.println("TreeMap execution time: " + (endTime - startTime)
                + " ns " + " - "+ "last value: \"" + treeMapCars.size() + "\"");
    }
        //Linked
        public static void linkedHashMapCarsRead(int index) {
        Long startTime = System.nanoTime();
        linkedHashMapCars.get(index);
        Long endTime = System.nanoTime();
        System.out.println("LinkedHashMap read execution time: " + (endTime - startTime)
                + " ns " + " - "+ "last value: \"" + linkedHashMapCars.size() + "\"");
    }

        // #### DELETE ####

        //Hash
        public static void HashMapCarsDelete(int index) {
        Long startTime = System.nanoTime();
        hashMapCars.remove(index);
        Long endTime = System.nanoTime();
        System.out.println("HashMap delete execution time: " + (endTime - startTime)
                + " ns " + " - "+ "size: " + hashMapCars.size());
    }
        //Tree
        public static void TreeMapCarsDelete(int index) {
        Long startTime = System.nanoTime();
        treeMapCars.remove(index);
        Long endTime = System.nanoTime();
        System.out.println("TreeMap delete execution time: " + (endTime - startTime)
                + " ns " + " - "+ "size: " + treeMapCars.size());
    }
        //Linked
        public static void linkedHashMapCarsDelete(int index) {
        Long startTime = System.nanoTime();
        linkedHashMapCars.remove(index);
        Long endTime = System.nanoTime();
        System.out.println("LinkedHashMap delete execution time: " + (endTime - startTime)
                + " ns " + " - "+ "size: "+ linkedHashMapCars.size());
    }

}

