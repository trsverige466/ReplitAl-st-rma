package if_ternary;

import java.util.Scanner;

public class IfSwitchTernaryString8 {

	public static void main(String[] args) {
		// Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan olu�an yeni bir String yazd�r�n

       //Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.

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
