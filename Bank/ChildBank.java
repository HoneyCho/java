package test.Bank;

public class ChildBank extends Bank implements BankFunction{
	public ChildBank(double amt) {
		super(amt);
		System.out.println("the original amount is " + amt);
	}

	@Override
	public void increase(double amt) {
		
		 System.out.println("the increased amount " + amt);
			total+=amt;	
			
	}

	@Override
	public void decrease(double amt) {
		System.out.println("the decreased amount " + amt);
		total-=amt;
		
	}
	public void showtotal() {
		System.out.println("The total amount is " + total);
	}
	
}
