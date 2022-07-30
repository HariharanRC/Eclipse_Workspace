import java.util.scanner;

public class Demo {
	public static void main(String[] args) {
	
	int a, b, sum; 
    
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
    System.out.println("Type a number:");
    
    a = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    
    b = myObj.nextInt(); // Read user input

	sum = a + b;
    System.out.println("Sum is: " + sum); // Output user input

	}
}