package AbstractShape;

public class Square extends rectangle{
	double side;
	public Square(){
		super();
	}
	public Square(double side){
		this.side=side;
	}
	public Square(double side, String color, boolean filledcolor){
		super();
		this.side=side;
	}
	public void setWidth(double side) {
		this.side = side;
	}
	public void setHeight(double side) {
		this.side = side;
	}
	@Override
	double getArea() {
		return side*side;
	}
	@Override
	double getPerimeter() {
		return 4*side;
	}
	
	
	public void showInfo() {
		System.out.println("Square Info:");
		System.out.println("Side: "+side+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+"\nColor: "+color+"\nFilled: "+filledcolor+"\n");
	}

}
