package if_ternary;

import java.util.Scanner;

public class Scanner1 {
	
	//Kullan�c�dan bir say� al�n ve say�n�n k�p�n�n yar�s�n� konsola yazd�ran bir program yaz�n.

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);

	System.out.println("lutfen bir sayi giriniz");
		
	double sayi=scan.nextDouble();
	
	double sonuc= (sayi*sayi*sayi)/2;
	
	System.out.println("sonuc :" +sonuc);
		
		scan.close();

	}

}
