package list;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Q6 {

	public static void main(String[] args) {
		/*Write a program to find the common elements between two String Arrays (without case sensitivity)
			�ki String Dizisi aras�ndaki ortak ��eleri bulan bir program yaz�n (b�y�k/k���k harf duyarl�l��� olmadan)
			
		Input1 : {John,Brad,Ange,Sofia,Emily}

		Input2 : {sofia,brad,grace,emily,hazel}

		Output : [sofia,brad,emily]*/
		
		String str3[]= {"John","Brad","Ange","Sofia","Emily"};
	    String str4[]= {"sofia","brad","grace","emily","hazel"};
	    
	    
	    for (String each1 : str3) {
	    for (String each2 : str4) {
	        if (each1.equalsIgnoreCase(each2)) {
	            
	            System.out.print(each1+"");
	        }
	        
	    
	    
	    
		
	}
	    }
	    
	}}			
		
