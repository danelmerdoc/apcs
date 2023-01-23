/**
 * Daniel Murdoch
 * hw042
   Exercise the RaggedRoom class
   advised by no one
   worked with Tawseef Reza
 */
public class UserOfRaggedRoom {
     public static void main( String[] commandLine) {
 
         RaggedRoom room307 = new RaggedRoom();
 
         System.out.println(
                 System.lineSeparator()
               + "----- see room 307, with its ragged seating -----"
               + System.lineSeparator()
               + room307
               );
          /* Expecting, eventually, to see a filled-in version of...
                number of files: 5
                files
                0    ranks:  0 1 2 3 4 5 6 7
                     person: 0 1 2 ...     7
 
                1    ranks:  0 1 2 3 4 5
                     person: 8 9 ...   13
 
                2    ranks:  0 1 2 3 4 5
                     person: 14 ...    21
 
                3    ranks:  0 1 2 3 4 5 6
                     person:
 
                4    ranks:  0 1 2 3 4 5 6
                     person:     ...     33
          */
 
 
          // create and display a rectangular room
          System.out.println(
           System.lineSeparator()
      + "----- see a rectangular room from user input-----"
      + System.lineSeparator()
      + new RaggedRoom(stringToIntArray(commandLine))
      );
    }
    
 
 public static int[] stringToIntArray(String[] stringArray) {
     //turns an array of strings into an array of integers
      int[] intArray = new int[stringArray.length];
      for (int curPos = 0; curPos < intArray.length; curPos++) {
           intArray[curPos] = Integer.parseInt(stringArray[curPos]);
      }
      return intArray;
 }
 }
      
