package if_ternary;

import java.util.Scanner;

public class IfSwitchTernaryString5 {

	public static void main(String[] args) {
/* Bir aydaki gün sayýsýný hesaplayan bir Java programý yazýnýz.

INPUT:

Ay Numarasi:

2

Yil :

2016

OUTPUT :

Subat 2016 29 Gundur.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ay numarasi  giriniz");
		
		int ay=scan.nextInt();
		
		System.out.println("lutfen yil girin");
		int yil=scan.nextInt();
	
		
	
		if (yil%4==0) {
			switch (ay) {
			
			case 1 :
				System.out.println("ocak " + yil + " 31 gun");
				break;
			case 2 :
				System.out.println("subat " + yil + " 29 gun");
				break;
			case 3 :
				System.out.println("mart " + yil + " 31 gun");
				break;
			case 4 :
				System.out.println("nisan " + yil + " 30 gun");
				break;
			case 5 :
				System.out.println("mayis " + yil + " 31 gun");
				break;
			case 6 :
				System.out.println("haziran " + yil + " 30 gun");
				break;
			case 7 :
				System.out.println("temmuz" + yil + " 31 gun");
				break;
			case 8 :
				System.out.println("agustos " + yil + " 30 gun");
				break;
			case 9 :
				System.out.println("aylul " + yil + " 31 gun");
				break;
			case 10 :
				System.out.println("ekim " + yil + " 30 gun");
				break;
			case 11 :
				System.out.println("kasim " + yil + " 31 gun");
				break;
			case 12 :
				System.out.println("aralik " + yil + " 30 gun");
				break;

				default:
					System.out.println("gecersiz ay girdiniz");
							
			}
		}else {
           switch (ay) {
			
			case 1 :
				System.out.println("ocak " + yil + " 31 gun");
				break;
			case 2 :
				System.out.println("subat " + yil + " 28 gun");
				break;
			case 3 :
				System.out.println("mart " + yil + " 31 gun");
				break;
			case 4 :
				System.out.println("nisan " + yil + " 30 gun");
				break;
			case 5 :
				System.out.println("mayis " + yil + " 31 gun");
				break;
			case 6 :
				System.out.println("haziran " + yil + " 30 gun");
				break;
			case 7 :
				System.out.println("temmuz" + yil + " 31 gun");
				break;
			case 8 :
				System.out.println("agustos " + yil + " 30 gun");
				break;
			case 9 :
				System.out.println("aylul " + yil + " 31 gun");
				break;
			case 10 :
				System.out.println("ekim " + yil + " 30 gun");
				break;
			case 11 :
				System.out.println("kasim " + yil + " 31 gun");
				break;
			case 12 :
				System.out.println("aralik " + yil + " 30 gun");
				break;

				default:
					System.out.println("gecersiz ay girdiniz");
							
		}
		}
		
		scan.close();
		

	}

}
