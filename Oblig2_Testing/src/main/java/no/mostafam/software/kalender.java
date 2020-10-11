package no.mostafam.software;

import java.util.Scanner;

public class kalender {
    public static boolean main(String[] args) {
        //intialize the object
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter year: ");

        int scannYear = scanner.nextInt();


        //her stenger vi scanner funksjonen etter lesing
        int year = scannYear;

        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0) {
        } else if (year % 4 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return true;
        }

    }


}