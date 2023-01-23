/**

 */

public class UserOfStringLooper {

    /**
     Exercise the StringLooper class
     */
    public static void main( String[] commandLine) {
        System.out.println( System.lineSeparator()
                + "----- demo toUpperCase -----");
        StringLooper s0 = new StringLooper();
        s0.source = "makes me wanna shout!";

        System.out.println( s0.toUpperCase());

        System.out.println( s0.verticalize());
    }

}