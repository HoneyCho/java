package test;

import java.util.Scanner;

public class exercise4 {
	
	public static void main(String[] args) {
		String result;
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input=sc.nextLine();	
		sc.close();
		System.out.println("The original string is : " +input);
		
		if (input.length()>3)
		{
		result =input.substring(0,3);
		}
		else
		{
			result=input;
		}
System.out.println("the string after adding the first 3 character : "+result+input+result);
		
	
	}

}
