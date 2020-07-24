package test;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();	
		System.out.println("the original string is : " +str);
		String result= str.charAt(str.length()- 1) + str.substring(1, str.length() - 1) + str.charAt(0);
		System.out.print("the result string after exchange first and last character: " + result);
		sc.close();
		
		
	}

}
