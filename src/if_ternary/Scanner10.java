package if_ternary;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		// Kullanýcýdan dakika girmesini isteyin, Dakikalarý birkaç yýl ve gün sayýsýna dönüþtürmek için bir Java programý yazýn.

		//INPUT:

		//Dakika sayýsý: 3456789

		//OUTPUT :

		//3456789 dakika yaklaþýk 6 yýl 210 gündür
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dakika giriniz");
		long dakika=scan.nextLong();
		
		int gun=(int) (dakika%(365));
		int yil=(int) (dakika/(60*24*365));
		
		System.out.println(dakika+ " dakika yaklasik " + yil+ " yil "+ gun + " gundur" );
		scan.next();
		
	}

}
