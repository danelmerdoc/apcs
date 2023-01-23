/**
  Represent a maze with an explorer in it

  Define a "MazeTerminal" as...
    o  a wall element; or
    o  a stepping stone; or
    o  a treasure on a stepping stone.

  Define a "maze" as...
    o  a MazeTerminal; or
    o  a maze with a MazeTerminal any of its 4 neighbors
 */
import java.util.Scanner;

public class MazeWithExplorer {

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
    private final static int MAX_OFFSET_SOUTHS = 64;
    private int mazeHeightNorthSouth;  /* the height of the maze
                                          read from a text file */
                                        
    private int explorerOffsetEast;
    private int explorerOffsetSouth;

    /**
      Construct an instance
      basing the maze on the file at "sourceFilePath" and
      positioning an explorer at the given "explorerOffset"
     */



    /**
      @return a string representing of this instance
     */
    public String toString() {

      // build string for top and bottom separators
      String aboveAndBelow = "--";
          for( int offsetEast = 0
             ; offsetEast < maze[0].length
             ; offsetEast++
             )
          aboveAndBelow += "-";
      aboveAndBelow += "-" + System.lineSeparator();

      /* characters that represent MazeTerminals,
         at offsets corresponding to the named constants
         TREASURE, WALL, and STEPPING_STONE.

         There are two sets of characters, to represent...
         o  a MazeTerminal with the explorer on that cell
         o  a MazeTerminal without the explorer. For human
            convenience, these match the characters in the input files.
        */
      final String exOnTop = "!eE";  /* explorer on top of
           a treasure, wall, stepping stone, respectively */
      final String noEx = "0 *";  // when there is no explorer here

      // process maze[][]
      String result = aboveAndBelow;
      for( int offsetSouth = 0
         ; offsetSouth < mazeHeightNorthSouth
         ; offsetSouth++) {
          result += "|";
          for( int offsetEast = 0
             ; offsetEast < maze[ offsetSouth].length
             ; offsetEast++) {
              int mazeTerm = maze[ offsetSouth][ offsetEast];
              
              /* choose the appropriate character set, based
                 on the explorer's position
              */
              String charChoice; 
              
              if (offsetSouth == explorerOffsetSouth && offsetEast == explorerOffsetEast )
                charChoice = exOnTop;
              else {
                charChoice = noEx;
              }
              result += charChoice.substring( mazeTerm, mazeTerm+1);
          }
          result += "|" + System.lineSeparator();
      }
      return   result + aboveAndBelow;
  }

public MazeWithExplorer(
               String sourceFilePath

             // position
             , int explorerOffsetEast
             , int explorerOffsetSouth
             ) throws java.io.FileNotFoundException {
        
        this.explorerOffsetEast = explorerOffsetEast;
        this.explorerOffsetSouth = explorerOffsetSouth;
        // Construct the maze array one offsetSouth at a time
        maze = new int[ MAX_OFFSET_SOUTHS][];

        Scanner sc = new Scanner( new java.io.File( sourceFilePath));
        sc.useDelimiter("");  // Whitespaces are data, not delimiters.

        // process the file representing a maze
        while( sc.hasNextLine() ) {
            int offsetSouth = mazeHeightNorthSouth++;
            /* So mazeHeightNorthSouth == last offsetSouth +1, as usual.
               That is, mazeHeightNorthSouth is one larger than the number of
               the last-used offsetSouth.
             */
            String line = sc.nextLine();
            

            maze[ offsetSouth] = new int[ line.length()];

            // Convert the input line into maze elements.
            for( int offsetEast = 0
               ; offsetEast < line.length()
               ; offsetEast++
               ) {
                String inChar = line.substring( offsetEast, offsetEast+1);
                int element;  // value destined for maze array
                if(      inChar.equals("0"))  element = TREASURE;
                else if( inChar.equals("*"))  element = STEPPING_STONE;
                // spaces and unrecognized characters are walls
                else                          element = WALL;
                maze[ offsetSouth][ offsetEast] = element;
            }
        }
    }
    /**
      @return the MazeElement that the explorer is on.
     */
    public int explorerIsOnA() {
      //check if the explorer is inside the maze
      if ( explorerOffsetSouth < 0 || explorerOffsetEast < 0
      ||explorerOffsetSouth > mazeHeightNorthSouth || explorerOffsetEast > maze[0].length 
       ) 
        return -1; //cant exist
       else {
        return maze[explorerOffsetSouth][explorerOffsetEast];
      }
    }
}