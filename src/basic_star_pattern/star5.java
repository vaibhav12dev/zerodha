package basic_star_pattern;

public class star5 
{
public static void main(String[] args) {
	
	int star=9;
	int space=0;
	for (int i = 1; i <=9; i++) {
		for (int j = 1; j <=space; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=star; j++) {
			System.out.print("*"); 
		}
		System.out.println(); 
		if (i<5) {
			star=star-2;
			space++;
		}
		else {
			star=star+2;
			space--;
		}
	}
	
}
	
	
	
}
