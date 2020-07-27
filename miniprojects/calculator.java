package miniprojects;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input="";
		do {
			System.out.println("Enter first number: ");
			int num1=sc.nextInt();
			
			System.out.print("Enter second number: ");
			int num2=sc.nextInt();
			
			System.out.print("Enter a operator(+,-,*,%): ");
			String op=sc.next();
			
			switch(op) {
			case "+": System.out.println(num1+"+"+num2+"="+(num1+num2));break;
			case "-": System.out.println(num1+"-"+num2+"= "+(num1-num2));break;
			case "*": System.out.println(num1+"*"+num2+"="+(num1*num2));break;
			case "/": System.out.println(num1+"/"+num2+"="+(num1/num2));break;
			default: System.out.println("Your input is invalid!");
			}
			
			System.out.print("Continue? [y/n]: ");
	        input = sc.next();

    	}
		
		while(input!= "n");  
		sc.close();
		
	}

	}


