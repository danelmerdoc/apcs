import javax.swing.event.SwingPropertyChangeSupport;

/**
   Represent a phone book, as a sorted array of Entry objects
 */
public class PhoneBook{
    private Entry[] entries;

    /**
      Construct an instance from the data in hw054
     */
    public PhoneBook(){
        entries = new Entry[]
          { new Entry( "Archimedes"            , "314-159-2653")
          , new Entry( "Brubeck, Dave"         , "Take5-4")
          , new Entry( "Contreras, Eric"       , "212-312-4800")
          , new Entry( "Costello, Lou"         , "Alexander-4444")
          , new Entry( "Hopper, Grace"         , "1954")
          , new Entry( "Jepsen, Carly Rae"     , "555-6041")
          , new Entry( "Kernighan, Brian"      , "000-000-0000")
          , new Entry( "Miller, Glenn"         , "PA6-5000")
          , new Entry( "Picket, Wilson"        , "634-5789")
          , new Entry( "al-Khwārizmī, Muhammad", "1-618-021594")
          };
    }


    /**
       @return  the phone number for "name", or
                return null if "name" is absent.
       precondition: the phone book must be sorted by name
     */
    public/* instance */ String getPhone( String name) {
        return "stub for getphone";

    }
      
    
    public static String getPhone (PhoneBook pb, String name){
      int maxIndex = pb.entries.length;
      int currentLookup = maxIndex/2 ; 
      int minIndex = 0; //lowest possible value
      
      return getPhone(pb, name, currentLookup, maxIndex, minIndex);

    }
    public static String getPhone (PhoneBook pb, String name, int currentLookup, int maxIndex, int minIndex){
    //Base Case
    if (maxIndex == minIndex)
    return "name not found";
    else{
      return "name was found";
    }

    }
    //getPhone Test
    PhoneBook phoneBook = new PhoneBook();

    System.out.println(getPhone(phoneBook, "chad"));


    /**
       Test Entry.compareTo
     */
    public static void main( String[] commandLine) {
        PhoneBook phoneBook = new PhoneBook();

        // compareTo test
        System.out.println(
            System.lineSeparator()
          + "----- compareTo test -----"
          );
        bwkCompareTo( phoneBook, 2, "neg");
        bwkCompareTo( phoneBook, 5, "neg");
        bwkCompareTo( phoneBook, 6, "0");
        bwkCompareTo( phoneBook, 7, "pos");
        bwkCompareTo( phoneBook, 9, "pos");
    }


    /**
       Test Entry.compareTo by comparing
       "Kernighan, Brian" to the PhoneBook entry at "offset".
     */
    private static void bwkCompareTo( PhoneBook pb
                                    , int offset
                                    , String expect
                                    ) {

        System.out.println(
            "compare Entry "
          + offset + ": "
          + pb.entries[ offset].compareTo( "Kernighan, Brian")
          + " ...expecting " + expect
          );
     }
}
