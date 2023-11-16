
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	double bonus;
	double tax;
	double raiseSalary;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	void bonus() {
		if (workHours > 40) {
			this.bonus = (this.workHours - 40) * 30;
		} else {
		this.bonus = 0;
		}
	}

	void tax() {
		if (salary > 1000) {
			this.tax = this.salary * 0.03;

		} else {
			this.tax = this.salary * 0;
		}

	}

	void raiseSalary() {
		if (2021 - this.hireYear < 10) {
			this.raiseSalary = this.salary * 0.05;

		} else if (2021 - this.hireYear < 20) {
			this.raiseSalary = this.salary * 0.10;
		} else {
			this.raiseSalary = this.salary * 0.15;
		}

	}

	void print() {
		System.out.println("NAME        = " + this.name);
		System.out.println("SALARY      = " + this.salary);
		System.out.println("WORKHOURS   = "  +  this.workHours);
		System.out.println("HIREYEAR    = " + this.hireYear);
		System.out.println("TAX         = "  +  this.tax);
		System.out.println("BONUS       = " + this.bonus);
		System.out.println("RaiseSalary = " + this.raiseSalary);
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus - this.tax));
		System.out.println("Toplam Maaş : " + (this.salary + this.bonus + this.raiseSalary - this.tax));
	}
}
