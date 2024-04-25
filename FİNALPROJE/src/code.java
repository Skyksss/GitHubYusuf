
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class code {
	static boolean isaktif = true;
	static int row;
	static int col;
	static int secilenSayı;
	static int[][] game;

	public static void main(String[] args) {

		ArrayList<String> myNumbers = new ArrayList<>();

		try {
			File myObj = new File("X:\\YsfProject\\FİNALPROJE\\src\\asd.txt");
			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				myNumbers.add(data);
			}

			myReader.close();

			// Verileri matrise dönüştürme
//			int[][] game = new int[myNumbers.size()][];
//			for (int i = 0; i < myNumbers.size(); i++) {
//				String[] row = myNumbers.get(i).split("\\s+"); // Boşluklarla ayır
//
//				game[i] = new int[row.length];
//
//				for (int j = 0; j < row.length; j++) {
//					game[i][j] = Integer.parseInt(row[j].trim());

			game = new int[myNumbers.size()][myNumbers.get(0).split(",").length];
			for (int i = 0; i < myNumbers.size(); i++) {
				String[] row = myNumbers.get(i).split(",");
				for (int j = 0; j < row.length; j++) {
					game[i][j] = Integer.parseInt(row[j].trim());

					start(game);
				}
			}

		} catch (Exception e) {
			System.out.println("Dosya okuma hatası: " + e.getMessage());
		}
	}

	public static void start(int[][] game) {
		Scanner scan = new Scanner(System.in);

		while (isaktif) {

			System.out.println("satır değeri giriniz");
			row = scan.nextInt();
			System.out.println("Sutun değeri giriniz");
			col = scan.nextInt();

			if (row < 0 || row > game.length || col < 0 || col > game[0].length) {
				System.out.println("Hatalı giriş...");
				break;
			}

			if (row == 0 && col == 0) {
				System.out.println("Game over");
				isaktif = false;
			}

			secilenSayı = game[row][col];
			System.out.println("Secilen Kordinattaki Sayı = " + secilenSayı);
			isaktif = false;
		}
	}

	static void check(int[][] game, int row, int col, int secilenSayı) {
		for (int i = row - 1; i < row + 1; i++) {
			for (int j = col - 1; col < col + 1; j++) {
				if (game[i][j] == secilenSayı) {
					game[row][col] = 0; // secilen değeri 0 yapma

					convertX();
				} else {
					return;
				}
			}

		}
	}

	public static void convertX() {
		// (0'ları X olarak yazdırma)
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if (game[i][j] == 0) {
					System.out.print("X ");
				}
			}
			printMap(game);
		}
	}

	public static void printMap(int[][] game) {
		// Matrisi ekrana yazdırma
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
	}

}
