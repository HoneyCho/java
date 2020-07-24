package test;
import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=""; 
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input=sc.nextLine();
		sc.close();
		Scanner newsc =  new Scanner(input);
				while (newsc.hasNext()) {
			String word= newsc.next();
			result += Character.toUpperCase(word.charAt(0))+ word.substring(1)+" ";
			

		}
		System.out.println("the string after changing upper case :"+ result.trim());
		newsc.close();
	}

}
