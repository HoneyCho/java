package test;
import java.util.Scanner;

public class employee {
		String name;
		String address;
		
		public String getName(){
				return name;
			}
		public String getAddress(){
		return address;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setAddres(String address)
		{
			this.address=address;
			
		}
		
		
		static Scanner sc=new Scanner(System.in);
		
		public static void main(String[]args)
		{
			employee em=new employee();
			System.out.print("enter name : ");
			String name = sc.nextLine();
			sc.close();
			
			em.setName(name);
			System.out.print("the employee nameis " + em.getName());
			
//			System.out.print("enter address");
			
			
		}
	}


