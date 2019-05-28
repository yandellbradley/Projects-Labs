package customerapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;

/**
 *
 * @author Bradley
 */
public class CustomerAPP {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
       // TODO code application logic here
        
      Scanner userInput = new Scanner(System.in);
        //define and initialize variables
        
       // fill movie list array
          //  getAllMovies();
            
        
        String choice = "y";
        String categoryName = " ";
       
      
        System.out.println("Welcome to the Customer Manager");
        System.out.println();
        
        
        // user inputs data
        while (!categoryName.equalsIgnoreCase("exit")) {
        System.out.println();    
        System.out.println("Here you can add, delete and list customers in the database. ");
        System.out.println("Please chose from the list below");
        System.out.println("1. List");
        System.out.println("2. Add");
        System.out.println("3. Delete");
        System.out.println("4. Exit");
        
        System.out.print("Enter category number: ");
        String category = userInput.nextLine(); 
        System.out.println(""); 
        
         
        // set category name and call print movie list method
        
        switch (category) {
         case "1":
            categoryName = "list";
            displayAllCustomers();
            break;

         case "2":
            categoryName = "add";
            add();
            break;

         case "3":
            categoryName = "delete";
            delete();
            break;

         case "4":
            categoryName = "exit";
           //  displayMovies(categoryName);
            break;
         default:
            System.out.println("Please enter a valid choice");
            break;
        }
        
      }
    }
        // this method will call the get all the countries method 
         public static void displayAllCustomers() throws SQLException {
             
             String firstNameHeading = "First Name";
             String lastNameHeading = "Last Name";
             String emailAddressHeading = "Email Address";
             
             StringBuilder sb = new StringBuilder();
             System.out.print("CUSTOMERS LIST");
             System.out.println("");
             System.out.println("");
             sb.append(StringUTIL.padWithSpaces(emailAddressHeading, 28));
             sb.append(StringUTIL.padWithSpaces(firstNameHeading, 25));
             sb.append(StringUTIL.padWithSpaces(lastNameHeading, 25));
             System.out.println(sb.toString()); 
         
          
           System.out.println("");
          // System.out.println("   Email Addreass " + "          First Name " + "              LastName ");
           List<Customer> customers = new ArrayList<>();
            try {
                customers = CustomerDB.getAll();
                } 
            catch (DBException e) {
                  System.out.print(e + "\n");
                }
        
             if (customers == null) {
                 System.out.print("Error! Unable to get products.\n");
             }
             else {
                Customer p;
               // StringBuilder sb = new StringBuilder();
                for (Customer customer : customers) {
                p = customer;
                sb.append(StringUTIL.padWithSpaces(
                        p.getEmailAddress(), 12));
                sb.append(StringUTIL.padWithSpaces(
                        p.getFirstName(), 34));
                sb.append(p.getLastName());
                sb.append("\n");        
                  }
        }
     }
        
          public static void add() {
          Scanner userInput = new Scanner(System.in);   
        
          System.out.print("Enter customer first name to add: ");
          String firstName = userInput.nextLine(); 
          System.out.print("Enter customer last name to add: ");
          String lastName = userInput.nextLine(); 
          System.out.print("Enter customer email address to add: ");
          String emailAddress = userInput.nextLine(); 
        
            Customer customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setEmailAddress(emailAddress);
        
             try {
               CustomerDB.addCustomer(customer);
               System.out.print(firstName + " " + lastName + " was added to the database.\n");
           
             } catch (DBException e) {
               System.out.print("Error! Unable to add customer.");
               System.out.print(e + "\n");
           
        }
    }  
          public static void delete() {
          Scanner userInput = new Scanner(System.in);   
        
          System.out.print("Enter email address to delete: ");
          String emailAddress = userInput.nextLine(); 
        
          Customer customer = new Customer();
          customer.setEmailAddress(emailAddress);
             
           try {
              customer = CustomerDB.get(emailAddress);
              if (customer == null) {
                throw new Exception("Customer not found.");
              }
            } catch (Exception e) {
               System.out.print("Error! Unable to delete product.");
               System.out.print(e + "\n");
              
              return;
        }
             try {
               String firstName = customer.getFirstName();
               String lastName = customer.getLastName();
               CustomerDB.deleteCustomer(customer);
               
               System.out.print(firstName + " " + lastName + " was deleted from the database.\n");
           
             } catch (DBException e) {
               System.out.print("Error! Unable to delete product.");
               System.out.print(e + "\n");
            
        }
      }
    }
    
