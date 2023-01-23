public class MazeSolver {

    /**
      @return an object that represents an explorer's path
              through a maze to a treasure,
              or null if no path exists
     */
      public MazeWithExplorer findPath( MazeWithExplorer candidate) {

        /* for debugging, show the MazeWithExplorer that this invocation
           starts with */
        System.out.println(
            "candidate in findPath: " + System.lineSeparator()
          + candidate
          + System.lineSeparator());

        // base cases
        int status = candidate.status();
        if( status == candidate.STATUS_NO_PATH_THRU_HERE) return null;
        if( status == candidate.STATUS_PATH_EXISTS)       return candidate;

        /* recursive case: status is STATUS_MAYBE_PATH_THRU_HERE
           When the recursive abstraction is asked to return
           [request, from above]
           the recursive abstraction can follow these instructions
           to return an object that represents an explorer's path
           through a maze to a treasure after the explorer has
           moved one position, or null if no path exists.
        */
        else {  // on stepping stone, status == STATUS_MAYBE_PATH_THRU_HERE


            // ways to extend a candidate
            final int[] DIRECTIONS =
              { MazeWithExplorer.EAST
              , MazeWithExplorer.NORTH
              , MazeWithExplorer.WEST
              , MazeWithExplorer.SOUTH
              };

            int dirIndex = 0;
            while(dirIndex < DIRECTIONS.length) {
                /* Create a snapshot of the candidate, so that,
                   if a trial direction fails to find the treasure,
                   findPath can return to configuration at invocation.
                */
                MazeWithExplorer snapshot = new MazeWithExplorer(candidate);

                candidate.dropBreadcrumbAndGo(DIRECTIONS[dirIndex]);
                MazeWithExplorer path = findPath(candidate);

                /* If there is no treasure in that direction,
                   0.  Use the snapshot to re-create the candidate's
                   previous configuration.
                   1. Try another direction.
                */
                if(path == null) {
                    candidate = new MazeWithExplorer(snapshot);
                    dirIndex++;
                }
                else return path;
            }

        }

        return null;
    }
}
