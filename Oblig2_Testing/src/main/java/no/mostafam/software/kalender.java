package no.mostafam.software;

import java.util.Scanner;

public class kalender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the date: ");

        //denne metoden leser nummeret
        int number = scanner.nextInt();

        //her stenger vi scanner funksjonen etter lesing
        scanner.close();
        System.out.println("oki");
    }

}