package if_ternary;

import java.util.Scanner;

public class IfSwitchTernaryString6 {

	public static void main(String[] args) {
		/* Kullan�c�dan bir isim yazmas�n� isteyin, ad�n uzunlu�u 3 olmal�d�r. 
		 * Ard�ndan, ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin.

        Eger ayn� karakterlere sahipse"isim ayni karakterlere sahiptir." yazdirin.

        Eger ayni kaakterlere sahip degilse"Dizenin benzersiz karakterleri var" yazdirin.

        Ternary kullanin.*/
		
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen 3 harfli bir isim girin ");
	String isim=scan.next();
	
	System.out.println((isim.charAt(0)==isim.charAt(1) && isim.charAt(1)==isim.charAt(2)) ? "isim ayni karakterlere sahiptir." :
		"Dizenin benzersiz karakterleri var" );
		
		scan.close();
		
		
		

	}

}
