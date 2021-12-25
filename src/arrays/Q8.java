package arrays;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		/*Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
			2 tamsayý Diziyi parametre olarak kabul eden ve yeni bir Diziye 2 dizi ekleyen ve yazdýran bir dönüþ yöntemi yazýn.
				Input1={1,2,3,4}

				Input2={5,6}

				Output={1,2,3,4,5,6}*/
		
	int	Input1[]={1,2,3,4};

	int Input2[]={5,6};
	
	
	int birlesikArray[]= birlestir(Input1,Input2);
	Arrays.sort(birlesikArray);
	System.out.println(Arrays.toString(birlesikArray));

}

private static int[] birlestir(int[] Input1, int[] Input2) {
	
	int birlesikArray[] = Arrays.copyOf(Input1, Input1.length+Input2.length);
	
	
	
	for (int i = 0; i < Input2.length; i++) {
		
		birlesikArray[i+Input1.length] = Input2[i];
		
	}
	
	
	return birlesikArray;
	
	
	}

}
