package arrays;

public class Q7 {

	public static void main(String[] args) {
		// Write a method that accepts an array as parameter and returns
		//sum off all elements in the array Then print the result in the main method.
		//Bir diziyi parametre olarak kabul eden ve dizideki t�m ��elerin toplam�n� d�nd�ren bir y�ntem yaz�n.
		//Ard�ndan sonucu ana y�ntemde yazd�r�n.
			//Eg :

			//input : {1,2,3,4,5,6,7,8};

			//output: 36

		int arr[]= {1,2,3,4,5,6,7,8};
		
		int toplam=0;
		
		for (int i = 0; i <= arr.length-1; i++) {
			
			toplam+=arr[i];
			
		}
		
		System.out.println(toplam);
		
		
		
		
		
		
	}

}
