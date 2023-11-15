
public class Mainn {

	public static void main(String[] args) {

		fighter f1 = new fighter("King", 60, 20, 100 , 50);

		fighter f2 = new fighter("Goat",80, 25, 90 , 40);

	
	match match= new match(f1, f2, 90, 100);
	match.run();
	}

}
