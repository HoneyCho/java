package Shop;

import java.sql.Date;

public class Shop extends Discount {
	Customer c;	
	Date date;
	double serviceExp;
	double productExp;
	static Discount d;
	double totalExp;
	double discount;

	
    public Shop(Customer c,double serviceExp,double productExp,Date date) {
		super(c.getName());
		this.serviceExp=serviceExp;
		this.productExp=productExp;
		this.date=date;
		
	}


	public Shop(Customer c1, Date date) {
      super(c1.getName());
		this.date=date;
}

 public Date getDate() {
		return date;
	}
	public double getServiceExp () {
		return serviceExp;
	}
	
	public void setServiceExp(double serviceExp) {
		 this.serviceExp=serviceExp;
		 
	 }
	
	public double getProductExp() {
		 return productExp;
	 }

	public void setProductExp(double productExp) {
		this.productExp=productExp;
	}
	
	
	
	public double getTotalExp() {
		
		if(c.isMember()) {
		
			
//	    totalExp= serviceExp+productExp;
//	    discount= serviceExp*(d.getServiceDis(c.memberType))+productExp*(d.getProductDis(c.memberType));
//
//		totalExp-=discount;
			
			serviceExp=serviceExp-(serviceExp*getServiceDis(c.memberType));
			productExp=productExp-(productExp*getProductDis(c.memberType));
			totalExp=serviceExp+productExp;
		}
//				
//		
		return totalExp;
		
		
	}
	
	
	public String toString(){
		String str="Date : " + getDate() + " \n Service Exp : " + getServiceExp() 
		+ "\nProduct Exp :  "+ getProductExp() + "Total Exp kkk : "+getTotalExp() ;
		return str;
		}
	
	
	public static void main(String[] args) {
		Customer c1=new Customer("Mg Mg");
		Shop s1=new Shop(c1,3000.0,5000.0,new Date(2020-03-23));
		System.out.print(c1);
		System.out.println(s1);
		
		
		Customer c2=new Customer("Honey","gold");
		Shop s2=new Shop(c2, 20000.0, 15000.0, new Date(2020-02-30));
		System.out.println(c2);
		System.out.println(s2);
		
		Customer c3=new Customer("Kyaw Kyaw","silver");
		Shop s3=new Shop(c3, 2000.0, 30000.0, new Date(2020-03-23));
		System.out.println(c3);
		System.out.println(s3);
		
		
		
	}


}
