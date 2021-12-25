package arrays;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		//Create a custom return type method accepts a name as parameter and prints the name as a char array.
		//Özel bir dönüþ türü oluþturma yöntemi, bir adý parametre olarak kabul eder ve adý bir karakter dizisi olarak yazdýrýr.
		
		//(do not use toCharArray() method)

		//Input : John

		//Output :[J, o, h, n]
		
		String isim= "john";
		
		String ad[]= isim.split("");
		
		System.out.println(Arrays.toString(ad));
		
		

	}

}
