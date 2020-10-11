package no.mostafam.software;

public class Year {

        //her lager vi noe vedlikeholdbar.
        //flytter avgjørelse på en egen klasse
        //gjøre hele avgjørelsen for hva vi ønsker å skrive

        public boolean isLeapYear(int year){

            boolean output= false;

            if(year % 4!= 0){
                output = false;
            }
            else if(year % 400== 0){
                output = true;
            }
            else if((year % 4==0) &&(year %100 !=0)){
                output= true;
            }
            else if((year % 100==0) &&(year % 400 !=0)){
                output= false;
            }


            return output;
        }




    }
