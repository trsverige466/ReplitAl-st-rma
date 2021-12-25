package list;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class Q7 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array
		bir diziden belirli bir elemaný çýkarmak ve kalan elemanlarý yeni bir diziye koymak ve yeni diziyi basmak için bir Java programý yaz
		
		Input :{1,2,3,4,5,6}

		element:6

		Output : [1,2,3,4,5]
		*/

		
		int array[]= {1,2,3,4,5,6};
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>();
		
		for (int s : array) {
			list.add(s);
		}
		
		list.remove(5);
		
		System.out.println(list);
		
		
		
		
		
		
		
		
	}

}
