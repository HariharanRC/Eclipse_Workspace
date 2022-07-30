import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		
		int arr[] = {23,443,2323,434,43434};
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the number to search: ");
		
		int num = in.nextInt();
		
		for (int i=0;i<=5;i++) {
			if (arr[i]==num) {
				System.out.println("Number found");
				break;  
			}
			System.out.println("Not found");
			break;
		}
	}

}
