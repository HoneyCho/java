package BalanceTransfer;

public class Account {
	String id;
	String name;
	int balance=0;

	
	public Account(String id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
 public Account (String id,String name,int balance)
 	{
	 this.id=id;
	 this.name=name;
	 this.balance=balance;
	 
 	}
 
 public void Deposit(int amount)
 {
	 balance+=amount;
	 
 }
 public void Withdraw(int amount)
 {
	 if(amount>balance)
	 {
		 System.out.println("Your balance is insufficient");
	 }
	 else
	 {
		 balance-=amount;
	 }
 }
 
public void transfer(Account a1,int transfer_amt)
{
	System.out.println("Transfer from " + name +" to "+a1.name );
	System.out.println("Transfer amount is :" + transfer_amt);
	if(balance<transfer_amt)
	{
		System.out.print("Transfer unsuccessul !");
	}
	else 
	{
		balance-=transfer_amt;
		System.out.println("Transfer successful");
	
		System.out.println("Your balance is " +balance);
		
		
	}

}
public String toString()
{
	String str="\nYour id :" + id +"\nYour name is : " + name + "\nYour balance is " 
+balance+"\n";
	 return str;
}
 
	public static void main(String[] args)
	{
		Account acc1=new Account("acc1","Honey",50000);
		Account acc2 =new Account("acc2","Hsu Hsu",20000);
		
		System.out.println("Account1 Info : " + acc1.toString());
		System.out.println("Account2 Info :  " + acc2.toString());
		acc1.transfer(acc2,10000);

	}

}
