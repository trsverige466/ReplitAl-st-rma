package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class Q4 {

	public static void main(String[] args) {
		
		/*Write a program that deletes the letters 'a' from the names in the list given as input.
		  Girdi olarak verilen listedeki isimlerden 'a' harflerini silen bir program yazýnýz.
		  
	     INPUT : 
	     list1={"Ali","Veli","Ayse","Fatma","Omer"}

	     OUTPUT : 
	     
	     [Veli,Omer]	*/
		
		
		List<String> str= new ArrayList<>();
		
		str.add("Ali");
		str.add("Veli");
		str.add("Ayse");
		str.add("Fatma");
		str.add("Omer");
		
		
		
		String silinecekharf="A";
		
		
		str = killThemAll(str, silinecekharf);
		
			
		System.out.println(str);	
				
		
	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		for (int i = 0; i < str.size(); i++) {
			
			if (str.get(i).toUpperCase().contains(silinecekharf) ) {
				
				str.remove(i);
				i--;
			}
		}
		return str;
	}
	

	
}

