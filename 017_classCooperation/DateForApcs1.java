/**
  Represent a date
 Daniel Murdoch
 hw018
 worked with no one
 advised Gloria and Aditya
 */

/*
Hw017 needs no fields. This stub code is just for reference
on the datatypes and names we aim to use.
    short year
    byte  month_0_11
    byte  day_1_31
*/


public class DateForApcs1{
    
    


short year;
byte month_0_11;
byte day_1_31;



public String iso8601() {
        return (year + "-" + (month_0_11 + 1) + "-" + day_1_31);
    }
public Boolean isLeapYear (){
    if (year % 4 == 0){
        if (year % 100 == 0){
            if (year % 400 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return true;
        }
    }
    else{
        return false;
    }
}
public Boolean isEarlyJuly(){
    if (month_0_11 > 6){
        return true;
    }
    else if (month_0_11 == 6 && day_1_31 < 16){
        return true;
    }
    else{
        return false;
    }
}
}



