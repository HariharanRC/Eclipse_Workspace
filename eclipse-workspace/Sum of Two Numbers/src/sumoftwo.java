import java.util.Scanner;
public class sumoftwo {

	public static void main(String[] args) {
		
		long n1, n2, sum, diff, mul, div;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter 1st number ");		
		n1 = in.nextLong();
		
		System.out.print("Enter 2nd number ");
		n2 = in.nextLong();
		
		sum = n1 + n2;
		diff = n1 - n2;
		mul = n1 * n2;
		div = n1 / n2;
		
		System.out.println("Sum of two number is " + sum);
		System.out.println("Diff of two number is " + diff);
		System.out.println("Product of two number is " + mul);
		System.out.println("Division of two number is " + div);
		
		
	}

}