package gradeconverter;

/**
 *
 * @author Bradley
 * This is the Grade class where we define and initialize our variables for this class.
 * and pull a letter grade to match the number grade entered by the user.
 */
public class Grade {
    
     private int numberGrade;
     private String letter;
     
     public Grade() {
        numberGrade = 0;
        letter = "";
        
    }
     
     public Grade(int numberGrade, String letter) {
        this.numberGrade = numberGrade;
        this.letter = letter;
        
    }
     
     public void setNumberGrade(int numberGrade) {
        this.numberGrade = numberGrade;
    }

    public int getNumberGrade() {
        return numberGrade;
    }


    public String getLetterGrade(int numberGrade) {
         
        // int numberGradeConv = Integer.parseInt(numberGrade);
         
         if (numberGrade > 87 && numberGrade < 101) { 
                letter = "A";
            } 
         else if (numberGrade > 79 && numberGrade < 88) {
                letter = "B";
            } 
         else if (numberGrade > 66 && numberGrade < 80) {
                letter = "C";
            } 
         else if (numberGrade > 59 && numberGrade < 68) {
                letter = "D";
            } 
         else if (numberGrade < 60) {
                letter = "F";
            }
            return letter;
       
    }
    
}
