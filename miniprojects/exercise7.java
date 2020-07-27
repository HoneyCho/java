package miniprojects;

import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
				System.out.print("Enter numbers : ");
		String input = sc.nextLine();
//		int num = Integer.parseInt(input);
		String result ="";
		int count =0;
		for(int i=0;i<input.length();i++)
		{
			 if(count ==2)
			 {
				 result+=","+ input.charAt(i);
				 count=1;
				 
			 }
			 else 
			 {
				 result+=input.charAt(i);
				 count++;
			 }
			 
		}
		
		System.out.print("the result string after adding comma : " + result);
		sc.close();

	}

}
