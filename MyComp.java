/**
 * This class implements the 'compare' method in the
 * Comparator interface. The class is used comapre two
 * strings from two 'Contact' objects. 
 *
 * @author Rodrigo Rogel-Perez
 * @version 1.0
**/

import java.util.*;
import java.io.*;

public class MyComp implements Comparator<Contact>, Serializable {

   /**
    * This method compares the string representations of
    * two 'Contact' objects and returns a value less than
    * 0 if the first string is lexicographically greater
    * than the second string; and a value greater than
    * 0 otherwise. 0 is returned is they are the same.
    *
    * @param contact1   An instance of the 'Contact' class
    * @param contact2   A second instance of the 'Contact' class
   */
   public int compare ( Contact contact1, Contact contact2 ) {
      return contact1.toString().compareTo( contact2.toString() );
   } // end of compare()
} // end of MyComp