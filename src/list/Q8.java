package list;

public class Q8 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		/*Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder 
		and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

			Input : I love Java.

			Output: Reversed sentence : avaJ evol I. It is not a palindrome"   */

		String str1= "I love Java.";
		StringBuilder str = new StringBuilder(str1);
		
		str.reverse();
		System.out.println(str);
		
		if (str.equals(str1.toString())) {
			System.out.println("palindrome ' dir ");
		}else {
			System.out.println("avaJ evol I. It is not a palindrome ");
		}
		
		
	}

}
