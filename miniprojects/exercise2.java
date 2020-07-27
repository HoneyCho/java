package miniprojects;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();	
		System.out.println("the original string is : " +str);
		System.out.print("Enter the position you want to delete :");
		String ind=sc.nextLine();
		int index = Integer.parseInt( ind );  
		char ch = str.charAt(index-1);
		System.out.println(ch);
		String result = str.substring(0,index-1)+str.substring(index,str.length());
		System.out.println(result);
		sc.close();
		
	}
	
}
