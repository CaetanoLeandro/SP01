package mapB;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); // lê um arquivo com nome e quantidade dos veículos

        Map<String, Integer> carsInStock = new LinkedHashMap<>();

        System.out.println("Enter file full path: "); // /home/caetano/Área de Trabalho/Dealer
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //abre o aquivo

            String line = br.readLine(); // lê o arquivo, linha a linha
            while (line != null) {

                String[] fields = line.split(",");
                String brand = fields[0];
                int count = Integer.parseInt(fields[1]);


                if (carsInStock.containsKey(brand)) {
                    int availableCars = carsInStock.get(brand);
                    carsInStock.put(brand, count + availableCars);

                } else {
                    carsInStock.put(brand, count);
                }
                line = br.readLine();
            }

            for (String key : carsInStock.keySet()) {
                System.out.println(key + ": " + carsInStock.get(key));
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

     } catch (NumberFormatException e) {
           System.out.println("Error: " + e.getMessage());

       } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
       }

    }
}

