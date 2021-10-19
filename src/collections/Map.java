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

        HashMapCarsCreate(80000);
        TreeMapCarsCreate(80000);
        linkedHashMapCarsCreate(80000);

        System.out.println("");

        //READ
        System.out.println("Read:");

        HashMapCarsRead(90000);
        TreeMapCarsRead(90000);
        linkedHashMapCarsRead(90000);

        System.out.println("");

        //DELETE
        System.out.println("Delete:");

        HashMapCarsDelete(100000);
        TreeMapCarsDelete(100000);
        linkedHashMapCarsDelete(100000);

        System.out.println("");
    }
    // #### INITIAL CREATE####

        //Hash
        public static void HashMapCarsCreate() {
            Long startTime = System.currentTimeMillis();
            String value = "temp value";
            for (int i = 0; i < 100000; i++) {
                hashMapCars.put(i, value);
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("HashMap create execution time: " + (endTime - startTime)
                    + "size: " + hashMapCars.size());
        }

        //Tree
        public static void TreeMapCarsCreate() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 100000; i++) {
            treeMapCars.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap create execution time: " + (endTime - startTime)
                + "size: " + treeMapCars.size());
    }

        //Linked
        public static void linkedHashMapCarsCreate() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 100000; i++) {
            linkedHashMapCars.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap create execution time: " + (endTime - startTime)
                + "size: "+ linkedHashMapCars.size());
    }

        //#### CREAT OBJECT ####


        //Hash
        public static void HashMapCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        hashMapCars.put(index, value);
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap create execution time: " + (endTime - startTime)
                + "size: " + hashMapCars.size());
    }
        // Tree
        public static void TreeMapCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        treeMapCars.put(index, value);
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap create execution time: "  + (endTime - startTime)
                + "size: " + treeMapCars.size());
    }

        //Linked
        public static void linkedHashMapCarsCreate(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        linkedHashMapCars.put(index, value);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap create execution time: " + (endTime - startTime)
                + "size: "+ linkedHashMapCars.size());
    }
       // #### READ ####

        //Hash
        public static void HashMapCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "No values read.";
        hashMapCars.get(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap read execution time: " + (endTime - startTime)
                + "last value: \"" + value + "\"");
    }
        //Tree
        public static void TreeMapCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "No values read.";
        treeMapCars.get(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap execution time: " + (endTime - startTime)
                + "last value: \"" + value + "\"");
    }
        //Linked
        public static void linkedHashMapCarsRead(int index) {
        Long startTime = System.currentTimeMillis();
        String value = "No values read.";
        linkedHashMapCars.get(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap read execution time: " + (endTime - startTime)
                + "last value: \"" + value + "\"");
    }

        // #### DELETE ####

        //Hash
        public static void HashMapCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        hashMapCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap delete execution time: " + (endTime - startTime)
                + "size: " + hashMapCars.size());
    }
        //Tree
        public static void TreeMapCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        treeMapCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap delete execution time: " + (endTime - startTime)
                + "size: " + treeMapCars.size());
    }

        //Linked
        public static void linkedHashMapCarsDelete(int index) {
        Long startTime = System.currentTimeMillis();
        linkedHashMapCars.remove(index);
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap delete execution time: " + (endTime - startTime)
                + "size: "+ linkedHashMapCars.size());
    }

}

