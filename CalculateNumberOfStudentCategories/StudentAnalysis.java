/**
 * calculate number of students in a category based on number of credit hours taken
 * 
 * @author Bradley Yandell
 */
import java.util.Scanner;
import java.io.*;

public class StudentAnalysis{

   public static void main(String[] args) throws IOException {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      //File inFile = null;
      Scanner fileScanner = null;
      // Add additional variable declarations here
      int studentId;
      int numberOfCredits;
      String lineData;
      int dataLineRead = 0;
      int studentCount;
      
      System.out.println("Enter filename:");
      fileName = keyboard.next();
      
       // create file object
      File inFile = new File(fileName);
      // create scanner and connet to file
      Scanner fileInput = new Scanner(inFile);
      
      StudentCounts newStudent = new StudentCounts();
      
      while (fileInput.hasNext()) {
         
      studentId = fileInput.nextInt();
      numberOfCredits = fileInput.nextInt();
      newStudent.incrementOneCount(numberOfCredits);
      
      // data line counter
      dataLineRead = dataLineRead + 1;
      System.out.println("Line read: " + studentId + " " + numberOfCredits); 
      
      newStudent.getNumFreshmen();
      newStudent.getNumSophomores();
      newStudent.getNumJuniors();
      newStudent.getNumSeniors();
      
      }
      
       // close file
      fileInput.close();
      
      System.out.println(dataLineRead + " data lines read");  
      System.out.println("Done reading file " + fileName);
      
      System.out.println("");
      newStudent.displayCounts();
   }
   
}    
