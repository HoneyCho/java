
package test;
import java.util.*;  
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=input.nextLine();
		String last = str.substring(str.length()-1);
		System.out.println("the last string is : " + last);
		String result = last + str +last;
		System.out.println("the result is  : "+ result);
		input.close();
	}

}
