package if_ternary;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		//Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n ve dikd�rtgenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.


		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dikdortgenin k�sa kenarini ve uzun kenarini giriniz");
		
		int kenarkisa=scan.nextInt();
		int kenarUzun=scan.nextInt();
		
		int cevre= (kenarkisa*2)+(kenarUzun*2);
		int alan=  kenarkisa*kenarUzun;
		
		System.out.println("alan:" +alan);

		System.out.println("cevre:" +cevre);
		scan.close();
	}

}
