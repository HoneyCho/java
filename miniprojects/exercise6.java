package miniprojects;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		String number=sc.nextLine();
		int fact=1;
		int num = Integer.parseInt( number ); 
		for (int i=1; i<=num ; i++)
		{
			
			fact=fact*i;
			
			
		}
		
		System.out.println(	"the result is : " + fact);
		sc.close();
	}

}
