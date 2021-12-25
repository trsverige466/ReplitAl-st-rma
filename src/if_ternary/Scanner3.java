package if_ternary;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		//Kullanýcýdan dikdörtgenin kenar uzunluklarýný alýn ve dikdörtgenin alanýný ve çevresini konsola yazdýran bir program yazýn.


		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dikdortgenin kýsa kenarini ve uzun kenarini giriniz");
		
		int kenarkisa=scan.nextInt();
		int kenarUzun=scan.nextInt();
		
		int cevre= (kenarkisa*2)+(kenarUzun*2);
		int alan=  kenarkisa*kenarUzun;
		
		System.out.println("alan:" +alan);

		System.out.println("cevre:" +cevre);
		scan.close();
	}

}
