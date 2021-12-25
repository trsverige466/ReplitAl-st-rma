package if_ternary;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		/*Kullanýcýdan karenin kenar uzunluðunu alýn ve karenin alanýný ve çevresini konsola yazdýran bir program yazýn.

          Ornek Cikti :

           Alan: 9

          Cevre: 12*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen karenin bir kenar uzunlugunu giriniz");

		int kenar=scan.nextInt();
		
		int alan= kenar*kenar;
		int cevre= kenar*4;
		
		System.out.println("alan:"+alan );
		System.out.println("cevre:"+cevre);
		scan.close();
	}

}
