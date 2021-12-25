package if_ternary;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
		// Kullanýcýdan üç basamaklý bir sayý girmesini ve bu sayýnýn basamaklarýnýn toplamýný bulmasýný isteyin.

        //Örnek Çýktý:

		//Verilen tamsayýnýn rakamlarý toplamý 10'dur.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 3 basamakli bir sayi giriniz:");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		
		int rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
	

		System.out.println("Verilen tamsayýnýn rakamlarý toplamý 10'dur." + rakamlarToplami );
		scan.close();
		
		
	}

}
