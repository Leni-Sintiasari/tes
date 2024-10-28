package tugas2;

import java.util.Scanner;

public class Driverclass {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
        String choice = "a";
        System.out.println("pilih gitar atau piano?" );
        choice = in.nextLine();

        if (choice.equalsIgnoreCase("Gitar")) {
            System.out.println("imputkan nama gitar: ");
            String name = in.nextLine();
            System.out.println("Gitar elektrik atau bukan: ");
            Boolean isElectric = in.nextBoolean();
            in.nextLine();
            System.out.println("imputkan numString: ");
            int numString = in.nextInt();
            System.out.println("imputkan harga gitar: ");
            double price = in.nextDouble();

            Guitar gtr1 = new Guitar(isElectric, name, price, numString);
            gtr1.print();

        } else if (choice.equalsIgnoreCase("piano")) {
            System.out.println("inputkan nama piano: ");
            String name = in.nextLine();
            System.out.println("tipe piano: ");
            String pianoType = in.nextLine();
            System.out.println("imputkan harga piano: ");
            double price = in.nextDouble();

            Piano p1 = new Piano(name, price, pianoType);
            p1.print();
        }
    }
 }

