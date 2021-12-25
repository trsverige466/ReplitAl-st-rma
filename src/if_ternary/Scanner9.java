package if_ternary;

import java.util.Scanner;

public class Scanner9 {

	public static void main(String[] args) {
		//Girilen zamaný saniyeye çeviren bir program yazýnýz.

		//Örnek Çýktý:

		//1 saat 10 dakika 50 saniye ==>

		//4250 saniye
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir zaman girin saat dakika ve saniye olsun:");
		double saat=scan.nextDouble();
		double dakika=scan.nextDouble();
		double saniye=scan.nextDouble();
		double zaman=(saniye)+(60*dakika)+(3600*saat);
		
	
		
		
		
		System.out.println(zaman);
		scan.close();
		
		
		
		
		

	}

}
