/**
  Daniel Murdoch
 hw029
 worked with nobody
 advised by nobody
 */
public class UserOfDateForApcs {

    public static void main( String[] commandLine) {

        // display limits of the years that this class can represent
        System.out.println( System.lineSeparator()
                  + "----- limits of years -----");
        System.out.println( DateForApcs.REPRESENTS_YEARS_STARTING );
        System.out.println( DateForApcs.REPRESENTS_YEARS_BEFORE );

        // advanceCurrentYear test
        System.out.println( System.lineSeparator()
                          + "----- advanceCurrentYear test -----");
        advanceTest();
        advanceTest();
        advanceTest();
        advanceTest();

        // // iso8601 test
        // System.out.println( System.lineSeparator()
                          // + "----- iso8601 test -----");
        // System.out.println( //expect 2001-09-11
           // DateForApcs.iso8601((short) 2001, (byte)8, (byte)11));
        // System.out.println();

        // // isLeapYear tests
        // leapTest( 1999);
        // leapTest( 2000);
        // leapTest( 2004);
        // leapTest( 2100);
        // System.out.println();

        // // hw018#4, from Piazza@130
        // DateForApcs moonLanding =   myDateForApcs( 1969, 7, 20);
        // DateForApcs futureTrouble = myDateForApcs( 2038, 7,  4);
        // System.out.println();

        // // hw018#5 isEarlyJuly
        // earlyTest( moonLanding);
        // earlyTest( futureTrouble);

        // // change futureTrouble to other dates to test
        // futureTrouble.month_0_11 = 05;  // June precedes July 16
        // futureTrouble.day_1_31 = 17;
        // earlyTest( futureTrouble);

        // // early November follows July 16
        // futureTrouble.month_0_11 = 10;
        // futureTrouble.day_1_31 = 12;
        // earlyTest( futureTrouble);
    }


    /**
      Display starts of years with leaping days
     */
    private static void advanceTest() {
        DateForApcs.advanceCurrentYear();
        System.out.println( DateForApcs.currentYear
                          + " starts on day "
                          + DateForApcs.weekdayAtCurrentYearStart);
    }


    /**
      Display whether a date is before July 16 in its year
     */
     private static void earlyTest( DateForApcs d) {
        String notOrNothing; // string " not" or nothing

        if( d.isEarlyJuly())
             notOrNothing = "";
        else notOrNothing = " not";

        System.out.println(
            DateForApcs.toString( d.year
                             , d.month_0_11
                             , d.day_1_31
                             )
          + " is" + notOrNothing
          + " before July 16 in its year"
          );
     }


    /**
      Build, display, and return a DateForApcs
     */
    /*private static
    DateForApcs myDateForApcs( int yyyy
                             , int mm
                             , int dd
                             ) {
        DateForApcs myDate;
        myDate = new DateForApcs();

        myDate.year = (short) yyyy;
        myDate.month_0_11 = (byte) (mm - 1);
        myDate.day_1_31 = (byte) dd;

        // check
        System.out.println(
            "built: "
          +  DateForApcs.toString( myDate.year
                                , myDate.month_0_11
                                , myDate.day_1_31
                                )

          + " ...expecting " + yyyy + "-" + mm + "-" + dd
          + " possibly with 0s added"
          );

        return myDate;
     }*/


    /**
      Display whether the year is a leap year.
     */
    /*public static void leapTest( int year
                               ) {
        String notOrNothing; // string " not" or nothing

        if( DateForApcs.isLeapYear((short) year))
             notOrNothing = "";
        else notOrNothing = " not";

        System.out.println( year + " is"
                          + notOrNothing
                          + " a leap year"
                          );
    }*/
}



