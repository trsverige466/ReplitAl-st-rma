package if_ternary;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		/* Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný sorun. Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.

					1 þeker = 1.7 gr

						Örnek Çýktý:

    			   Yýlda 12.41 kg þeker kullanýyor.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("gunde ne kadar cay ictiginizi giriniz:");
		@SuppressWarnings("unused")
		double cay=scan.nextDouble();
		System.out.println("ne kadar seker kullanirsiniz:");
		double seker=scan.nextDouble();
		
		double kullanilanSeker= (seker*1.7/100)*365;
		System.out.println("yýlda" +kullanilanSeker+ "kg seker kullaniyor." );
		scan.close();

	}

}
