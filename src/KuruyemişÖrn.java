
public class KuruyemişÖrn {
	public static void main(String[] args) {
		/*
		 * bir kuruyemişci toptancıdan ; 12kilo leblebiyi 3.5tlden 25 kilo fındığı 15.7
		 * tlden 40 kilo bademi de 22 den almıştır
		 * 
		 * bu ürünleri satarken ; --£ leblebinin kilosunu %50 fazlasına satmış --£
		 * fındık ise % 40 fazlasına --£ badem ise %60 fazlasına satmıştır
		 * 
		 * kuryemişci kazandığı para ile kirasını ödemek istemektedir ;
		 * 
		 * kira tutarı : 500
		 * 
		 * kazancı 500den fazla ise ödeyebilsin değilse ödeyemesin;
		 * 
		 */
		double leblebialış = 12 * 3.5;
		System.out.println("Leblebi gider : " + leblebialış);
		double fındıkalış = 25 * 15.7;
		System.out.println("Fındık Gider : " + fındıkalış);
		double bademalış = 40 * 22;
		System.out.println("Badem Gider : " + bademalış);

		double toplamgider = leblebialış + fındıkalış + bademalış;

		System.out.println("Toplam Gider : " + toplamgider);

		double leblebisatış = (leblebialış + leblebialış * 1.5);

		double fındıksatış = (fındıkalış + fındıkalış * 1.4);

		double bademsatış = (fındıkalış + fındıkalış * 1.6);

		double toplamgelir = leblebisatış + fındıksatış + bademsatış;

		System.out.println("Toplam Gelir : " + toplamgelir);

		double kaar = toplamgelir - toplamgider;

		System.out.println("Kuruyemişçinin Kaarı : " + kaar);

		if (kaar > 500) {
			System.out.println("Kira ödenebilir  ");

		} else {
			System.out.println("Kira Ödenemez");
		}

	}
}
