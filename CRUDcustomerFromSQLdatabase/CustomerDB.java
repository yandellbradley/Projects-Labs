package customerapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Bradley
 */
public class CustomerDB {
    
    public static List<Customer> getAll() throws DBException {
        int count = 0;
        String sql = "SELECT * FROM Customer ORDER BY CustomerID";
        
        List<Customer> customers = new ArrayList<>();
        Connection connection = CustomerUTIL.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                count = count + 1;
                int CustomerID = rs.getInt("CustomerID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String emailAddress = rs.getString("emailAddress");
                
                
                Customer p = new Customer();
               
                p.setFirstName(firstName);
                p.setLastName(lastName);
                p.setEmailAddress(emailAddress);
                
                customers.add(p);
                
               // count = count + 1;
               // System.out.println(count + "."  + " " + emailAddress + " " + firstName + " " + lastName);
               StringBuilder sb = new StringBuilder();
               sb.append(StringUTIL.padWithSpaces(p.getEmailAddress(), 25));
               sb.append(StringUTIL.padWithSpaces(p.getFirstName(), 25));
               sb.append(StringUTIL.padWithSpaces(p.getLastName(), 25));
               System.out.print(count + ". "); 
               System.out.println(sb.toString()); 
            }
            rs.close();
            return customers;
        } catch (SQLException e) {
            throw new DBException(e);
        }
     }
    
 
     public static Customer get(String emailAddress) throws DBException {
        String sql = "SELECT * FROM Customer WHERE emailAddress = ?";
        Connection connection = CustomerUTIL.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, emailAddress);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emailAddress = rs.getString("EmailAddress");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                
                rs.close();
                
                Customer p = new Customer();
                p.setFirstName(firstName);
                p.setLastName(lastName);
                p.setEmailAddress(emailAddress);
                
                return p;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            throw new DBException(e);
        }
    }

   
    
     public static void addCustomer(Customer customer) throws DBException {
        Scanner userInput = new Scanner(System.in);   
        
        String sql
                = "INSERT INTO Customer (firstName, lastName, emailAddress) "
                + "VALUES (?, ?, ?)";
        Connection connection = CustomerUTIL.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
           
          
            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getEmailAddress());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new DBException(e);
      }
      
     }
     
     public static void deleteCustomer(Customer customer) throws DBException {
        Scanner userInput = new Scanner(System.in);   
        
        String sql
                = "DELETE FROM Customer "
                + "WHERE emailAddress = (?)";
        Connection connection = CustomerUTIL.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
           
            ps.setString(1, customer.getEmailAddress());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new DBException(e);
      }
       
     }
    
}
