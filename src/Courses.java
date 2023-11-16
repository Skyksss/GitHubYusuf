
public class Courses {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	double note;

	public Courses(String name, String code, String prefix) {

		this.name = name;
		this.code = code;
		this.prefix = prefix;
		double note = 1;

	}

	public void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
	printTeacherInfo();
		} else {
			System.out.println("Teacher and course section does not match!!");
		}

	}

	public void printTeacherInfo() {
	this.teacher.print();
	}

	public void printCourses() {
		System.out.println("Name : ");
	}

}
