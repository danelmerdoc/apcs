/**
  Represent a date
 Daniel Murdoch
 hw017
 worked with no one
 advised by no one
 */

/*
Hw017 needs no fields. This stub code is just for reference
on the datatypes and names we aim to use.
    short year
    byte  month_0_11
    byte  day_1_31
*/
public class DateForApcs{
public static String iso8601(short year, byte month_0_11, byte day_1_31) {
        return (year + "-" + month_0_11 + "-" + day_1_31);
    }
public static Boolean IsLeapYear (short year){
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
}


