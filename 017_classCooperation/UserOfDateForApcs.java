/**
 Exercise the DateForApcs class
 Represent a date
 Daniel Murdoch
 hw017
 worked with no one
 advised by no one
 */
 
        // System.out.println( "stub for labeling a result: "
                          // + Math.floor( -3.1)  // stub method invocation
                          // );
                          public class UserOfDateForApcs {
    
                            public static void main(String[] commandLine) {
                                System.out.println(DateForApcs.iso8601((short)2017, (byte)11, (byte) 30));
                                System.out.println(DateForApcs.iso8601((short)1995, (byte)1,(byte) 23));
                                System.out.println(DateForApcs.iso8601((short)2022, (byte)10, (byte)20));

                                System.out.println(DateForApcs.IsLeapYear((short)2017));
                                System.out.println(DateForApcs.IsLeapYear((short)1692));
                                System.out.println(DateForApcs.IsLeapYear((short)2000));
                                System.out.println(DateForApcs.IsLeapYear((short)2338));
                                System.out.println(DateForApcs.IsLeapYear((short)2077));

                               
                        
                            }
                        }
