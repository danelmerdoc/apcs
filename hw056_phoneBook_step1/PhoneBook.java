import java.nio.charset.MalformedInputException;

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
    
    public String getPhone( String name) {
      int maxIndex = entries.length;
    
      int minIndex = 0; //lowest possible value
        
      return getPhone( name, maxIndex,  minIndex);  // stub
    }
    
    public String getPhone(String name, int maxIndex,  int minIndex) {
      int currentLookup = (maxIndex + minIndex) / 2;
      if (maxIndex == minIndex)
      return "name does not exist in phone book";
      else{
          int comparison = entries[currentLookup].getName().compareTo(name);
          if (comparison == 0) {
              return entries[currentLookup].getPhone();
          } else if (comparison > 0) {
              maxIndex = currentLookup - 1;
          } else {
              minIndex = currentLookup + 1;
          }
          currentLookup = (maxIndex + minIndex) / 2;
          return getPhone(name, maxIndex,  minIndex);
      }
   }
    


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
        System.out.println(System.lineSeparator() +
        "----  getPhone Tests -----");
        //getPhone Tests
        System.out.println(phoneBook.getPhone( "Archimedes") + "<--- Archimedes");
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
