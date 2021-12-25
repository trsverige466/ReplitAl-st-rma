package if_ternary;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		// Kullan�c�dan dakika girmesini isteyin, Dakikalar� birka� y�l ve g�n say�s�na d�n��t�rmek i�in bir Java program� yaz�n.

		//INPUT:

		//Dakika say�s�: 3456789

		//OUTPUT :

		//3456789 dakika yakla��k 6 y�l 210 g�nd�r
		
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
