package Book;

public class runner{

	public static void main(String[] args) {
author a=new author("Jue"," jue@email.com","F");
author b=new author("Mg Mg"," mgmg@email.com","M");
author c=new author("Kyaw"," kyaw@email.com","M");

book b1=new book("java",a,4000,3);
book b2=new book("c#",b,6000,10);

book b3=new book("JS",c,6000);

b1.showbook();
b2.showbook();
b3.showbook();



}

}
