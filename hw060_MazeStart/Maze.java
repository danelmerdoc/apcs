/**
  Represent a Maze
  
  A "MazeTerminal" is...
    o  a wall element; or
    o  a treasure; or
    o  a stepping stone.
  
  A "Maze" is...
    o  a MazeTerminal; or
    o  a stepping stone with a Maze as any of its 4 neighbors
 */
import java.util.Scanner;

public class Maze {
  // Extra comment for perspicuity 
    // MazeTerminal named constants
    public final static int TREASURE = 0;
    public final static int WALL = 1;
    public final static int STEPPING_STONE = 2;
    
    // directions that can be searched
    public final static int EAST =  1;
    public final static int NORTH = 2;
    public final static int WEST =  4;
    public final static int SOUTH = 8;
       /* Values are pretty arbitrary. Values of 2^n might be useful
          in the unlikely event that we ever want to add north-west, etc.:
          2+4 --> 6  */
    
    private int[][] maze;
    private final static int MAX_RANKS = 64;
    private int rankCount;  // number of ranks in a constructed Maze

    /**
      Construct an instance from the contents of a file.
     */
    public Maze( String sourceFilename
               ) throws java.io.FileNotFoundException {

        // Construct the maze array one rank at a time
        maze = new int[ MAX_RANKS][];

        Scanner sc = new Scanner( new java.io.File( sourceFilename));
        sc.useDelimiter("");  // Whitespaces are data, not delimiters.

        // process the maze file
        while( sc.hasNextLine() ) {
            int rank = rankCount++;
            /* So rankCount == last rank +1, as usual.
               That is, rankCount is one larger than the number of
               the last-used rank.
             */
            String line = sc.nextLine();
            
            
            maze[ rank] = new int[ line.length()];

            // Convert the input line into maze elements.
            for( int file = 0; file < line.length(); file++ ) {
              String curPos = line.substring(file, file + 1);
              if (curPos.equals("0")) {
                  maze[rank][file] = TREASURE; // 0
              } else if (curPos.equals( "*")) {
                  maze[rank][file] = STEPPING_STONE; // 2
              } else {
                  maze[rank][file] = WALL;// 1
              }
            }
        }
    }


    /**
      @return a string representing of this instance
     */
    public String toString() {

      // build string for top and bottom separators
      
      String aboveAndBelow = "";
      
      for (int i = 0; i < maze[0].length; i++) {
        aboveAndBelow += "-";
      }
      aboveAndBelow += "--";//accounting for the 2 || attatched to the end
      String result = System.lineSeparator() + "";
      
      for (int rank = 0; rank < maze.length; rank++) {
        if (maze[rank] == null) {

        }
        else {
          result += "|";
          for (int file = 0; file < maze[rank].length; file++) {
            
            if (maze[rank][file] == WALL) 
              result += " ";
            else if (maze[rank][file]  == STEPPING_STONE)
              result += "*";
            
            else if (maze[rank][file] == TREASURE) 
              result += "0";
            
          }
          result += "|" + System.lineSeparator();
        }
        
      }

      return   aboveAndBelow + result + aboveAndBelow + System.lineSeparator() + "Thank You Mr. Holmes!";
  }
}
