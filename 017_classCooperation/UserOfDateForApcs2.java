/**
 Exercise the DateForApcs class
 Represent a date
 Daniel Murdoch
 hw017
 worked with no one
 advised by Gloria and Aditya
 */
 
       
    public class UserOfDateForApcs2 {
                            
    public static void main(String[] commandLine) {

    DateForApcs2 date1969_07_20 = new DateForApcs2(); 
    date1969_07_20 = new DateForApcs2();
    date1969_07_20.year = 1969;
    date1969_07_20.month_0_11 = 7;
    date1969_07_20.day_1_31 = 20;
    

    DateForApcs2 date2038_07_04 = new DateForApcs2(); 
    date2038_07_04.year = 2038;
    date2038_07_04.month_0_11 = 7;
    date2038_07_04.day_1_31 = 4;

    System.out.println(date1969_07_20.iso8601());
    System.out.println(date1969_07_20.isLeapYear());
    System.out.println(date1969_07_20.isEarlyJuly());

    System.out.println(date2038_07_04.iso8601());
    System.out.println(date2038_07_04.isLeapYear());
    System.out.println(date2038_07_04.isEarlyJuly());

                               
                        
    }
}
