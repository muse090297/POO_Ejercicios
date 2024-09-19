
public class Student {
	String firstName;
	String lastName;
	int registration;
	int grade;
	int year;

	public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}//Constructor 1
	
	public Student(String lastName, int registration, int grade, int year) {
		this("DEFAULT_NAME", lastName, registration, grade, year);
	}//Constructor2
	
	public Student(String lastName, int registration, int grade) {
		this("DEFAULT_NAME", lastName, registration, grade, 1);
	}//Constructor3
	
	

	public void printFullName() {
		System.out.println("El nombre completo del alumno es: " + this.firstName + " " + this.lastName);
	}// Method printFullName

	public boolean isApproved() {
		// TODO implement: should return true if grade >= 60
		if (this.grade >= 60) {
			return true;
		} else {
			return false;
		}
	}// Method isApproved

	public int changeYearIfApproved() {
		// TODO implement: the student should advance to the next year if he/she grade
		// is >= 60
		// Make year = year + 1, and print "Congratulations" if the student has been
		// approved
		if (this.grade >= 60) {
			this.year = year + 1;
			System.out.println("Congratulation, you passed a " + this.year + " year");
		} else {
			System.out.println("Sorry, you failed the year");
		}

		return 0;
	}// Method changeYearIfApproved

	public String toString() {
		return " FirstName= " + this.firstName + " LastName= " + this.lastName +  
				" Registration= " + this.registration + " Grade= " + this.grade + 
				" Year= " + this.year;
	}

}