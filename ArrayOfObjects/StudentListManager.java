/**
 * Program to manage a student list of up to 100 students
 * Data will be read from a file and stored in the student list
 * User will be able to display the list, add a student, 
 * update a student GPA, and re-save the student data to another file.
 * 
 * @author Bradley Yandell
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StudentListManager {

   /**
    * @param args the command line arguments
    * 
    */
   public static void main(String[] args) throws FileNotFoundException, IOException {
     
       Scanner keyboard = new Scanner(System.in);
       StudentArrayImpl studentList = new StudentArrayImpl();
       
      final int MAX_STUDENTS = 15;
      String inputFilename;
      int stuIdNum;
      double stuGPA;
      char choice = '?';
      
      System.out.println("Enter input data filename:");
      inputFilename = keyboard.next();  
      
     
     try {
         
      studentList.readStudentDataFile(inputFilename);
      System.out.println("Data for " + studentList.getNumStudents() + " students stored");
     }
     
     catch(IOException ioe)
      {
          System.out.println("**Error reading input file " + inputFilename);
          System.out.println("**Program exiting");
          System.exit(0);
      }
     
    catch(ArrayIndexOutOfBoundsException aiobe)
     {
          System.out.println("**Too many students in file.");
          System.out.printf("**Program will only use the first %s students", MAX_STUDENTS);
          System.out.println("");
      }
    
     while (choice != 'E')   
      {  
         
          choice = getChoice(keyboard);
      
          switch (choice)
          {
           
             case 'D':
                 
                 studentList.displayStudentList();
                 break;
             case 'A':
                 if (studentList.getNumStudents() == MAX_STUDENTS) {
                     System.out.println("List is full, so cannot add another student");
                 }
                 else {     
                 System.out.println("Enter id number of student to add:");
                 stuIdNum = keyboard.nextInt();
                 System.out.println("Enter GPA of student to add:");
                 stuGPA = keyboard.nextDouble();
                 studentList.addStudent(stuIdNum, stuGPA);
                 }
                break;
             case 'U':
                 
                 inputFilename = inputFilename.replace(".txt", "Update.txt");
                 studentList.writeUpdatedFile(inputFilename);
                 
                 
                 break;
             case 'S':
                 
                 studentList.showHighestGpaStudents();
                 
                 break;
             case 'E':
               break;
               
             default:
               System.out.println("**Error: Invalid menu choice! Try again."); 
          }
      }
   }
  
   /**
    * Method displays menu to user
    * Reads, uppercases, and returns choice from menu
    * 
    * @param keyboard - Scanner to read user data from
    * @return choice - uppercased menu choice entered by user
    */
   public static char getChoice(Scanner keyboard) {
      char choice = '?';
      
      System.out.println("");
      System.out.println("MENU");
      System.out.println("  D - Display student list");
      System.out.println("  A - Add a student to list");
      System.out.println("  S - Show highest GPA students");
      System.out.println("  U - Update student data file");
      System.out.println("  E - Exit program");
      System.out.println("Enter choice:");
     
      choice = keyboard.next().charAt(0);
      choice = Character.toUpperCase(choice);
      
      return choice;
   }
 
}
