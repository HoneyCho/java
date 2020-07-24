package test;
public class test2 {
	
int puppyAge;


public test2 (String name){
	System.out.println("pappy name is:" + name);
	
}
public void setAge(int age) {
	puppyAge = age;
	
}

public int getAge () {
	System.out.println("the age is "+ puppyAge);
	return puppyAge;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test2 t2 = new test2("tommy");
t2.setAge(2);
t2.getAge();
System.out.println("my variable is "+ t2.puppyAge);

	}

}
