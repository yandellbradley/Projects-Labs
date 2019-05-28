package countryapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;



/**
 *
 * @author Bradley
 * This program will display the user menu and respond to the user choices 
 */
public class CountryAPP {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
      Scanner userInput = new Scanner(System.in);
        //define and initialize variables
        
       // fill movie list array
          //  getAllMovies();
            
        
        String choice = "y";
        String categoryName = " ";
       
      
        System.out.println("Welcome to the Country Manager");
        System.out.println();
        
        
        // user inputs data
        while (!categoryName.equalsIgnoreCase("exit")) {
        System.out.println();    
        System.out.println("Here you can add, delete and list the countries in the database. ");
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
            displayAllCountries();
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
         public static void displayAllCountries() throws SQLException {
           
           System.out.print("COUNTRY LIST");
           System.out.println("");
           List<Country> countrys = new ArrayList<>();
            try {
                countrys = CountryDB.getAll();
                
                } catch (DBException e) {
            
                  System.out.print(e + "\n");
            
              }
        
             if (countrys == null) {
            System.out.print("Error! Unable to get products.\n");
       
        }
     }
         
          public static void add() {
          Scanner userInput = new Scanner(System.in);   
        
          System.out.print("Enter country name to add: ");
          String name = userInput.nextLine(); 
        
             try {
               CountryDB.addCountry(name);
               System.out.print(name + " was added to the database.\n");
           
             } catch (DBException e) {
               System.out.print("Error! Unable to add product.");
               System.out.print(e + "\n");
           
        }
    }  
          public static void delete() {
          Scanner userInput = new Scanner(System.in);   
        
          System.out.print("Enter country name to delete: ");
          String name = userInput.nextLine(); 
        
             try {
               CountryDB.deleteCountry(name);
               System.out.print(name + " was deleted from the database.\n");
           
             } catch (DBException e) {
               System.out.print("Error! Unable to delete product.");
               System.out.print(e + "\n");
            
        }
    }
}
            
     
