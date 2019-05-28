 /**
 * Class to define data fields and methods for an array of Students
 * which represents a student list of id and gpa data
 * 
 * @author - Bradley Yandell
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentArrayImpl {
   public final static int MAX_STUDENTS = 15;   // size of array
    
   private Student [] studentArray;             // list of students
   private int numStudents;                    // number of students in list
   
   /**
    * Constructor
    */
   public StudentArrayImpl() {
       this.numStudents = 0;
       studentArray = new Student[MAX_STUDENTS];
   }
   
   /**
    * getter
    * @return numStudents
    */
   public int getNumStudents() {
      return numStudents;
   }

   /**
     * setter
     * @param numStudents 
     */
   public void setNumStudents(int numStudents) {
       this.numStudents = numStudents;
    }
     
   /**
    * Method to read data from file specified by filename
    * Each line of the file will contain a student id number and student gpa
    * separated by a space. Sample file lines:
    * 111111 3.1
    * 222222 3.82
    * The method will create a Student object from each line of data, 
    * and place the object into the studentArray.
	 * Thrown exceptions are handled by the caller
    * 
    * @param filename - name of file containing student data
    * @throws IOException automatically, when input file cannot be opened
	 * @throws ArrayIndexOutOfBoundsException automatically, when there is not room in the array
    */
   public void readStudentDataFile(String filename) throws IOException, 
                                    ArrayIndexOutOfBoundsException {
        int stuIdNum;
        double stuGPA;
        
        File inFile = new File(filename);
        Scanner fileInput = new Scanner(inFile);
      
      while (fileInput.hasNextInt())
      {
      stuIdNum = fileInput.nextInt();
      stuGPA = fileInput.nextDouble();
      
      Student newStudent = new Student(stuIdNum, stuGPA);
      
      studentArray[numStudents] = new Student(stuIdNum, stuGPA);
         
      numStudents = numStudents + 1;
      
      }

   }

   /**
    * Method to display student id numbers and student GPAs 
    * for each student in studentArray
    */ 
   public void displayStudentList() {

       int stuCount;
      
       System.out.println("");
       System.out.println("Student List");
       
       for (stuCount = 0; stuCount < numStudents; ++stuCount)
       {
           
       System.out.printf("Student %s: Id# %d, GPA is %.2f\n",(stuCount + 1), studentArray[stuCount].getStuIdNum(), studentArray[stuCount].getStuGPA() );
       
       }
   }
  
   /**
    * Method to add a student to the studentArray
    * 
    * @param stuIdNum - id number of student to add
    * @param stuGPA - gpa of student to add
    */
   
  
 
   public void addStudent(int stuIdNum, double stuGPA) { 

       
        
        studentArray[numStudents] = new Student(stuIdNum, stuGPA);
         
        numStudents = numStudents + 1;
        
        System.out.println("Student with id " + stuIdNum + " successfully added");
       
   }

   /**
    * Method to display students with the highest GPA
    */
   public void showHighestGpaStudents() {
       
       double highGPA = 0;
       int stuCount;
       
       // determin higest GPA
       for (stuCount = 0; stuCount < numStudents; ++stuCount)
       {
       if (studentArray[stuCount].getStuGPA() > highGPA) {
           highGPA = studentArray[stuCount].getStuGPA();
          }
       }
       System.out.println("");
       System.out.printf("Ids of students with highest GPA of %.2f:\n", highGPA);
       
       // determin all the students that have highest GPA - maybe more than 1
       for (stuCount = 0; stuCount < numStudents; ++stuCount)
       { 
       if (studentArray[stuCount].getStuGPA() >= highGPA) {
           
           System.out.println(studentArray[stuCount].getStuIdNum());
          }
 
     }
    }
   
  
    
   /**
    * Method to save the data from studentArray to a file    
    * (IOExceptions handled within the method)
    * Each line of the file will contain a student number and a student GPA, 
    * separated by a space. Sample file lines:
    * 111111 3.10
    * 222222 3.82
    * 
    * @param filename - name of file to write data to
    */
   public void writeUpdatedFile(String filename) throws FileNotFoundException {
      
       int index;
       
       
       try {
           
       File inFile = new File(filename);
       PrintWriter outFile = new PrintWriter(inFile);
       
       
       Scanner fileScan = new Scanner(inFile);
       
       for (index = 0; index < numStudents; index++) {
          
          outFile.printf("%d %.2f\n", studentArray[index].getStuIdNum(), studentArray[index].getStuGPA() );
       }
       
       outFile.close();
       System.out.println(index + " students saved to file " + filename);
       
       
       }
       
       catch(IOException ioe)
       {
           System.out.println("**Error: Cannot create file " + filename);
       }
   }
     


   /**
    * getter - FOR TESTING USE ONLY -- STUDENTS SHOULD NOT CALL THIS METHOD IN THEIR PROGRAMS
    * @return array of students 
    */
    public Student[] getStudentArray() {
        return studentArray;
    }
}
