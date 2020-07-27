package CircleTest;

public class Circle {
	double radius ;
	String color;
	
	
	public Circle() {
		
		color = "red";
	}

	public Circle(double r)
	{
		radius=r;
		color="red";
	}
	public Circle(double r,String c)
	{
		radius = r;
		color=c;
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	public double getArea() {
		return 2*3.142*radius;
		
	}
	public void setRadius(double r) {
		radius= r;
		
	}
	public void setColor(String c) {
		color=c;
	}
	public String toString() {
		return "Circle radius:" +radius + "\ncirlce color :" + color + " \nCircle area : " + getArea();
		
	}
}





