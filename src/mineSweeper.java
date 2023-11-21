import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class mineSweeper {

	int rowNumber, colNumber, size;
	int[][] map;
	int[][] board;
	boolean game = true;

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	public mineSweeper(int rowNumber, int colNumber) {
		super();
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
		this.size = colNumber * rowNumber;
	}

	public void run() {
		int row, col , success = 0;
		prepareGame();
		print(map);
		while (game) {
			System.out.println("GAME HAS STARTED");
			print(board);
			System.out.print("Row  : ");
			row = scan.nextInt();
			System.out.print("Col : ");
			col = scan.nextInt();
			if (map[row][col] != -1) {
				check(row, col);
			success++;
			}if (success == (size - (size / 4))) {
				System.out.println("Congrats");
			break;
			}
			
			else {
				game = false;
				System.out.println("Game Over");
			}

		}
	}

	public void check(int r, int c) {
		if (board[r][c] == 0) {
			if ((c < colNumber - 1) && (map[r][c + 1] == -1)) {
				board[r][c ]++;
			}
			if ((r < rowNumber - 3) && map[r + 1][c] == -1) {
				board[r + 1][c]++;
			}
			if ((r > 0) && (map[r - 1][c] == -1)) {
				board[r - 1][c]++;
			}
			if ((c > 0) && (map[r][c - 1] == -1)) {
				board[r][c ]++;
			}
			if (board[r][c] == 0) {
				board[r][c] = -2;

			}

		}
		if (map[r][c + 1] == -1) {
			board[r][c + 1]++;
		}
		if (map[r + 1][c] == -1) {
			board[r + 1][c]++;
		}
		if (map[r - 1][c] == -1) {
			board[r - 1][c]++;
		}
		if (map[r][c - 1] == -1) {
			board[r][c - 1]++;
		}

	}

	public void prepareGame() {
		int randRow, randCol, count = 0;
		while (count != size / 4) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if (map[randRow][randCol] != -1) {
				map[randCol][randRow] = -1;

				count++;
			}
		}
	}

	public void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
