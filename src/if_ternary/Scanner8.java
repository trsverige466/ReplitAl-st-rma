package if_ternary;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
		// Kullan�c�dan �� basamakl� bir say� girmesini ve bu say�n�n basamaklar�n�n toplam�n� bulmas�n� isteyin.

        //�rnek ��kt�:

		//Verilen tamsay�n�n rakamlar� toplam� 10'dur.
		
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
		
	

		System.out.println("Verilen tamsay�n�n rakamlar� toplam� 10'dur." + rakamlarToplami );
		scan.close();
		
		
	}

}
