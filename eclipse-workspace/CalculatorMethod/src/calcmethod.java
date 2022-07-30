/**
 * calculator using method function
 */
//to get input from user
import java.util.Scanner;

//method class
 class method {

//initializing 
	double sum = 0;
	double diff = 0;
	double prod = 0;
	double div = 0;
//methods or activities to perform	
	public double addTwo(double num1, double num2){
	sum = num1 + num2;
	return sum;
	}
	public double diffTwo(double num1, double num2) {
	diff = num1 - num2;
	return diff;
	}
	public double prodTwo(double num1, double num2) {
		prod = num1 * num2;
		return prod;
	}
	public double divTwo(double num1, double num2) {
		div = num1 / num2;
		return div;
	}
}
//main class
class calcmethod {
	public static void main(String[] args) {
		char operator;
//scanner to get user input		
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Enter the first number :");
			double num1 = in.nextDouble();
			
			System.out.println("Enter the operation you want to perform(+,-,*,/) :");
			operator = in.next().charAt(0);
			
			System.out.println("Enter the second number :");
			double num2 = in.nextDouble();
//object syntax
			method add = new method();
			method sub = new method();
			method mul = new method();
			method divi = new method();
			
			switch (operator) {
			case '+':
//calling the method for Add				
				double sum = add.addTwo(num1, num2);
				System.out.println("Sum of two numbers is :" + sum);
				break;
				
			case '-':
//calling the method for Diff			
				double dif = sub.diffTwo(num1, num2);
				System.out.println("Diff of two numbers is :" + dif);
				break;
				
			case '*':
//calling the method for Prod
				double multi = mul.prodTwo(num1, num2);
				System.out.println("Product of two numbers is :" + multi);
				break;
				
			case '/':
//calling the method for Div	
				double division = divi.divTwo(num1, num2);
				System.out.println("Division of two numbers is :" + division);
				break;
			default:
				System.out.println("Wrong operator");
				break;
						
			}
		}
		
	}
	
}