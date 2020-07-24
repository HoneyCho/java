package AbstractShape;

public class circle extends shape{
double radius=1.0;
public circle() {
	super();
}
public  circle (double radius)
{
	this.radius=radius;
}
public circle(double radius,String color,Boolean filledcolor)
{
		super(color,filledcolor);
		this.radius=radius;

}
@Override
double getArea() {
	return radius*3.142*2;
}
@Override
double getPerimeter() {
	return radius*3.142*2;
}

public String getColor() {
	return color;
}
public void showInfo() {
	System.out.println("Circle Info:");
	System.out.println("Radius: "+radius+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+"\nColor: "+ getColor()+"\nFilledColor: "+filledcolor+"\n");
}

	
}
