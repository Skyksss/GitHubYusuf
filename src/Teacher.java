
public class Teacher {
	String name;
	String no;
	String branch;
	int age;

	Teacher(String name, String mpno, String branch , int age) {
		this.name = name;
		this.no = mpno;
		this.branch = branch;
		this.age = age;

	}

	void print() {
		System.out.println("Name : " + this.name);
		System.out.println("Number : " + this.no);
		System.out.println("Branch : " + this.branch);
		System.out.println("Age : " + this.age);
	}

}
