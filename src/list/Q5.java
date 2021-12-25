package list;

import java.util.ArrayList;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		/*Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers
		 *  if they are even or not in a return method.
		 *  Girdi olarak bir tamsayý kabul eden ve girdiden büyük ilk 10 asal sayýyý ekrana yazdýran bir program yazýnýz.

				Input : 5

				Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]*/

		int sayi=5;     
		List<Integer> kova=new ArrayList<>();
		for (int i = 2; i < 100; i++) {
		    int kontrol=0;
		    for (int j = 2; j < i; j++) {
		        if (i%j==0) {
		            kontrol++;
		        }
		    }
		if (kontrol==0 && i>sayi) {
		    kova.add(i);
		    if (kova.size()==10) {
		        System.out.println(kova);// 7
		    }
		
		
		
	}
		
}
	}}
