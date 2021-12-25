package list;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Q3 {

	public static void main(String[] args) {
		/*Get a sentence from the user. Accept the sentence received from the user as a parameter,
		 * Kullanıcıdan bir cümle alın. Kullanıcıdan gelen cümleyi parametre olarak kabul edin,
		 *  Invert sentence using Array and write a Method that returns the result as a String to the main method.
		 *  Array kullanarak cümleyi ters çevirin ve sonucu ana yönteme Dize olarak döndüren bir Yöntem yazın.

		Note: Upper and lower case letters, spaces and special characters will not be changed.
		Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.

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
