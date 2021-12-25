package if_ternary;

import java.util.Scanner;

public class IfSwitchTernaryString1 {

	public static void main(String[] args) {
		/* Kullanýcýya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazýn (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altýndaysa zayýfsýnýz

BMI 18,5 ile 25 arasýnda ise kilonuz idealdir

BMI 25-30 arasýndaysa þiþmansýnýz

BMI 30'dan büyük veya eþitse, obez

Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.*/

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kilo ve boyunuzu giriniz:");
		double kilo=scan.nextDouble();
		double boy=scan.nextDouble();
		
		double index= kilo/boy*boy;
		
		System.out.println("index:" +index);
		
		if (index<18.5) {
			System.out.println("zayifsiniz");
			
		}
		if (18.5<index && index<25) {
			System.out.println("ideal kilodasin");
		}
		if (25<index && index<30) {
			System.out.println("sismansin bro az ye");
		}
		if (index>=30) {
			System.out.println("obezsin haci olcen");
		}
		
		
		scan.close();
		
		
		
	}

}
