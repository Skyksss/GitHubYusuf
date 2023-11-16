
public class mainn {

	public static void main(String[] args) {

		Employee worker = new Employee("Jousef", 2000, 50, 2000);
		worker.tax();
		worker.bonus();
		worker.raiseSalary();
		worker.print();

	}

}
