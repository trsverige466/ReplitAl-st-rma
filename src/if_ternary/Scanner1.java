package if_ternary;

import java.util.Scanner;

public class Scanner1 {
	
	//Kullanýcýdan bir sayý alýn ve sayýnýn küpünün yarýsýný konsola yazdýran bir program yazýn.

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);

	System.out.println("lutfen bir sayi giriniz");
		
	double sayi=scan.nextDouble();
	
	double sonuc= (sayi*sayi*sayi)/2;
	
	System.out.println("sonuc :" +sonuc);
		
		scan.close();

	}

}
