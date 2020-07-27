package Shop;
import java.time.LocalDate;
import java.util.Date;

public class customer {


	public String name;
	Boolean member=false;
	static String memberType;
	
	public customer(String n,String mtype) {
		this.name=n;
		customer.memberType=mtype;
	}
	
	public Boolean isMember() {
		if(memberType=="Premium"|| memberType=="Gold"||memberType=="Silver") {
			member=true;
//			System.out.print("You are " + memberType+ " member");
		}
		return member;

	}
	
	public String toString() {
		return "Customer Name:\t"+name+"\nMember Type:\t"+memberType;
	}
}

class DiscountRate{
	static double serviceDiscountPremium=0.2;
	static double serviceDiscountGold=0.15;
	static double serviceDiscountSilver=0.1;
	
	static double productDiscountPremium=0.1;
	static double productDiscountGold=0.1;
	static double productDiscountSilver=0.1;
	
	public double getServiceDiscountRate(String type) {
		if(type=="Gold") {
			return serviceDiscountGold;
		}else if(type=="Silver") {
			return serviceDiscountSilver;
		}else if(type=="Premium"){
			return serviceDiscountPremium;
		}else {
			return 0.0;
		}
	}
	
	public double getProductDiscountRate(String type) {
		if(type=="Gold") {
			return productDiscountGold;
		}else if(type=="Silver") {
			return productDiscountSilver;
		}else if(type=="Premium"){
			return productDiscountPremium;
		}else {
			return 0.0;
		}
	}

}




