package if_ternary;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		/*Kullan�c�dan karenin kenar uzunlu�unu al�n ve karenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.

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
