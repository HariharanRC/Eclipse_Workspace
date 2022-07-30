import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.io.*;
public class calculator {

	public static void main(String[] args) {
		char operator;
		double n1, n2, res = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the 1st number: ");
		n1 = in.nextDouble();
		
		System.out.println("Please enter the operator(+,-,*,/) ");
		operator = in.next().charAt(0);
		
		System.out.println("Please enter the 2nd number: ");
		n2 = in.nextDouble();
				
		switch (operator) {
		case '+': 
			res = n1 + n2;
			break;
		case '-':
			res = n1 - n2;
			break;
		case '*':
			res = n1 * n2;
			break;
		case '/':
			res = n1 / n2;
			break;
		default:
			System.out.println("Wrong operator");
			break;
		}
	System.out.println("Final Result: " + res);
	//System.out.println(+ res);
	}

}
