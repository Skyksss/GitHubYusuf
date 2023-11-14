
public class Main {
	public static void main(String[] args) {

		Teacher t1 = new Teacher("Jousef", "111", "MATH", 45);
		Teacher t2 = new Teacher("Nicola Tesla", "333", "PHYS", 34);
		Teacher t3 = new Teacher("David Alonzo ", "453", "ENG", 56);
	
		// --------------------------------------------------------
		
		Courses mathematic = new Courses("Mathematic", "111", "MATH");
		mathematic.addTeacher(t1);
		System.out.println("------------------------------------------------");
		
		Courses physic = new Courses("Physic", "333", "PHYS");
		physic.addTeacher(t2);
		System.out.println("------------------------------------------------");
		
		Courses english = new Courses("English", "134", "ENG");
		english.addTeacher(t3);
       
//		Courses langCourses = new Courses("test for other option", "123" , "LANG");
//		langCourses.addTeacher(t3);
		
		System.out.println("--------------------------------------------------------");
		
		Student s1 = new Student("King", "21313", " 5 ", mathematic, physic, english);
		s1.addBulkExamNote(56, 100, 32);
		s1.isPass();
		
		System.out.println("-------------------------------------------------------");
		
		Student s2 = new Student("Point", "1231", "4", mathematic, physic, english);
		s2.addBulkExamNote(13, 20, 98);
		s2.isPass();
	

	}

}
