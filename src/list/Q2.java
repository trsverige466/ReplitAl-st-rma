package list;

import java.util.Arrays;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		
	/*	Create a 10-element list. Swap the 8th element with the 3rd element.

		INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		Output:

		[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]	*/
		
		
		String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		List<String> listNew= Arrays.asList(names);
		
	
		listNew.set(2,"Furkan");
		listNew.set(7,"Kemal");
		
		System.out.println("[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]");
		
		
		
		
	
		

		
	}

}
