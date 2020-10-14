package no.mostafam.software;


import java.util.Scanner;

    public class LeapYear {
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            Year newYear = new Year();

            System.out.println("enter the year to check: ");


            //denne metoden leser nummeret
            int year = scanner.nextInt();
            scanner.close();


            //her stenger vi scanner funksjonen etter lesing
            scanner.close();
            System.out.println("if true it is leap year if false it isn't:  " + (newYear.isLeapYear(year)));


        }
    }
