package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Q1 {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string.
		(Ignore case sensitivity)
		Kullan�c�dan girdi olarak bir Dize almak i�in bir Java program� yaz�n ve bu dizede olu�an maksimum karakteri bulun.
		
		input : Learning java is easy

		output: maximum occurring character is : a  */
		
		
		
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen bir c�mle giriniz");
        String str = scan.nextLine().toLowerCase();
        int sayac = 0;
        int max = 0;
        String con = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1)) && !con.equals(str.substring(i, i + 1))) {
                    sayac++;
                }
            }
            if (sayac > max) {
                max = sayac;
                con = "C�mlede en �ok tekrarlayan ifade : " + str.substring(i, i + 1);
            }
            sayac = 0;
        }
        System.out.println(con);
		
		

	}

}
