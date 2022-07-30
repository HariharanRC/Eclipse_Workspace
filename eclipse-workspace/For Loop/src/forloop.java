
public class forloop {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++)
			System.out.println(i);
		
		System.out.println("array output");
		
		int arr[] = {1,2,3,4,5};
		
		for (int j=0;j<5;j++)
			System.out.println(arr[j]);
		
		System.out.println("Second loop");
		for (int ele : arr)
			System.out.println(ele);
	
		System.out.println("sum of numbers");
		
		int sum=0;
		
		for (int i=1;i<=10;i++)
			
			sum = i + sum;
			
			System.out.println("Sum is: " + sum);
	
	}

}
