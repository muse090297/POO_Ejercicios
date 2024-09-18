
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student alumno1 = new Student("Paloma", "Gonzalez",1000,60,2);
		Student alumno2 = new Student("Lorena", "Baez",1001,82,5);
		Student alumno3 = new Student("Ricardo", "Mendoza",1002,82,1);
		Student alumno4 = new Student("Estela", "Santos",1003,82,4);
		Student alumno5 = new Student("Luis", "Lopez",1004,82,3);
		
		
		
		alumno1.printFullName();
		System.out.println(alumno1.isApproved());
		
		System.out.println(alumno1.year);
		alumno1.changeYearIfApproved();
		System.out.println(alumno1.year);
	
	}

}
