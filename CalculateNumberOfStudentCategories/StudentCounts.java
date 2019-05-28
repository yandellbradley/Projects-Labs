/**
 * setters, getters and calc methods
 * 
 * @author Bradley Yandell
 */
public class StudentCounts {
	private int numFreshmen;
	private int numSophomores;
	private int numJuniors;
	private int numSeniors;

	public StudentCounts() {
		numFreshmen = 0;
		numSophomores = 0;
		numJuniors = 0;
		numSeniors = 0;
	}

	public int getNumFreshmen() {
		return numFreshmen;
	}

	public int getNumSophomores() {
		return numSophomores;
	}

	public int getNumJuniors() {
		return numJuniors;
	}

	public int getNumSeniors() {
		return numSeniors;
	}
	
	
	/**
     * this method will increment the class category by 1 each time a line is read from the data file
     * @variable numFreshmen
     * @variable numSophomores
     * @variable numJuniors
     * @variable numJuniors
     * @param numberOfCredits
     * 
     */
     
   public void incrementOneCount(int numberOfCredits) { 
      
     
      
      if (numberOfCredits < 30 ) {
         numFreshmen = numFreshmen + 1;
      }
      else if (numberOfCredits >= 30 && numberOfCredits < 60) {
         numSophomores = numSophomores + 1;
      }
      else if (numberOfCredits >= 60 && numberOfCredits < 90) {
         numJuniors =  numJuniors +1;
      }
      else {
         numSeniors = numSeniors + 1;
      }
   }
  
    /**
     * this method will diplay the count for each class category 
     * @variable numFreshmen
     * @variable numSophomores
     * @variable numJuniors
     * @variable numSeniors
     * 
     */
      
  public void displayCounts() {
     
     System.out.println("");
     
     System.out.println("Freshman: " + numFreshmen);
     System.out.println("Sophomore: " + numSophomores);
     System.out.println("Juniors: " + numJuniors);
     System.out.println("Seniors: " + numSeniors);
     
  }
  
    /**
     * this method will calculate and total how many lower division students there are in the data file
     * @variable numFreshmen
     * @variable numSophomores
     * @variable underClassman
     */
  
  public int calcLowerDivision() {
     int underClassman;
     
     underClassman = numFreshmen + numSophomores;
     return underClassman;
  }
  
    /**
     * this method will calculate and total how many upper division students there are in the data file
     * @variable numJuniors
     * @variable numSeniors
     * @variable upperClassman
     */
     
  public int calcUpperDivision() {
     int upperClassman;
     
     upperClassman = numJuniors + numSeniors;
     return upperClassman;
  }
  
}
