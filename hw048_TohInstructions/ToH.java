/**
   Represent a solution to the Towers of Hanoi puzzle
 */
public class ToH {

private int nDisks;
private String from_saysRequestingEntity
             , to_saysRequestingEntity
             , spare_saysRequestingEntity
             ;
private Move[] moves;
private int nMoves;  // # of moves calculated so far.
  /* Usefully, this is the offset into "moves" of the next
     slot to be populated
  */


    /**
      Construct an instance
     */
    public ToH( int nDisks
              , String from
              , String to
              , String spare
              ) {
        this.nDisks = nDisks;
        from_saysRequestingEntity = from;
        to_saysRequestingEntity = to;
        spare_saysRequestingEntity = spare;

        // create an empty array of "moves
        moves = new Move[(int) (Math.pow(2, nDisks) - 1)];
    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        result =   "To move " + nDisks + " disks"
                 + " from " + from_saysRequestingEntity
                 + " to " + to_saysRequestingEntity
                 + " using " + spare_saysRequestingEntity
                 + " if necessary:" + System.lineSeparator()
                 + ToH.Move[]
                 ;
             // report the "moves", using Move.toString()
             
             return result;
    }


    /**
       Populate "moves" for the given problem.
     */
    public /* instance */ void generateAllMoves() {
        
        generateMoves( nDisks
                     , from_saysRequestingEntity
                     , to_saysRequestingEntity
                     , spare_saysRequestingEntity
                     );
    }


    /**
       Recursively add to "moves" for a particular point
       in the problem, as specified in the parameters.
     */
    private /* instance */ void generateMoves( int nDisks
                                             , String from
                                             , String to
                                             , String spare
                                            ) {
        // stub
        
        if (nDisks == 1) {
          // base case
          System.out.println( "Move the top disc at " + from + " ----> " + to);
        } 
        else {
          // recursive case
          generateMoves(nDisks - 1, from, spare, to);
          
          
           System.out.println("Move the top disc at " + from + " ----> " + to);
          
          
          generateMoves(nDisks - 1, spare, to, from);
        }
        
    }

}