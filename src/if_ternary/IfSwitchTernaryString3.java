package if_ternary;

import java.util.Scanner;

public class	IfSwitchTernaryString3 {

	public static void main(String[] args) {
		/* Verilen iki sayýnýn (sýfýrdan büyük veya sýfýra eþit) toplamýný hesaplayan ve yazdýran bir Java programý yazýn.
		 *  Verilen tamsayýlar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdýrýn.

				Ornek:

        	   INPUT :

        	  25

        	   46

        	 OUTPUT :

           Numaralarin Toplami:

        	  71*/
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 sayi giriniz :");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1+sayi2>=0 ) {
			System.out.println("sayilarin toplami :"+ (sayi1+sayi2));
		}
		
		if (sayi1+sayi2>999999999) {
			System.out.println("overFlow");
		}
		
		scan.close();
		

	}

}
