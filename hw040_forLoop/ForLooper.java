/**
 *  Daniel Murdoch
 *  hw040
 *  worked with Afm, Anson, and Justin
 *  advised by no one
   Hold methods illustrating looping using FOR

   Contrary to good Javafication, this class is not a user-defined
   datatype. Rather, for pedagogic convenience, it is just a collection
   of methods aimed at learning to write FOR loops.
 */
public class ForLooper {

    /**
       @return a string representation of "me",
               starting with "label",
               including the count of elements, followed by
               elements surrounded by vertical bars (|)
     */
    public static String stringify (String[] me , String label){
        // stub for a declaration of "me" as a reference to an array of Strings
      
        String result =   label
                        + " has "
                        + me.length
                        +" elements: ";

        for (int index = 0; index<me.length ; index++){
          
          result+= "|"+ me[index] + "|, ";
        }

        return result;
    }
     /**
       sumNnios
       @return the sum of the smallest "numToSum"
               Non-Negative Odd Integers (nnios)
     */
    public static int sumNnios( int numToSum) {
      
      int accum = 0;

      // stub that adds two nnois of interest
      //accum =   numToSum * numToSum;                
      // smallest nnoi
      // largest nnoi to include
      for (int index = 0; index < numToSum; ++index){
        accum += 2 * index + 1;
      }
      return accum;
  }
}
