package translateenglish;

import java.util.Scanner;

/**
 *
 * @author Bradley
 * This program will translate English to Pig Latin
 */
public class TranslateEnglish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        //define and initialize variables
        Character vowelConCheck;
        String newWord;
        String choice = "y";
        int arrayLength;
        int charCount = 0;
        
        System.out.println("Welcome to the Pig Latin Translator");
        System.out.println();
        
        
        // user inputs data
        while (choice.equalsIgnoreCase("y")) {
        System.out.println("Enter a line to be translated to Pig Latin: ");
        String name = sc.nextLine();
        System.out.println();
       
        //array created for user entered data
        String [] words = name.split(" ");
        arrayLength = words.length;
        
        
        //llop thru the array to determine vowels, consenents and add needed ending accordingly.  Checks
        //for valid data entered
        
          for (int i = 0; i <= arrayLength - 1; i++) {
              
            words[i] = words[i].toLowerCase();
           
            vowelConCheck = words[i].charAt(0);
            
             
            if (vowelConCheck == 'a' ||
                 vowelConCheck == 'e' ||
                  vowelConCheck == 'i' ||
                   vowelConCheck == 'o' || 
                    vowelConCheck == 'u') {
    
              newWord = words[i] + "way";
              System.out.print(newWord + " ");
             
             
            }
           
            else if  (words[i].charAt(1) == 'a' ||
                       words[i].charAt(1)==  'e' ||
                         words[i].charAt(1) == 'i' ||
                          words[i].charAt(1) ==  'o' ||
                           words[i].charAt(1) ==  'u') {
                        
                 newWord = words[i].substring(1, words[i].length()) + words[i].charAt(0) +"ay";
                 System.out.print(newWord + " ");
                
             
                }
            
            else if  (words[i].charAt(2) == 'a' ||
                       words[i].charAt(2)==  'e' ||
                         words[i].charAt(2) == 'i' ||
                          words[i].charAt(2) ==  'o' ||
                           words[i].charAt(2) ==  'u') {
                        
                 newWord = words[i].substring(2, words[i].length()) + words[i].charAt(0) + words[i].charAt(1) + "ay";
                 
                 System.out.print(newWord + " ");
               
             
             }
             else if (words[i].charAt(i) == 'y') {
                  newWord = words[i].substring(2, words[i].length()) + words[i].charAt(0) + words[i].charAt(1) + "ay";
                  System.out.print(newWord + " ");   
             }
             else {
                 System.out.print("Please enter valid text! Try again!!");
             }
            
     }
            // check to see if user wants to continue
            System.out.println();
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            System.out.println(); 
    }
           System.out.println();
           System.out.println();
           System.out.println("Bye!");    
   }
}
