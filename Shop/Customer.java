package Shop;

public class Customer {
	
		String name;
		boolean member=false;
		 String memberType;			
		 	
	public Customer(String name) {
		this.name=name;
	}
	public Customer(String name,String memberType) {
		super();
		this.name=name;
		this.memberType=memberType;
	
	}
	public String getName() {
		return name;
	}	
	
	public boolean isMember() {
		
		if(memberType=="premium"|| memberType=="gold"||memberType=="silver") {
			member=true;
//			System.out.print("You are " + memberType + "  member");
		}
		
		
//		System.out.print("You are not member");

		return member;
		
		}
	
	
public String getMemberType() {
	
	if (memberType=="premium") {
		memberType="premium";
	}
	else if (memberType=="gold")
	{
		memberType="gold";
		
	}
	else if(memberType=="silver"){
		memberType="silver";
	}
	return memberType;
	
}
	
		
public String toString() {
	

	String str= "Name : " + getName() + "\nmember : " + isMember() + "\nmember type : " + getMemberType();
	return str;
}

}
