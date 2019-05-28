/**
 * Class Student defines data and method members for Student class objects
 * which represent students within a college
 */
public class Student {
	private int stuIdNum;
	private double stuGPA;

	/**
	 * Default constructor
	 */
	public Student() {
	}

	/**
	 * Constructor
	 * 
	 * @param stuIdNum
	 * @param stuGPA 
	 */
	public Student(int stuIdNum, double stuGPA) {
		this.stuIdNum = stuIdNum;
		this.stuGPA = stuGPA;
	}

	/**
	 * Getter
	 * 
	 * @return stuGPA
	 */
	public double getStuGPA() {
		return stuGPA;
	}

	/**
	 * Setter
	 * 
	 * @param stuGPA 
	 */
	public void setStuGPA(double stuGPA) {
		this.stuGPA = stuGPA;
	}

	/**
	 * Getter
	 * 
	 * @return stuIdNum
	 */
	public int getStuIdNum() {
		return stuIdNum;
	}

	/**
	 * Setter
	 * 
	 * @param stuIdNum 
	 */
	public void setStuIdNum(int stuIdNum) {
		this.stuIdNum = stuIdNum;
	}
}
