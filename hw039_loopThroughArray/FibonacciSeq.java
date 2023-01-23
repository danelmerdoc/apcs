/**
 * Daniel Murdoch
 * hw039
   Represent a Fibonacci sequence
   worked with Aareeb
   advised by no one
 */
public class FibonacciSeq {

    // Create a private instance field to hold a
    // reference to an array of int values.
    private int[] seq;


    /**
       Initialize this object with an array of the
       first 8 Fibonacci numbers, starting at 1.
     */
    public void gimme8(int N) {
        seq = new int[N];
        int index = 0;
        while (index < N) {
            seq[0] = 1;
            seq[1] = 1;
            seq[++index + 1] = seq[index - 1] + seq[index - 2];
            // seq[8] = seq[7] + seq[6];
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
                at FibonacciSeq.gimme8(FibonacciSeq.java:24)
                at UserOfFibonacciSeq.main(UserOfFibonacciSeq.java:9) 
        */
        }
    }



    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result = "the sequence \n";
        int length = seq.length;
        int curPos = 0;

        while (curPos < length){
            result += seq[curPos++] +"\n";
        }
        return result + "number of array entries is" + length;

          
        }
    }


