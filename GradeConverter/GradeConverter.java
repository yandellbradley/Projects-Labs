package gradeconverter;

import java.util.Scanner;
/**
 * @author Bradley
 * This program will determine the letter grade give the numerical grade entered.
 */
public class GradeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to the Letter Grade converter");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        String enterGrade = "";

        
         while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter numerical grade: ");
            enterGrade = sc.nextLine();
            int numberGrade = Integer.parseInt(enterGrade);
            // create the Product object
            Grade grade = new Grade();
            
            // fill the Product object with data
            grade.setNumberGrade(numberGrade);
            
            // get the Product object
            grade.getLetterGrade(numberGrade);

           // display the output
                
            System.out.println("Letter Grade: " + grade.getLetterGrade(numberGrade));
                    
            System.out.println();
             
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
          System.out.println("Bye!");
      }
    }

    

