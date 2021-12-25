package if_ternary;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		// Kullanýcýdan bir Float deðer girmesini isteyin, bu sayýyý short deðiþken tipine dönüþtürün ve konsolda yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir float degeri girin:");
		float sayi=scan.nextFloat();
		
		short sayi2=(short) sayi;
		System.out.println(sayi2);
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
