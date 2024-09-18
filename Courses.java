import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName;
	String professorName;
	int year;
	List<Student> enrolledStudents = new ArrayList<>();
	
	public Courses(String courseName, String professorName, int year, List<Student> enrolledStudents) {
		this.courseName = courseName;
		this.professorName =  professorName;
		this.year = year;
		this.enrolledStudents = enrolledStudents;
	}

	public void enroll(Student student) {
		// TODO add the student to the collection
		enrolledStudents.add(student);
	} // Method enroll

	public void unEnroll(Student student) {
		// TODO remove this student from the collection
		// Hint: check if that really is this student
		enrolledStudents.remove( student );
	} // Method unEnroll

	public int countStudents() {
		// TODO implement
		return enrolledStudents.size();
	} // Method countStudents

	public int bestGrade() {
		// TODO implement
		return 0;
	} // Method bestGrade
	
	public List<Student> enrolledStudents()
    {
        return enrolledStudents;
    }

}
