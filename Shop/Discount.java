package Shop;

public class Discount extends Customer{

	double serviceDis_Pre=0.2;
	double serviceDis_Gold= 0.15;
	double serviceDis_Silver = 0.1;
	double productDis_Pre,productDis_Gold,productDis_Silver= 0.1;
	
	public Discount(String name) {
		super(name);
	}

	public double getServiceDis(String memberType) {
		
		super.memberType= memberType;
		if(memberType=="premium") {
			return serviceDis_Pre;
		}else if(memberType=="gold") {
			return serviceDis_Gold;
		}else if(memberType=="silver"){
			return serviceDis_Silver;
		}else {
			return 0.0;
		}
		
		}
	
	
public double getProductDis(String memberType) {
	super.memberType= memberType;
	if(memberType=="premium") {
		return productDis_Pre;
	}else if(memberType=="gold") {
		return productDis_Gold;
	}else if(memberType=="silver"){
		return productDis_Silver;
	}else {
		return 0.0;
	}

}

}
