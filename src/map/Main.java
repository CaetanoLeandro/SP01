package map;


import java.util.*;

public class Main {

    public static void main(String[] args) {


        // HASHMAP
        Map<String, Integer> Hmap = new HashMap<>();
        Hmap.put("Mustang Mach 1", 483);
        Hmap.put("Mustang Black Shadow", 466);
        Hmap.put("Mustang Shelby GT350", 533);
        for (String key : Hmap.keySet()) {
            System.out.println("Ford " + key + " = " + Hmap.get(key) + "HP");
        }

        System.out.println("");
        System.out.println(" ################################ ");
        System.out.println("");

        // TREEHMAP
        Map<String, Integer> tMap = new TreeMap<>();
        tMap.put("Mustang Mach 1", 483);
        tMap.put("Mustang Black Shadow", 466);
        tMap.put("Mustang Shelby GT350", 533);
        for (String key : tMap.keySet()) {
            System.out.println("Ford " + key + " = " + tMap.get(key) + "HP");
        }

        System.out.println("");
        System.out.println(" ################################ ");
        System.out.println("");

        // LINKEDHASHMAP
        Map<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("Mustang Mach 1", 483);
        lmap.put("Mustang Black Shadow", 466);
        lmap.put("Mustang Shelby GT350", 533);
        for (String key : lmap.keySet()) {
            System.out.println("Ford " + key + " = " + tMap.get(key) + "HP");
        }

        //HASHSET

        HashSet<String> HsMap = new HashSet<>();
        HsMap.add("Mustang Mach 1");
        HsMap.add("Mustang Black Shadow");
        HsMap.add("Mustang Shelby GT350");
        HsMap.add("Mustang Mach 1");
            System.out.println("Ford " + HsMap);
    }
}