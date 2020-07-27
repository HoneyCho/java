package Shop;

import java.time.LocalDate;

public class ShopTest extends DiscountRate{
	
		customer customer;
		LocalDate date;
		double serviceExp;
		double productExp;
		
		public double getServiceExpense() {
			return serviceExp;
		}

		public void setServiceExpense(double serviceExp) {
			this.serviceExp = serviceExp;
		}

		public double getProductExpense() {
			return productExp;
		}

		public void setProductExpense(double productExp) {
			this.productExp = productExp;
		}
		
		public ShopTest(customer c,LocalDate date,double serviceExpense,double productExpense) {
			super();
			this.customer=c;
			this.date=date;
			this.serviceExp=serviceExpense;
			this.productExp=productExpense;
		}
		
		public double getTotalExpense() {
			if(customer.isMember()) {
				serviceExp=serviceExp-(serviceExp*getServiceDiscountRate(customer.memberType));
				productExp=productExp-(productExp*getProductDiscountRate(customer.memberType));
			}
			return serviceExp+productExp;
		}
		
		public String toString() {
			String str= "Customer Name:"+customer.name+"\nMember Type:"+customer.memberType+"\nDate:"+date+
					"\nTotal Expense withot Discount Rate:\t"+(serviceExp+productExp)+
					"\nDiscount Rate:"+(getServiceDiscountRate(customer.memberType)+getProductDiscountRate(customer.memberType))+
					"\nTotal expense with Discount Rate:\t"+getTotalExpense()+"\n";
			return str;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			customer c1=new customer("Mg Mg","Silver");
			ShopTest s1=new ShopTest(c1, LocalDate.now(), 20000.0, 10000.0);
			System.out.println(s1);
			
			customer c2=new customer("Hoeny", "Gold");
			ShopTest s2=new ShopTest(c2, LocalDate.now(), 53000.0,20000.0);
			System.out.println(s2);
			
			customer c3=new customer("Thura", "Premium");
			ShopTest s3=new ShopTest(c3, LocalDate.now(), 1200.0,32000.0);
			System.out.println(s3);
		}

	}


