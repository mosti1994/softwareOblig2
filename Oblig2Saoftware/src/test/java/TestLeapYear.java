import no.mostafam.software.Year;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestLeapYear {

        // må lage tester for hvert eneste krav fra akseptansekrav
        //viktig å lage enkelte tester for hvert eneste.
        Year verifing = new Year();


        @Test
        public void test_Divides_By_Four_not_hundred_Int_LeapYear() {



            //sjekker om det stemmer om det er skuddår
            assertTrue(verifing.isLeapYear(4));
            assertTrue(verifing.isLeapYear(8));

        }

        @Test
        public void test_Divides_By_FourHoundred_Int_LeapYear() {

            //sjekker om det stemmer om det er skuddår

            assertTrue(verifing.isLeapYear(400));
            assertTrue(verifing.isLeapYear(800));


        }



    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600, 2000})
    public void test_Divides_By_FourHoundred_Int_LeapYear_Parameterized_Test(int testing) {

        //sjekker om det stemmer om det er skuddår

        assertTrue(verifing.isLeapYear(testing));
    }

       /* @Test
        public void test_Not_Divisible_by_four(){
            assertFalse(verifing.isLeapYear(300));
            assertFalse(verifing.isLeapYear(600));
            assertFalse(verifing.isLeapYear(900));

        }

        */


    @ParameterizedTest
    @ValueSource(ints = {600, 900, 1500, 1800, 2100})
    public void test_Not_Divisible_by_four_Parameterized_Test(int test){
        assertFalse(verifing.isLeapYear(test));


    }

        @Test
        public void test_Divisible_By_hundred_Not_Divisible_by_FourHundred(){
            assertFalse(verifing.isLeapYear(100));
            assertFalse(verifing.isLeapYear(1500));




        }


    }


