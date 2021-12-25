package if_ternary;

import java.util.Scanner;

public class IfSwitchTernaryString7 {

	public static void main(String[] args) {
		//2 kelime oluþturun: isim1 ve isim2

	    // isim1 çift sayýda karakter içeriyorsa,

	    // ikinci kelimeyi ilk adýn ortasýna yerleþtirin

	    // ilk kelime tek sayida karakter iceriyorsa

	    // “isim1, isim2 ye eklenemiyor” yazdýrýn

	    // Örneðin:
	    // isim1= mehmet
	    // isim2= ahmet
	    // Yazdýr ==> mehahmetmet

	    // isim1= memet
	    // isim2= ahmet
	    // Yazdýr ==> isim1, isim2 ye eklenemiyor
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 isim girin daha sonra enter basin");

		String isim1=scan.next();
		String isim2=scan.next();
		
		if (isim1.charAt(isim1.length())%2==0 ) {
			System.out.println(isim1.charAt(isim1.length())/2 +""+ isim2);
		}else if(isim1.charAt(isim1.length())%2==1) {
			System.out.println("isim1, isim2 ye eklenemiyor");}
		
		
			
		scan.close();
		
		
		
		
		
	}

}
