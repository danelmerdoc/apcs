/***********************************************
 *  Add a method to the previous HelloWorld
 **********************************************/

public class HelloPerson {

    public static void main(String[] commandLine) {
        System.out.println( greet( "Professor", "Kernighan"));
    }

    private static String greet( String honorific, String lastName) {
        System.out.println("hallo");
        return "G'day " + honorific + " " + lastName + ". How are you mate?";
    }
}