package list;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Q3 {

	public static void main(String[] args) {
		/*Get a sentence from the user. Accept the sentence received from the user as a parameter,
		 * Kullan�c�dan bir c�mle al�n. Kullan�c�dan gelen c�mleyi parametre olarak kabul edin,
		 *  Invert sentence using Array and write a Method that returns the result as a String to the main method.
		 *  Array kullanarak c�mleyi ters �evirin ve sonucu ana y�nteme Dize olarak d�nd�ren bir Y�ntem yaz�n.

		Note: Upper and lower case letters, spaces and special characters will not be changed.
		B�y�k ve k���k harfler, bo�luklar ve �zel karakterler de�i�tirilmeyecektir.

		Input :

		It is very nice to write code.

		Output :

		.edoc etirw ot ecin yrev si tI*/
		
		
		
		
		String str="It is very nice to write code.";
		
		String[] tersten= str.split("") ;
		
		String ters="";
		for (int i = tersten.length-1; i >= 0; i--) {
			ters+=tersten[i];
		}
		
		System.out.println(ters);
		
		
		
		
		
		
		
		
		

	}

}
