package PersonInheritance;

public class Person {
public  String name;
public  String address;

public Person(String name,String address) {
	
	this.name=name;
	this.address=address;
	
}

public  String getName()
{
	return name;
}
public void setName(String name) {
	this.name=name;
}
public  String getAddress() {
	return address;
	
}
public void setAddress(String address) {
	this.address=address;
	
}
public String toString() {
	String str= "Name :" +getName() +"\nAddress"+ getAddress();
	return str;
	}
//public static void main(String[] args) {
////	Staff st1 = new Staff("Hsu" , "Yangon", "cu monywa", 300000);
////	Staff st2 = new Staff("Kyaw", "Monywa", "UCSY", 500000);
////	
////	st1.StaffInfo();
////	st2.StaffInfo();
//	
//	Student stu1 = new Student("Honeu", "Monywa","Program1", 2020, 30000);
//	Student stu2= new Student("Mg Mg", "Monywa"," Program2", 2019, 40000.0);
//	stu1.StudentInfo();
//	stu2.StudentInfo();
//}


}
