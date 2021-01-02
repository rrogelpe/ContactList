/**
 * This class handles the (de)serialization as well
 * as the priting and writing of the 'ContactList' 
 * object to the console and corresponding file. 
 *
 * @author Rodrigo Rogel-Perez
 * @version 1.0
**/

import java.io.*;

public class ContactListFileHandler {

   /**
    * This method prints to the console the 
    * contents of the specified contact list file
    *
    * @param filePath  File path of the contact list
   */
   public static void printContactsToConsole ( String filePath ) {

      String record = null; // initialize record to null
      int numRow = 0; // to count # of lines in file

      try ( BufferedReader input = new BufferedReader( new FileReader( filePath ) ) ) {
         // Read the contents of the source file line by line until the line is null i.e. contains no chars
         while( ( record = input.readLine() ) != null ) {
            System.out.println( record ); // Display record to the console
            numRow++;
         }
         // If file is empty display 'Empty List' to console
         if ( numRow == 0) {
            System.out.println( "\t     -- Empty List --\n" );
         }
      } 
      catch ( FileNotFoundException e ) { // Catch error if file is not found
         System.out.println( "File Not Found " + e );
         return; // terminate program
      } 
      catch ( IOException e ) { // Catch other I/O related error
         System.out.println( "An I/O Error Occurred " + e );
         return; // terminate program
      }
   } // end of printContractsToConsole()

   /**
    * This method prints to the console the 
    * contents of the specified file object.
    *
    * @param file  File object
   */
   public static void printContactsToConsole ( File file ) {

      String record = null; // initialize record to null
      int numRow = 0; // to count # of lines in file

      try ( BufferedReader input = new BufferedReader( new FileReader( file ) ) ) {
         // Read the contents of the source file line by line until the line is null i.e. contains no chars
         while( ( record = input.readLine() ) != null ) {
            System.out.println( record ); // Display record to the console
            numRow++;
         }
         // If file is empty display 'Empty List' to console
         if ( numRow == 0) {
            System.out.println( "\t     -- Empty List --\n" );
         }
      } 
      catch ( FileNotFoundException e ) { // Catch error if file is not found
         System.out.println( "File Not Found " + e );
         return; // terminate program
      } 
      catch ( IOException e ) { // Catch other I/O related error
         System.out.println( "An I/O Error Occurred " + e );
         return; // terminate program
      }
   } // end of printContractToConsole()

   /**
    * This method writes the contents of
    * the specified 'ContactList' object
    * to the specified file.
    *
    * @param contacts      An instance of the 'ContactList' class
    * @param destFilePath  File name on which to write
   */
   public static void writeToContactListFile ( ContactList contacts, String destFilePath ) {
      // Write to new file using try-with-resource statement to automatically close stream at end of session
      try ( PrintWriter output = new PrintWriter( new BufferedWriter( new FileWriter( destFilePath ) ) ) ) {
         output.print( contacts.toString() );
      }
      // Throw exception if other I/O related error is encoutered
      catch ( IOException e ) {
         System.out.println( "An I/O Error Occurred " + e );
         return;
      }
   } // end of writeToContractListFile()

   /**
    * This method writes the contents of
    * the specified 'ContactList' object
    * to the specified file object.
    *
    * @param contacts      An instance of the 'ContactList' class
    * @param file          File object on which to write
   */
   public static void writeToContactListFile ( ContactList contacts, File file ) {
      // Write to new file using try-with-resource statement to automatically close stream at end of session
      try ( PrintWriter output = new PrintWriter( new BufferedWriter( new FileWriter( file ) ) ) ) {
         output.print( contacts.toString() );
      }
      // Throw exception if other I/O related error is encoutered
      catch ( IOException e ) {
         System.out.println( "An I/O Error Occurred " + e );
         return;
      }
   } // end of writeToContractListFile()

   /**
    * This method deserializes the data in the 'serial'
    * file and initiates a 'ContactList' object with
    * this data. If 'serial' file does not exist, a new
    * instance of the 'ContactList' class is created instead.
    *
    * @return ContactList
   */
   public static ContactList deserializeContactList () {

      ContactList contacts;
      // locate 'serial' file and and deserialize it 
      try ( ObjectInputStream objIStrm = new ObjectInputStream( new FileInputStream( "serial" ) ) ) {
         System.out.print( "\n" );
         System.out.println( "Deserialization complete." ); 
         contacts = ( ContactList ) objIStrm.readObject(); // assign deserialized object to 'contactList' object
      } 
      // catch exception in the event deserialization process fails
      catch ( Exception e ) {
         System.out.print( "\n" );
         System.out.println( "Nothing to deserialize." );
         contacts = new ContactList(); // initialize new instance of 'ContactList'
      }

      return contacts;
   } // end of deserializeContactList()

   /**
    * This method serializes a 'ContactList' object 
    * and stores the data in the 'serial' file. 
    *
    * @param contacts    An instance of the 'ContactList' class
   */
   public static void serializeContactList ( ContactList contacts ) {

      // serialize 'contactList' object to store data and retrieve at next execution
      try ( ObjectOutputStream objOStrm = new ObjectOutputStream( new FileOutputStream("serial") ) ) {
         objOStrm.writeObject( contacts );
      }
      // catch exception in the event serialization process fails
      catch ( IOException e ) {
         System.out.print( "\n" );
         System.out.print( "Exception during serialization: " + e );
         System.out.print( "\n" );
      }
   } // end of deserializeContactList()
} // end of ContactListFileReader