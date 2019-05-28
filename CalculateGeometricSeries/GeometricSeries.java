import java.util.Scanner;


/**
 *
 * @author Bradley Yandell 
 * 
 * A geometric series is produced when each value (term) in the series is the product of a particular number (the common ratio) and the previous term in the series.
 */


public class GeometricSeries {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      final String INSTRUCTION_1 = "First term in the series:"; 
      final String INSTRUCTION_2 = "Common ratio for the series:";
      final String INSTRUCTION_3 = "Number of terms to generate:";
      double numberOfTerms;
      int displayCount = 0;
      double commonRatio;
      double firstTerm;
      
      final double MINVAL_1 = 0.1;
      final double MINVAL_2 = 0.2;
      final double MINVAL_3 = 2;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Program will compute terms in a Geometric Series");
      System.out.println(); 
        
       firstTerm = readUserInput(INSTRUCTION_1, keyboard, MINVAL_1);
       commonRatio = readUserInput(INSTRUCTION_2, keyboard, MINVAL_2);
       numberOfTerms = readUserInput(INSTRUCTION_3, keyboard, MINVAL_3);
       
      
       System.out.println(); 
       System.out.println(); 
       System.out.println("RESULTS"); 
       
       calculateDisplayGeoSeries(firstTerm, commonRatio, numberOfTerms);
       
       
    }
        
        /**
         * method 1 - read input from user
         * @param instruction
         * @param keyboard
         * @param minVal
         * @return userInput
         */
    
       public static double readUserInput(String instruction, Scanner keyboard, double minVal)
       {
           double userInput;
           
           System.out.println(instruction);
           userInput = keyboard.nextDouble();
           
           while  (userInput < minVal)
           {
               System.out.println("Invalid input.  Must be at least " + minVal);
               System.out.println(instruction);
               userInput = keyboard.nextDouble();
            }
           
           return userInput;
       }

       
       /**
         * method 2 - calculate and display terms in Geo series
         * @param firstTerm
         * @param commonRatio
         * @param numberOfTerms
         * @return geoSum
         */
     public static double calculateDisplayGeoSeries(double firstTerm, double commonRatio, double numberOfTerms)
      {
       
    
       int count;
       double termSum = 0;
       double geoSum = 0;
       
           
         for (count = 1; count <= numberOfTerms; count++)
         {
            if (count == 1) {
               
               System.out.printf("Term %d: %.9f\n", count, firstTerm);
               termSum = firstTerm;
               geoSum = geoSum + termSum;
            }
            else {
             termSum = termSum * commonRatio;
             geoSum = geoSum + termSum;
             System.out.printf("Term %d: %.9f\n", count, termSum);
            }

      }
       System.out.println();
       System.out.printf("For a series with a common ratio of %.5f\n", commonRatio); 
       System.out.printf("starting with term %.5f,\n", firstTerm); 
       System.out.printf("the sum of the first %.0f terms is %.9f\n", numberOfTerms, geoSum); 
       
       return geoSum;
 }
}
