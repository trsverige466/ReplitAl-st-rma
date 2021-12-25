package loops;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		// Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz. (Mulakat Sorusu)
				// Input :1238
				// Output :Girilen Numananin Tersi: 8321
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Lutfen bir sayi giriniz");
				String sayi = scan.next();
				
				String ters="";
				
				
				for (int i = sayi.length()-1; i >= 0; i--) {
					ters+=sayi.substring(i, i+1);
					
				}
				System.out.println("Girilen numaranin tersi : "+ters);
				
				scan.close();

	}

}
