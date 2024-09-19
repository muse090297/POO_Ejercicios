import java.util.HashMap;

public class Enroll {

	HashMap<String, Courses> courses = new HashMap<>();
	// HashMap<String, Student> student = new HashMap<>();

	public Enroll() {
		courses.put("Biologia", new Courses("Biologia", "Luis Romero", 1));
		courses.put("Matematicas", new Courses("Matematicas", "Luisa Sanchez", 1));
		courses.put("Quimica", new Courses("Quimica", "Patricia Gomez", 2));
		courses.put("Español", new Courses("Español", "Laura Martínez", 2));
		courses.put("Artes", new Courses("Artes", "Sofía López", 3));
		courses.put("Danza", new Courses("Danza", "Alejandro Ruiz", 3));
		courses.put("Deportes", new Courses("Deportes", "Mariana Fernández", 4));
		courses.put("Fisica", new Courses("Fisica", "Carlos Pérez", 4));
		courses.put("Ciencias Sociales", new Courses("Ciencias Sociales", "Valentina Torres", 5));
		courses.put("Ingles", new Courses("Ingles", "Diego Herrera", 5));
		courses.put("Geografía", new Courses("Geografía", "Ana Silva", 6));

		/*
		 * student.put("1000", new Student("Paloma", "Gonzalez",1000,60,1));
		 * student.put("1001", new Student("Lorena", "Baez",1001,82,1));
		 * student.put("1002", new Student("Ricardo", "Mendoza",1002,52,2));
		 * student.put("1003", new Student("Estela", "Santos",1003,96,2));
		 * student.put("1004", new Student("Luis", "Lopez",1004,78,3));
		 * student.put("1005", new Student("Nicolás", "Jiménez",1005,100,3));
		 * student.put("1006", new Student("Clara", "Sánchez",1006,90,4));
		 * student.put("1007", new Student("Mateo", "Díaz",1007,65,4));
		 * student.put("1008", new Student("Andrés", "Morales",1008,79,5));
		 * student.put("1009", new Student("Isabel", "Ramírez",1009,81,5));
		 * student.put("1010", new Student("Fernando", "Torres",1010,99,6));
		 */

	}

	public void enrollStudent(Student estudiante, String courseName) {
		if (courses.containsKey(courseName) == true) { // Validamos que exista un curso con el nombre dado
			Courses materia = courses.get(courseName); // Obtenemos el curso al que vamos a inscribir
			materia.enroll(estudiante);
			courses.put(courseName, materia);
			System.out.println("Se inscribio correctamente al alumno " + estudiante + " al curso " + courseName);
		} else {
			System.out.println("El nombre del curso " + courseName + " no es valido");
		}

	}

	public void unenrollStudent(Student estudiante, String courseName) {
		Courses materia = courses.get(courseName); // Obtenemos el curso al que vamos a inscribir
		if (courses.containsKey(courseName) == true && (materia.enrolledStudents.contains(estudiante))==true) { // Validamos que exista un curso con el nombre dado
			materia.unEnroll(estudiante);
			courses.put(courseName, materia);
			System.out.println("Se dio de baja correctamente al alumno " + estudiante + " del curso " + courseName);
		} else { if (courses.containsKey(courseName) == false) {
			System.out.println("El nombre del curso " + courseName + " no existe");
		} else {
			System.out.println("El alumno " + estudiante + " no esta inscrito en " + courseName);
		}
			
		}

	}

	public void displayCoursesInformation(String courseName) {
		// Retorna informacion del curso dado el ID
		System.out.println("\n" + courses.get(courseName));
	}
	
	public int countTotalStudents(String courseName) {
		Courses materia = courses.get(courseName);
		return materia.countStudents();
	}

}
