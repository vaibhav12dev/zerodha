package basic_star_pattern;

public class practise7 {

	/*
	 * 
	 ***
	 *****
	 ***
	 *
	 
	 
	 
	 */
	
	
	public static void main(String[] args) {
		int star=1;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i<3) {
				star=star+2;
			}
			else {
				star=star-2;
			}
		}
	} 
	
	
}
