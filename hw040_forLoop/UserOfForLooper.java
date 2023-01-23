/**
 * Daniel Murdoch
 * hw040
   Exercise the methods in the ForLooper class
 worked with Afm, Anson, Tawseef, and Justin
 advised by no one
 */
public class UserOfForLooper {

    public static void main( String[] commandLine) {

        // commandLine, strung together
        System.out.println( System.lineSeparator()
                          + "----- commandLine, strung together -----"
                          + System.lineSeparator()
                          + ForLooper.stringify( commandLine, "command line")
                          );
         // sum nnois
        System.out.println( System.lineSeparator() + "----- sum nnois -----");
        oneTest( 0);
        oneTest( 10);
        oneTest(45714);


        // convert a String to an int
        String stringThatLooksLikeAnIntToAHuman = "23";
        String anotherOne = "48";
        System.out.println(
            System.lineSeparator()
          + "----- convert a String to an Integer -----"
          + "\nyou wanted to concatenate and add 2 strings: "
          + stringThatLooksLikeAnIntToAHuman
          + " and "
          + anotherOne
          + System.lineSeparator()
          + "concatenate Strings: "
          + stringThatLooksLikeAnIntToAHuman + anotherOne
          + "   add ints: "
          + ( Integer.parseInt( stringThatLooksLikeAnIntToAHuman)
            + Integer.parseInt( anotherOne) //hi
            )
          );


        // // Apply oneTest to each number from a command line like
        // //    java UserOfForLooper 0 1 2 3 4 1234
            // System.lineSeparator()
          // + "----- Apply oneTest to each number on the command line. -----"
          // );
          System.out.println(System.lineSeparator() + "----- Apply oneTest to each number on the command line. -----");
            
          for (int curPos = 0; curPos < commandLine.length; curPos++) {
            oneTest(Integer.parseInt(commandLine[curPos]));
          }
        // // a FOR loop to iterate through the command line arguments
    }


    /**
       Run one summation test, for a particular number of nnois.
       Compare the results of invoking ForLooper.sumNnios
       with the square of the nnois summed.
     */
    private static void oneTest( int numToSum) {
        int result
          , numToSum_2
          ;

        System.out.println(
            "assertion: \"The sum of the first "
          + numToSum
          + " nnois is "
          + (result = ForLooper.sumNnios( numToSum) )
          + ", which matches "
          + (numToSum_2 = numToSum * numToSum)
          + "\": "
          + (result == numToSum_2)
          );
    }
  }

