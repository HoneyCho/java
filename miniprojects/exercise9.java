package miniprojects;
import java.util.Arrays;
import java.util.Scanner;
public class exercise9 {

	public static void main(String[] args) {
		
		int sum=0;
		int []arr;
		int avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many integers you want to enter: ");
		int num = sc.nextInt();
		
		arr = new int[num];
		
		for (int i=0;i<num;i++) 
		{
			System.out.print("Enter number : ");
			 if(sc.hasNextInt()) {
				 
	               arr[i]=sc.nextInt();
	               
	               sum+=arr[i];
	            }    
			
			 
			 
		}
		
		avg =sum/num;
		 Arrays.sort(arr);
		 System.out.println("The array you entered : " +Arrays.toString(arr));
		System.out.println("The average number is : "+ avg);
		System.out.println("The two minimum number is " + arr [0]+ "," +arr[1]);
		System.out.println("The two maximum number is " + arr [arr.length-2]+ "," +arr[arr.length-1]);
		 sc.close();
		
		
		
	}

}
