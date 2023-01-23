/**
  Daniel Murdoch
  hw060
  worked with Vicente Xia Tang & Tawseef Reza & Preston Thomsen (not in cs dojo) & Aareeb Jamil
  advised by Gabriel Lwin
  
  Requires command line argument:
  o  the name of a file containing a maze.

  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt
 */

public class UserOfMaze {
    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            );
        System.out.println( maze + System.lineSeparator());
    }
}
