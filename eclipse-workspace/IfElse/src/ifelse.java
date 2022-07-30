import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter age: ");
		int age = in.nextInt();
		if(age < 18) {
			System.out.println("Get out");
		}
		else {
			System.out.println("Get in");
		}
		
	}
	
}
