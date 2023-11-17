package balabla;

import java.time.Year;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.swing.plaf.InputMapUIResource;

public class PratikZeka {
	public static void main(String[] args) {

		Random rand = new Random();
		int number = rand.nextInt(100);

		Scanner scan = new Scanner(System.in);
		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		System.out.println(number);
		while (right < 5) {
			System.out.println("Tahmin Giriniz");
			selected = scan.nextInt();
			if (selected < 0 || selected > 99) {
				System.out.println("0 ile 100 arasında bir değer giriniz");

				if (isWin) {
					right++;
					System.out.println(" Çok fazla hatalı giriş yaptınız  .  Kalan hak = " + (5 - right));

				} else {
					isWin = true;
					System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir");

				}
				continue;
			}

			if (selected == number) {
				System.out.println("CONGRATS DOĞRU TAHMİN : " + number);
				isWin = true;

				break;

			} else {

				wrong[right++] = selected;
				System.out.println("Hatalı sayı girdiniz ! ");
				if (selected > number) {
					System.out.println(selected + " sayısı gizli sayıdan büyüktür");
				} else {
					System.out.println(selected + " sayısı gizli sayıdan küçüktür");
				}
			}
			System.out.println("Kalan hak = " + (5 - right));
		}
		if (!isWin) {
			System.out.println("KAYBETTİNİZ");
			System.out.println("Tercihleriniz " + Arrays.toString(wrong));
		}

	}

}
