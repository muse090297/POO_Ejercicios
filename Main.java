
public class Main {

	public static void main(String[] args) {
		
		Enroll inscripcionAlumno = new Enroll();
		Student estudiante1 = new Student("Paloma", "Gonzalez",1000,60,1);
		Student estudiante2 = new Student("Lorena", "Baez",1001,82,1);
		Student estudiante3 = new Student("Ricardo", "Mendoza",1002,52,2);
		Student estudiante4 = new Student("Estela", "Santos",1003,96,2);
		Student estudiante5 = new Student("Luis", "Lopez",1004,78,3);
		Student estudiante6 = new Student("Nicolás", "Jiménez",1005,100,3);
		Student estudiante7 = new Student("Clara", "Sánchez",1006,90,4);
		Student estudiante8 = new Student("Mateo", "Díaz",1007,55,4);
		Student estudiante9 = new Student("Andrés", "Morales",1008,79,5);
		Student estudiante10 = new Student("Isabel", "Ramírez",1009,81,5);
			
		String nombreMateria = "Español";
		String nombreMateria2 = "Matematicas";
		String nombreMateria3 = "Biologia";
		String nombreMateria4 = "Quimica";
		String nombreMateriaError = "Español52";
		
		//Metodo para imprimir Nombre completo
		estudiante1.printFullName();
		
		//Metodo para verificar si el alumno paso. TRUE paso. FALSE no paso
		System.out.println(estudiante2.isApproved()); //true
		System.out.println(estudiante8.isApproved()); //false
		
		//Metodo para verificar si el alumno paso de año
		System.out.println(estudiante6.year); // El estudiante esta en 3ro.
		estudiante6.changeYearIfApproved(); // Paso a 4
		System.out.println(estudiante6.year); // El estudiante esta en 4to.
		
		System.out.println(estudiante8.year); // El estudiante esta en 4to.
		estudiante8.changeYearIfApproved(); // No paso de año
		System.out.println(estudiante8.year); // El estudiante esta en 4to.
	
		System.out.println("\n\n*************************************************************\n");
		//Incribimos al alumno al curso Español
		inscripcionAlumno.enrollStudent(estudiante1, nombreMateria);
		inscripcionAlumno.enrollStudent(estudiante3, nombreMateria);
		inscripcionAlumno.enrollStudent(estudiante5, nombreMateria);
		inscripcionAlumno.enrollStudent(estudiante7, nombreMateria);
		inscripcionAlumno.enrollStudent(estudiante9, nombreMateria);
		//Incribimos al alumno al curso Matematicas
		inscripcionAlumno.enrollStudent(estudiante1, nombreMateria2);
		inscripcionAlumno.enrollStudent(estudiante2, nombreMateria2);
		inscripcionAlumno.enrollStudent(estudiante3, nombreMateria2);
		inscripcionAlumno.enrollStudent(estudiante4, nombreMateria2);
		inscripcionAlumno.enrollStudent(estudiante5, nombreMateria2);
		inscripcionAlumno.enrollStudent(estudiante6, nombreMateria2);
		//Incribimos al alumno al curso Biologia
		inscripcionAlumno.enrollStudent(estudiante2, nombreMateria3);
		inscripcionAlumno.enrollStudent(estudiante4, nombreMateria3);
		inscripcionAlumno.enrollStudent(estudiante6, nombreMateria3);
		inscripcionAlumno.enrollStudent(estudiante8, nombreMateria3);
		inscripcionAlumno.enrollStudent(estudiante10, nombreMateria3);
		//Incribimos al alumno al curso Quimica
		inscripcionAlumno.enrollStudent(estudiante1, nombreMateria4);
		inscripcionAlumno.enrollStudent(estudiante2, nombreMateria4);
		inscripcionAlumno.enrollStudent(estudiante6, nombreMateria4);
		inscripcionAlumno.enrollStudent(estudiante7, nombreMateria4);
		inscripcionAlumno.enrollStudent(estudiante8, nombreMateria4);
		inscripcionAlumno.enrollStudent(estudiante9, nombreMateria4);
		inscripcionAlumno.enrollStudent(estudiante10, nombreMateria4);
		
		inscripcionAlumno.displayCoursesInformation( nombreMateria );
		System.out.println("El total de alumnos inscritos al curso " + nombreMateria + " es " + inscripcionAlumno.countTotalStudents(nombreMateria));
		
		//Inscribimos al alumno a un curso que no existe
		inscripcionAlumno.enrollStudent(estudiante3, nombreMateriaError);
		
		
		//Dar de baja a un estudiante de un curso que no existe
		inscripcionAlumno.unenrollStudent(estudiante1, nombreMateriaError);
		//Dar de baja a un estudiante de un curso al que no esta inscrito
		inscripcionAlumno.unenrollStudent(estudiante5, nombreMateria3);
		//Dar de baja a un estudiante de un curso al que si esta inscrito
		inscripcionAlumno.unenrollStudent(estudiante6, nombreMateria2);

		//inscripcionAlumno.displayCoursesInformation( nombreMateria );
		
		System.out.println("\n\n********************* PROMEDIO MAS ALTO****************************************\n");
		inscripcionAlumno.BestGrade(nombreMateria3);
		inscripcionAlumno.BestGrade(nombreMateria2);
		inscripcionAlumno.BestGrade(nombreMateria);

	}

}
