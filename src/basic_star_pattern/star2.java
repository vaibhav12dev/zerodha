package basic_star_pattern;

public class star2 
{
public static void main(String[] args) {
	
	 int colsize=3;
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <=colsize; j++) {
			System.out.print("*");
		}
		System.out.println();
		colsize--;
	}
	
	
}
}
