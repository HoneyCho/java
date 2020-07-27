package RactangleTest;

public class Rectangle{
	
	float length;
	float width;
	public Rectangle()
	{
		length=(float) 1.0;
		width=1.0f;
	}
	
	public Rectangle(float length,float width)
{
		this.length=(float)length;
		this.width=(float)width;
}
	public float getLength() {
		return length;
	}
	public float getWidth() {
		return width;
		
	}
	public void setLength(float length) {
		this.length=(float)length;
		
	}
	
	public void setWidth(float width)
	{	
		this.width=(float)width;
	}
	
	public float getArea() {
		return length*width;
	}
	public float getPerimeter()
	{		
		return 2*length+2*width;
	}
	public String toString()
	{
		String str="The lenght is : " + length+ "\nthe width is :  " + width + 
				"\nthe area is : " + getArea() + "\nthe parameter is  : " + getPerimeter() ;
		return str;
		
	}
	
}

	
