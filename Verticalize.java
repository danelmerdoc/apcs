/**
 Loop through the characters in a string, introducing
 line separators
 */

public class Verticalize {

    /**
      First cut, expecting
          V
          e
          r
          t
          i
          c
          a
          l
          i
          z
          e

          m
          e
          !
     */
    public static void main( String[] commandLine) {
        String input = "Verticalize me!";
        int charNum = 0;
        int length = input.length();

        while(charNum < length) {
            System.out.println(input.substring(charNum, charNum + 1));
            charNum += 1;
        }
    }

}
