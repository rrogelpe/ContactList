/**
 * This class represents a contact. Its properties include a 
 * first name, a last name, a phone number, and an email address.
 * This class is serializable.
 *
 * @author Rodrigo Rogel-Perez
 * @version 1.0
**/

import java.io.*;

public class Contact implements Serializable {

   /**
    * Constructor with full initialization
    *
    * @param firstName     Contact's first name
    * @param lastName      Contact's last name
    * @param phoneNumber   Contact's phone number
    * @param emailAddress  Contact's email address
   */
   public Contact ( String firstName, String lastName, String phoneNumber, String emailAddress ) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      this.emailAddress = emailAddress;
   } // end of Contact()

   /**
    * Default constructor.
    * All properties are set to null.
   */
   public Contact () {
      this.firstName = null;
      this.lastName = null;
      this.phoneNumber = null;
      this.emailAddress = null;
   } // end of Contact()

   /**
    * This method modifies the first name attribute
    *
    * @param firstName  Contact's first name
   */
   public void setFirstName ( String firstName ) {
      this.firstName = firstName;
   } // end of setFirstName()

   /**
    * This method modifies the last name attribute
    *
    * @param lastName  Contact's last name
   */
   public void setLastName ( String lastName ) {
      this.lastName = lastName;
   } // end of setLastName()

   /**
    * This method modifies the phone number attribute
    *
    * @param phoneNumber  Contact's phone number
   */
   public void setPhoneNumber ( String phoneNumber ) {
      this.phoneNumber = phoneNumber;
   } // end of setPhoneNumber()

   /**
    * This method modifies the email address attribute
    *
    * @param emailAddress  Contact's email address
   */
   public void setEmailAddress ( String emailAddress ) {
      this.emailAddress = emailAddress;
   } // end of setEmailAddress()

   /**
    * This method returns the contact's first name
    *
    * @return String
   */
   public String getFirstName () {
      return this.firstName;
   } // end of getFirstName()

   /**
    * This method returns the contact's last name
    *
    * @return String
   */
   public String getLastName () {
      return this.lastName;
   } // end of getLastame()

   /**
    * This method returns the contact's full name
    * which is a combination of the first and last
    * name attributes.
    *
    * @return String  
   */
   public String getFullName () {
      return ( this.firstName + this.lastName );
   } // end of getFullName()

   /**
    * This method returns the contact's phone number
    *
    * @return String  
   */
   public String getPhoneNumber () {
      return this.phoneNumber;
   } // end of getPhoneNumber()

   /**
    * This method returns the contact's email address
    *
    * @return String  
   */
   public String getEmailPhone () {
      return this.emailAddress;
   } // end of getEmailPhone()

   /**
    * This method returns all of the contact's properties
    * in the order of last name, first name, phone number, 
    * and email address.
    *
    * @return String  
   */
   public String toString() {
      return ( "Last Name: " + this.lastName + "\n" + 
               "First Name: " + this.firstName + "\n" + 
               "Phone: " + this.phoneNumber + "\n" + 
               "Email: " + this.emailAddress );
   } // end of toString()

   // declare private instance variables
   private String firstName;     // to hold first name
   private String lastName;      // to hold last name
   private String phoneNumber;   // to hold phone number
   private String emailAddress;  // to hold email address
} // end of Contact