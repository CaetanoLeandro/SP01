package findcollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {


    public static void main(String[] args) {

        HashMap<Integer, String> hM = new HashMap<>();
        TreeMap<Integer, String> tM = new TreeMap<>();
        LinkedHashMap<Integer, String> lM = new LinkedHashMap<>();

        //Criando HashMap
        hM.put(0, "Posição 0");
        hM.put(1, "Posição 1");
        hM.put(2, "Posição 2");
        hM.put(3, "Posição 3");
        hM.put(4, "Posição 4");

        //Criando TreeMap
        tM.put(0, "Posição 0");
        tM.put(1, "Posição 1");
        tM.put(2, "Posição 2");
        tM.put(3, "Posição 3");
        tM.put(4, "Posição 4");

        //Criando LinkedMap
        lM.put(0, "Posição 0");
        lM.put(1, "Posição 1");
        lM.put(2, "Posição 2");
        lM.put(3, "Posição 3");
        lM.put(4, "Posição 4");

        System.out.println("");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");

        System.out.println("HashMap (CRIANDO)");
        for (Integer key : hM.keySet()){
            String value = hM.get(key);
            System.out.println("Chave "+ key +" - "+ value);
        }
        System.out.println("");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");

        System.out.println("TreeMap (CRIANDO)");
        for (Integer key : tM.keySet()){
            String value = tM.get(key);
            System.out.println("Chave "+ key +" - "+ value);
        }
        System.out.println("");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");

        System.out.println("LikedHashMap (CRIANDO)");
        for (Integer key : lM.keySet()){
            String value = lM.get(key);
            System.out.println("Chave "+ key +" - "+ value);
        }

        //Inserindo ítem novo e já exsitente # HashMap
        final long startTimehMput1 = System.nanoTime();
        hM.put(9, "Posição 9");
        final long endTimehMput1 = System.nanoTime();

        hM.put(2, "Posição 2");
        //Removendo ítem
        final long startTimehMremove1 = System.nanoTime();
        hM.remove(4);
        final long endTimehMremove1 = System.nanoTime();

        //Inserindo ítem novo e já exsitente # TreeMap
        final long startTimetMput1 = System.nanoTime();
        tM.put(9, "Posição 9");
        final long endTimetMput1 = System.nanoTime();

        tM.put(2, "Posição 2");
        //Removendo ítem
        final long startTimetMremove1 = System.nanoTime();
        tM.remove(4);
        final long endTimetMremove1 = System.nanoTime();

        //Inserindo ítem novo e já exsitente # LinkedMap
        final long startTimelMput1 = System.nanoTime();
        lM.put(9, "Posição 9");
        final long endTimelMput1 = System.nanoTime();

        lM.put(2, "Posição 2");
        //Removendo ítem
        final long startTimelMremove1 = System.nanoTime();
        lM.remove(4);
        final long endTimelMremove1 = System.nanoTime();


        //HASHMAP
        long totalTimehM1 = endTimehMput1 - startTimehMput1;
        long totalTimehM2 = endTimehMremove1 - startTimehMremove1;

        //TREEMAP
        long totalTimetM1 = endTimetMput1 - startTimetMput1;
        long totalTimetM2 = endTimetMremove1 - startTimetMremove1;

        //LINKEDMAP
        long totalTimelM1 = endTimelMput1 - startTimelMput1;
        long totalTimelM2 = endTimelMremove1 - startTimelMremove1;

        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        System.out.println("hashMap (REMOVENDO #4 )\" E \"(INSERINDO #2 e #9)");
        for (Integer key : hM.keySet()){
            String value = hM.get(key);
            System.out.println("Chave "+ key +" - "+ value);
        }
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        System.out.println("TreeMap (REMOVENDO #4 )\" E \"(INSERINDO #2 e #9)");
        for (Integer key : tM.keySet()){
            String value = tM.get(key);
            System.out.println("Chave "+ key +" - "+ value);
        }
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("LikedHashMap (REMOVENDO #4 )\" E \"(INSERINDO #2 e #9)");
        for (Integer key : lM.keySet()){
            String value = lM.get(key);
            System.out.println("Chave "+ key +" - "+ value);
        }
        System.out.println("");
        System.out.println("##################################################");
        System.out.println("");
        System.out.println("HASHMAP -> Tempo de execução para adicionar #9= " + totalTimehM1);
        System.out.println("HASHMAP -> Tempo de execução para remover #4= " + totalTimehM2);
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("TREEHASHMAP -> Tempo de execução para adicionar #9= " + totalTimetM1);
        System.out.println("TREEHASHMAP -> Tempo de execução para remover #4= " + totalTimetM2);
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("LINKEDHASHMAP -> Tempo de execução para adicionar #9= " + totalTimelM1);
        System.out.println("LINKEDHASHMAP -> Tempo de execução para remover #4= " + totalTimelM2);
    }

}
