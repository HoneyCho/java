package PersonInheritance;

public class Student extends Person{
String program;
int year;
double fee;

public Student(String name, String address,String program,int year,double fee) {
	super(name, address);
	this.program=program;
	this.year=year;
	this.fee=fee;
	
	}
public String getProgram() {
	return program;
	
}
public void setProgram(String program) {
	this.program=program;
}
public  int getYear() {
	return year;
}
public void setYear(int year) {
	this.year=year;
}
public double getFee() {
	return  fee;
	
}
public void setFee(double fee) {
	this.fee=fee;
}


public String toString() {
	String studentinfo=super.toString()	+"\nProgram : " + getProgram()+"\n Year :" + getYear()+"\nFee : " + getFee()
	+"\n";

	return studentinfo;
	
}

public static void main(String[] args) {
	Student stu1 = new Student("Honey", "Monywa","Program1", 2020, 30000);
	Student stu2= new Student("Mg Mg", "Monywa"," Program2", 2019, 40000.0);
	System.out.println(stu1);
	System.out.println(stu2);
	
}
	
}

