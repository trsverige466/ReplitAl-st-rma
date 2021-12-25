package arrays;

public class Q5 {

	public static void main(String[] args) {
		
		//Write a java program that calculates the average value of array elements

		//input[]= {1,2,3,4,5,6,7}

		//Output : 4	
		
		int arr[]={1,2,3,4,5,6,7};
		
		int ort=0; 
		
		int sayac=0;
		
		for (int i = 0; i <= arr.length-1; i++) {
			ort+=arr[i];
			sayac++;
		}
		System.out.println(ort/sayac);
	}

}
