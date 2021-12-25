package loops;

public class Q5 {

	public static void main(String[] args) {
		// 100'den 0'a kadar çift sayýlarý yazdýrýn, ancak decrement(i--) kullanmayýn.
		// OUTPUT : 100 98 96 94 92 … … … … 2 0
		
		for (int i = 100; i >= 0; i-=2) {
			System.out.print(i + " ");
		}

	}

}
