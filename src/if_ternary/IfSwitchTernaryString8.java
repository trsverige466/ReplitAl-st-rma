package if_ternary;

import java.util.Scanner;

public class IfSwitchTernaryString8 {

	public static void main(String[] args) {
		// Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan oluþan yeni bir String yazdýrýn

       //Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.

		//INPUT : Mustafa

		//OUTPUT : fafafa
		
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen enaz 2 harfli bir isim girin");
	
	String isim=scan.next();
	
	
	System.out.println(isim.charAt(isim.length()-2) + "" + isim.charAt(isim.length()-1) + 
			isim.charAt(isim.length()-2) + "" + isim.charAt(isim.length()-1)+ 
			isim.charAt(isim.length()-2) + "" + isim.charAt(isim.length()-1));
		
		
		scan.close();
		
		
		
		

	}

}
