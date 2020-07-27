package Book;

public class book extends author {
String bname;
double price;
int qty=0;
author a1; 

public book(String bname,author a1,double price) {
	super(a1.getName(),a1.getEmail(),a1.getGender());
	 setBname(bname);
		setPrice(price);
			
	 }
public book(String bname,author a1,int price,int qty) {
	 super(a1.getName(),a1.getEmail(),a1.getGender());
	 setBname(bname);
		setPrice(price);
		setQty(qty);

	 }
	
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}

 public void showbook() {
		System.out.println("Book Name : " + getBname() + "\nBook Price : " + getPrice() + "\nAuthor Name : " + getName() + "\nBook QTY : " +getQty());
		System.out.println("\n");
 }

}
