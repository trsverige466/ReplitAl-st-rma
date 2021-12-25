package if_ternary;

import java.util.Scanner;

public class IfSwitchTernaryString2 {

	public static void main(String[] args) {
/*Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J* W**

CCN : ** ** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.*/
		
	Scanner scan=new Scanner(System.in);
	System.out.println("adiniz?:");
	System.out.println("soyasiniz?");
	System.out.println("kredi kart numaraniz?");	
		
	String isim=scan.next();
	String soyisim=scan.next();
	String kk=scan.next();
	
	System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1, 2).replaceAll("\\w", "*")+
			" "+soyisim.substring(0,1).toUpperCase()+soyisim.substring(1, 2).replaceAll("\\w", "*")+"*");
	
	System.out.println("CCN:" +kk.substring(0,12).replaceAll("\\d", "*")+kk.substring(12,16));
	
	scan.close();
	
	
	
	
	
		
		

	}

}
