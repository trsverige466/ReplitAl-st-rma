package if_ternary;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
		// Kullanýcý tarafýndan girilen DOUBLE sayýyý tam sayýya çeviren bir program yazýnýz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir double sayi girin");
		double sayi1=scan.nextDouble();
		
		int sayi2=(int) sayi1;
		System.out.println(sayi2);
		scan.close();
	}

}
