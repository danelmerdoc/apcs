/**
  Represent a date.

  All software needs fixing, always. Issues here include...
     header comments, in standard form
     public / private
     instance / class   for   fields and methods
     toString replaces iso8601
 */
public class DateForApcs {

    // limits of the years that this class can represent
    public static final short REPRESENTS_YEARS_STARTING = 1600;
    public static final short REPRESENTS_YEARS_BEFORE = 2501;

    // instance fields
    public short year;
    public byte  month_0_11;
    public byte  day_1_31;

    // class fields
    public static short currentYear = 2022;
    public static byte  weekdayAtCurrentYearStart = 6;  // Saturday

    /**
      Modify the currentYear and weekdayAtCurrentYearStart fields
      appropriately to reflect an object for the next year.
     */
    public static void advanceCurrentYear() {
        weekdayAtCurrentYearStart =
          (byte)
          ( ( weekdayAtCurrentYearStart
              + 365   // days in 1 common year
              + // leap days in this year
                (isLeapYear( currentYear) ? 1 : 0)
            ) % 7    // days in a week
          );
        currentYear += 1;
    }

    /**
      @return an ISO-8601 format of the date
      Processing courtesy of Intia
     */
    public static String toString(){
        String afterYear = "-";
        String afterMonth = "-";
        if( month_0_11 <= 8) afterYear =  "-0";
        if( day_1_31 <= 9)   afterMonth = "-0";
        return year + afterYear
             + (month_0_11 + 1) + afterMonth
             + day_1_31;
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
