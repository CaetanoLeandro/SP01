package listB;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Dealership> list = new ArrayList<>();

        System.out.println("How many vehicles, will be registered?");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println();
            System.out.println("Vehicle #" + (i + 1) + ":");
            System.out.print("License Plate: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
            System.out.println("License Plate already taken! Try again: ");
                id = sc.nextInt();
        }

            System.out.print("Car: ");
            sc.nextLine();
            String brandModel  = sc.nextLine();
            System.out.print("Value: ");
            Double carsValue = sc.nextDouble();

            Dealership emp = new Dealership(id,brandModel,carsValue);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the vehicle id that will have discount : ");//Adiciona o desconto no veículo selecionado
        int idVehicle = sc.nextInt();

        Dealership emp = list.stream().filter(x -> x.getNumberId() == idVehicle ).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This vehicle does not exist!");
        }
        else {
            System.out.print("Enter the discount: ");
            double discount = sc.nextDouble();
            emp.discountValue(discount);
        }

        System.out.println();
        System.out.println("List of vehicle:");
        for (Dealership e : list) {
            System.out.println(e);

        }

        sc.close();
    }

    public static Integer position(List<Dealership> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumberId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Dealership> list, int id) {
       Dealership emp = list.stream().filter(x -> x.getNumberId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
