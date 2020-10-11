import no.mostafam.software.Year;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestLeapYear {

        // må lage tester for hvert eneste krav fra akseptansekrav
        //viktig å lage enkelte tester for hvert eneste.
        Year numberformatting = new Year();


        @Test
        public void test_Divides_By_Four_not_hundred_Int_LeapYear() {

            //sjekker om det stemmer om det er skuddår
            assertEquals(true, numberformatting.isLeapYear(4));
            assertEquals(true, numberformatting.isLeapYear(8));

        }

        @Test
        public void test_Divides_By_FourHoundred_Int_LeapYear() {

            //sjekker om det stemmer om det er skuddår

            assertEquals(true, numberformatting.isLeapYear(400));
            assertEquals(true, numberformatting.isLeapYear(800));


        }

        @Test
        public void test_Not_Divisible_by_four(){
            assertEquals(false, numberformatting.isLeapYear(300));
            assertEquals(false, numberformatting.isLeapYear(600));
            assertEquals(false, numberformatting.isLeapYear(900));

        }

        @Test
        public void test_Divisible_By_hundred_Not_Divisible_by_FourHundred(){
            assertEquals(false, numberformatting.isLeapYear(100));
            assertEquals(false, numberformatting.isLeapYear(1500));




        }


    }


