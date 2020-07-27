package PersonInheritance;

public class Staff extends Person {
String  school;
double pay;

public Staff(String name,String address,String school,double pay)
{
	super(name,address);
	this.school=school;
	this.pay=pay;
			
}
public String getSchool() {
	return school;
	
}
public void setSchool(String school) {
	this.school=school;
}
public double getPay() {
	return pay;
}
public void setPay(double pay) {
	this.pay=pay;
}

public String toString() {
	String staffInfo = super.toString()+ "\nStaff School  :" + getSchool()+ "\nStaff Pay  : "  + getPay()+"\n";
	
	return staffInfo;
	
}
public static void main(String[] args) {
	Staff st1 = new Staff("Hsu" , "Yangon", "cu monywa", 300000);
	Staff st2 = new Staff("Kyaw", "Monywa", "UCSY", 500000);
	
	System.out.println(st1);
	System.out.println(st2);
}
	

}
