
public class Student {
	Courses c1;
	Courses c2;
	Courses c3;
	String name;
	String stuNo;
	String classString;
	double avarage;
	boolean isPass;

	Student(String name, String stuNo, String classString, Courses c1, Courses c2, Courses c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classString = classString;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0.0;
		this.isPass = false;

	}

	void addBulkExamNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100) {
			c1.note = note1;
		}

		if (note2 >= 0 && note2 <= 100) {
			c2.note = note2;

		}
		if (note3 >= 0 && note3 <= 100) {
			c3.note = note3;
		}
	}

	void isPass() {

		this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
		if (this.avarage > 50) {
			System.out.println("----Congrats passed---");
			this.isPass = true;
		} else {
			System.out.println("---- U failed----");
			isPass = false;
		}
		printNote();
	}

	void printNote() {
		System.out.println("Name  : " + this.name);
		System.out.println("Student No : " + this.stuNo);
		System.out.println("Grade  : " + this.classString);
		System.out.println(this.c1.name + " Note\t : " + this.c1.note);
		System.out.println(this.c2.name + " Note\t : " + this.c2.note);
		System.out.println(this.c3.name + " Note\t : " + this.c3.note);
		System.out.println("Avarages Result : " + this.avarage);
	}

}
