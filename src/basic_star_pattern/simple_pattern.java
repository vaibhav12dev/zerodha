package basic_star_pattern;

public class simple_pattern {

	public static void main(String[] args) {
		int star=1;
		
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=star; j++) {
		         System.out.print("*");		
			}
			System.out.println();
			star=star+1;
		}
	}
	
	
}
