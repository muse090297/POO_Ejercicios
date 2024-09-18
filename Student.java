
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
	}

	public void printFullName() {
		System.out.println("El nombre completo del alumno es: " + this.firstName + " " + this.lastName);
	}// Method printFullName

	public boolean isApproved() {
		// TODO implement: should return true if grade >= 60
		if (this.grade >=60) {
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
		if (this.grade >=60) {
			this.year=year+1;
			System.out.println("Congratulation, pasaste a " + this.year + "°");
		} else {
			System.out.println("No pasaste de año");
		}
		
		return 0;
	}// Method changeYearIfApproved
}