package test.Bank;

public class test {

	public static void main(String[] args) {
		ChildBank cb =new ChildBank(10000);
		
		cb.increase(5000);
		cb.decrease(1000);
		cb.showtotal();

	}

}
