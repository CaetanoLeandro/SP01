package map;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)  throws ParseException {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> carsInStock = new LinkedHashMap<>();

        System.out.println("Enter file full path: "); // /home/caetano/IdeaProjects/sprint_01
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

        String line = br.readLine();
        while (line != null){

            String[] fields = line.split(",");
            String brand= fields[0];
            int count = Integer.parseInt(fields[1]);

            if (carsInStock.containsKey(brand)) {
                int availableCars = carsInStock.get(brand);
                carsInStock.put(brand, count + availableCars);
            }
            else{
                carsInStock.put(brand, count);
            }
            line = br.readLine();
        }

        for (String key : carsInStock.keySet()) {
            System.out.println(key +": " + carsInStock.get(key));
        }

    } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
