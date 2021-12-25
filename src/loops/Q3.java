package loops;

public class Q3 {

	public static void main(String[] args) {
		/*Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

		Input :

		String str=“Javaisalsoeasy”

		Output: a s*/
		
		String cumle = "Javaisalsoeasy";
		
				String kova = "";

				for (int i = 0; i < cumle.length(); i++) {
					
					for (int j = i + 1; j < cumle.length(); j++) {
						
						if (cumle.substring(i, i + 1).equals(cumle.substring(j, j + 1))
								
								&& !kova.contains(cumle.substring(i, i + 1))) {
							
							kova += cumle.substring(i, i + 1) + " ";
			}
			}
	
}
		
		System.out.print(kova);

	}

}
