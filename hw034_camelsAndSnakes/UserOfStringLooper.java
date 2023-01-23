/**
 * Daniel Murdoch
 * hw034
 * worked with no one
 * advised by no one
  Exercise the StringLooper class
 */

public class UserOfStringLooper {
    public static void main( String[] commandLine) {
        StringLooper s0 = new StringLooper();
        StringLooper s1 = new StringLooper();
        StringLooper s2 = new StringLooper();

        // toVariablesFormat
        System.out.println( System.lineSeparator()
                          + "----- toVariablesFormat -----");
        s0.source = "A_SNAKE_CASE_STUB";
        s1.source = "THIS_IS_AN_EXAMPLE_OF_SNAKE_CASE_CONVERTED_INTO_CAMEL_CASE";
        s2.source = "I_AM_A_CAMEL_WITH_HUMPS";
        System.out.println( s0.toVariablesFormat());
        System.out.println( s1.toVariablesFormat());
        System.out.println( s2.toVariablesFormat());


         // toConstantsFormat
        System.out.println( System.lineSeparator()
                           + "----- toConstantsFormat -----");
         s0.source = "aCamelCaseStub";
         s1.source = "thisIsCamelCaseConvertedIntoSnakeCase";
         s2.source = "iAmASnakeAndIJustAteARat";
         System.out.println( s0.toConstantsFormat());
         System.out.println( s1.toConstantsFormat());
         System.out.println( s2.toConstantsFormat());
         System.out.println( System.lineSeparator()
                           + "----- verticalize -----");
        s0.source = "Go!";
         System.out.println( s0.verticalize() );
    }
}