/**
 * Daniel Murdoch
 * hw038
   Represent a Fibonacci sequence
   worked with no one
   advised by no one
  
 */
public class FibonacciSeq {

    // Create a private instance field to eventually
    // hold a reference to an array of int values.
    // your code here


    /**
       Initialize this object with an array of the
       first 8 Fibonacci numbers, starting at 1.
     */
    private int[] fibArray;
    public void gimme8() {
        fibArray = new int [8];
        fibArray[0] = 1;
        fibArray[1] = 1;
        fibArray[2] = 2;
        fibArray[3] = 3;
        fibArray[4] = 5;
        fibArray[5] = 8;
        fibArray[6] = 13;
        fibArray[7] = 21;

    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        int index = 0;
        result = "number of array entries available = " + fibArray.length + "\nthe sequence: \n";
        while (index < 8)
            result +=  fibArray[index++]  + "\n";
        return result;

        // return result;
    }

}
