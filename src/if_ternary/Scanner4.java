package if_ternary;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		/* Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n� sorun. Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.

					1 �eker = 1.7 gr

						�rnek ��kt�:

    			   Y�lda 12.41 kg �eker kullan�yor.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("gunde ne kadar cay ictiginizi giriniz:");
		@SuppressWarnings("unused")
		double cay=scan.nextDouble();
		System.out.println("ne kadar seker kullanirsiniz:");
		double seker=scan.nextDouble();
		
		double kullanilanSeker= (seker*1.7/100)*365;
		System.out.println("y�lda" +kullanilanSeker+ "kg seker kullaniyor." );
		scan.close();

	}

}
