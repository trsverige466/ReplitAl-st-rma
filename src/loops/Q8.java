package loops;

public class Q8 {

	public static void main(String[] args) {
		// 'a' ile 'z' aras�ndaki karakterlerin ascii de�erlerini yazd�ran bir Java program� yaz�n.
	
				
				
				for (char i = 'a'; i < 'z'; i++) {
					System.out.print("Ascii value of " + i + " = " + (int)i + "-");
					
				}
				for (char i = 'z'; i <= 'z'; i++) {
					System.out.print("Ascii value of " + i + " = " + (int)i );
					
				}

	}

}
