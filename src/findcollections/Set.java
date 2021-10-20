package findcollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {


            HashSet<String> hM = new HashSet<>();
            TreeSet<String> tM = new TreeSet<>();
            LinkedHashSet<String> lM = new LinkedHashSet<>();

            //Criando HashSet
            hM.add("0");
            hM.add("1");
            hM.add("2");
            hM.add("3");
            hM.add("4");

            //Criando TreeSet
            tM.add("0");
            tM.add("1");
            tM.add("2");
            tM.add("3");
            tM.add("4");

            //Criando LinkedSet
            lM.add("0");
            lM.add("1");
            lM.add("2");
            lM.add("3");
            lM.add("4");

            System.out.println("");
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("");

            System.out.println("HashSet (CRIANDO)");
            for (String hSet : hM){
                   System.out.println(hSet +" - "+ hM.hashCode());
            }
            System.out.println("");
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("");

            System.out.println("TreeSet (CRIANDO)");
            for (String tSet : tM){
                    System.out.println(tSet +" - "+ tM.hashCode());
            }
            System.out.println("");
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("");

            System.out.println("LikedHashSet (CRIANDO)");
            for (String lSet : lM){
                    System.out.println(lSet +" - "+ lM.hashCode());
            }

            //Inserindo ítem novo e já exsitente # HashSet
            final long startTimehMput1 = System.nanoTime();
            hM.add("9");
            final long endTimehMput1 = System.nanoTime();

            hM.add("2");
            //Removendo ítem
            final long startTimehMremove1 = System.nanoTime();
            hM.remove("4");
            final long endTimehMremove1 = System.nanoTime();

            //Inserindo ítem novo e já exsitente # TreeSet
            final long startTimetMput1 = System.nanoTime();
            tM.add("9");
            final long endTimetMput1 = System.nanoTime();

            tM.add("2");
            //Removendo ítem
            final long startTimetMremove1 = System.nanoTime();
            tM.remove("4");
            final long endTimetMremove1 = System.nanoTime();

            //Inserindo ítem novo e já exsitente # LinkedSet
            final long startTimelMput1 = System.nanoTime();
            lM.add("9");
            final long endTimelMput1 = System.nanoTime();

            lM.add("2");
            //Removendo ítem
            final long startTimelMremove1 = System.nanoTime();
            lM.remove("4");
            final long endTimelMremove1 = System.nanoTime();


            //HASHSet
            long totalTimehM1 = endTimehMput1 - startTimehMput1;
            long totalTimehM2 = endTimehMremove1 - startTimehMremove1;

            //TREESet
            long totalTimetM1 = endTimetMput1 - startTimetMput1;
            long totalTimetM2 = endTimetMremove1 - startTimetMremove1;

            //LINKEDSet
            long totalTimelM1 = endTimelMput1 - startTimelMput1;
            long totalTimelM2 = endTimelMremove1 - startTimelMremove1;

            System.out.println("");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("");

            System.out.println("hashSet (REMOVENDO #4 )\" E \"(INSERINDO #2 e #9)");
            for (String hSet : hM){
                    System.out.println(hSet +" - "+ hM.hashCode());
            }
            System.out.println("");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("");

            System.out.println("TreeSet (REMOVENDO #4 )\" E \"(INSERINDO #2 e #9)");
            for (String tSet : tM) {
                    System.out.println(tSet + " - " + tM.hashCode());
            }
            System.out.println("");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("");
            System.out.println("LikedHashSet (REMOVENDO #4 )\" E \"(INSERINDO #2 e #9)");
            for (String lSet : lM) {
                    System.out.println(lSet + " - " + lM.hashCode());
            }

            System.out.println("");
            System.out.println("##################################################");
            System.out.println("");
            System.out.println("HASHSET -> Tempo de execução para adicionar #9= " + totalTimehM1);
            System.out.println("HASHSET -> Tempo de execução para remover #4= " + totalTimehM2);
            System.out.println("");
            System.out.println("===================================================");
            System.out.println("");
            System.out.println("TREEHASHSET -> Tempo de execução para adicionar #9= " + totalTimetM1);
            System.out.println("TREEHASHSET -> Tempo de execução para remover #4= " + totalTimetM2);
            System.out.println("");
            System.out.println("===================================================");
            System.out.println("");
            System.out.println("LINKEDHASHSET -> Tempo de execução para adicionar #9= " + totalTimelM1);
            System.out.println("LINKEDHASHSET -> Tempo de execução para remover #4= " + totalTimelM2);

    }
}
