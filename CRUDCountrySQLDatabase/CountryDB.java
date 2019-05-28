package countryapp;

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
 * This section contains the logic for our program.  
 * It will contain two it will contain three methods, getCountries, addCountry and deleteCountry
 * 
 */
public class CountryDB {
    
   

    public static List<Country> getAll() throws DBException {
        int count = 0;
        String sql = "SELECT * FROM Country ORDER BY CountryID";
        List<Country> countrys = new ArrayList<>();
        Connection connection = CountryUTIL.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
               
                int CountryID = rs.getInt("CountryID");
                String name = rs.getString("CountryName");
                
                Country p = new Country();
               
                p.setCountryName(name);
                countrys.add(p);
                
                count = count + 1;
                System.out.println(count + " " + name);
                
            }
            rs.close();
            return countrys;
        } catch (SQLException e) {
            throw new DBException(e);
        }
    }
  
    
     public static String addCountry(String name) throws DBException {
        Scanner userInput = new Scanner(System.in);   
        
        String sql
                = "INSERT INTO Country (CountryName) "
                + "VALUES (?)";
        Connection connection = CountryUTIL.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
           
          
            ps.setString(1, name);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new DBException(e);
      }
        return name;
     }
     
     public static String deleteCountry(String name) throws DBException {
        Scanner userInput = new Scanner(System.in);   
        
        String sql
                = "DELETE FROM Country "
                + "WHERE CountryName = (?)";
        Connection connection = CountryUTIL.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
           
            ps.setString(1, name);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new DBException(e);
      }
        return name;
     }
}
     
