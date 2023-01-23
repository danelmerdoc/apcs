/**
 * Daniel Murdoch
 * hw020
  Represent a date
 worked with noone
 advised by senpai Preston

 */
public class DateForApcs {


    // instance fields
    public short year;
    public byte  month_0_11;
    public byte  day_1_31;

    public short currentYear;
    public short REPRESENTS_YEARS_BEFORE;
    public short REPRESENTS_YEARS_STARTING;
    public byte weekdayAtCurrentDate;

    /**
      @return an ISO-8601 format of the date
      Processing courtesy of Intia
     */
    public static String iso8601( short year
                                , byte month_0_11
                                , byte day_1_31
                                ){
        String afterYear = "-"; 
        String afterMonth = "-"; 
        if( month_0_11 <= 8) afterYear =  "-0";
        if( day_1_31 <= 9)   afterMonth = "-0";
        return year + afterYear 
             + (month_0_11 + 1) + afterMonth
             + day_1_31;
    }
    public byte weekdayAtCurrentYearStart(){
        short takingLeapYearIntoAccount = year + year/4 - year/100 + year/400;
        return (byte) (day_1_31 + takingLeapYearIntoAccount + (31*(month_0_11+1))/12) % 7 - 1;
    }
    public byte advanceCurrentYear(){
        currentYear += 1;
        if (weekdayAtCurrentYearStart() < 5 && isLeapYear(currentYear) == true){
             (byte) weekdayAtCurrentYearStart() + 2;}
        else if (weekdayAtCurrentYearStart() < 6 && isLeapYear(currentYear) == false){
             (byte) weekdayAtCurrentYearStart() + 1;}
        else if  (weekdayAtCurrentYearStart() >= 5 && isLeapYear(currentYear) == true){
             (byte) weekdayAtCurrentYearStart() - 5;
        }
        else{
             0;
            }

    }

    public static boolean isLeapYear( short year) {
        return    year % 400 == 0
               ||    year % 4 == 0
                  && year % 100 != 0
               ;
    }


    public boolean isEarlyJuly() {
        return    month_0_11 < 6     // before July
               ||
                     month_0_11 == 6    // in July, so...
                  && day_1_31 < 16;   // check the day
         /* If neither of those is true, the date must
            be in a month after July.
         */
    }
}
