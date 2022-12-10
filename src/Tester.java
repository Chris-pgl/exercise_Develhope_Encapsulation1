import com.sun.jdi.StringReference;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        House house1 = new House();

        System.out.println("Dove si trova la casa? ");
        house1.setAddress(scanner.nextLine());

        System.out.println("Inserisci il numero di piani ");
        house1.setFloorsNumber(scanner.nextInt());

        System.out.println("Scrivi il nome dei residenti separati da una virgola: ");
        house1.setResidentsName(scanner.next().split(","));



        System.out.printf("La casa si trova in via: %s %n",house1.getAddress());
        System.out.printf("La casa ha %d Piani %n",house1.getFloorsNumber());
        System.out.println("I residenti sono: "+ Arrays.toString(house1.getResidentsName()));


    }
}