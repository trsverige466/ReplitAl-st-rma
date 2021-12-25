package loops;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		/*
		 * Girdi olarak bir tamsayý kabul eden ve faktöriyel hesaplayan programi
		 * yazýniz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=65432*1=720
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen faktoriyelinin hesaplanmasi icin bir sayi giriniz");
		int sayi = scan.nextInt();
		
		System.out.print(sayi + "!=");

		int carpim = 1;

		for (int i = 1; i <= sayi; i++) {
			carpim *= i;
			System.out.print(i + "*");
		}
		System.out.println("1=" + carpim);

		scan.close();

	}

}
