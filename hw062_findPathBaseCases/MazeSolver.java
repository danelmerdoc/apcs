import javax.lang.model.util.ElementScanner14;

/**
  Solve a maze.

  The structure and some terms are based on
  https://en.wikipedia.org/wiki/Backtracking#Pseudocode
 */

public class MazeSolver {

    /**
      Construct an instance, using the default constructor,
      which does nothing.
     */


    /**
      @return STUB STUB STUB STUB STUB STUB STUB
      May modify "candidate".
     */
    public MazeWithExplorer findPath( MazeWithExplorer candidate) {
/* 
 This is to return an object representation of the explorerers path through the given maze to treasure 
 or null if no path exists
*/

        // base cases
        if( candidate.status() == -1) // stub
            return null;  // no path because explorer not on stepping stone or treasure
        else if (candidate.status() == 1)
          return candidate; //explorer on treasure, therefore path is found and object representation should be returned
        else 
          return null; //status is STATUS_MAYBE_PATH_THRU_HERE, to be replaced next assignment

    }
}
