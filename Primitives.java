/**
 Daniel Murdoch
 hw 010
 worked on with nobody
 advised by nobody
 */

public class Primitives {

    public static void main(String[] commandLine) {
        System.out.println(( intFib( 6))
                + System.lineSeparator()
                + integer( 11)
        );
    }

    private static double floatingPoint( double finalVal) {

        double intermediateValue;
        
        double radFive;

        radFive = Math.sqrt(5.0);

        intermediateValue = finalVal ;

        return ((Math.pow((1 + radFive), intermediateValue)) - (Math.pow((1 - radFive), intermediateValue))) / ((Math.pow(2, intermediateValue)) * radFive);
    }

    private static int intFib (int finalVal){
        
        return (int) floatingPoint(finalVal);

    }
    /*
     * () -> 16
     * + , - -> 14
     * * , / -> 12
     */

     private static int integer( int finalVal) {
        int intermediateValue;

        intermediateValue = finalVal;

        return ((intermediateValue * (intermediateValue + 1)) / 2);
    }

}
