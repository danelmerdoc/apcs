/***********************************************
 Nest method invocations

 Daniel Murdoch
 hw009
 worked with no one
 advised by no one

 **********************************************/

public class HelloBondified {

    public static void main( String[] commandLine) {
        System.out.println( finish("James", "Bond"));



    }


    private static String bondify( String firstName, String lastName) {
        return lastName + ", " + firstName + " " + lastName + ".";
    }
    private static String line1 ( String firstName, String lastName) {
        return "My name is " + bondify(firstName, lastName);
    }
    private static String line2 ( String firstName, String lastName) {
        return "Hello, " + bondify(firstName, lastName) + " How you doon?";
    }
    private static String line3 ( String firstName, String lastName){
        return "Not " + "\"" + bondify(firstName, lastName) + "\"" + " Just " + " \"" + firstName + " " + lastName + "." + "\"";
    }
    private static String line4 (String firstName, String lastName){
        return "Hello, " + firstName + " " + lastName + ". How you doon?";

    }
    private static String finish (String firstName, String lastName){
        return line1(firstName, lastName) + "\n" + line2(firstName, lastName) + "\n" + line3(firstName, lastName) + "\n" + line4(firstName, lastName);
    }
}

