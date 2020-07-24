package AbstractShape;

public class rectangle extends shape{

		double width;
		double height;
		
		public rectangle()
		{
			super();
			
		}
		
	public rectangle(double width,double height) {
		this.width=width;
		this.height=height;
		
	}
	public rectangle(double width,double height,String color,Boolean filledcolor)
	{
		super(color,filledcolor);
		this.width=width;
		this.height=height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
		}
		
	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return (2*width)+(2*height);
	}
	public void showInfo() {
		System.out.println("Rectangle Info:");
		System.out.println("Widht: "+ width+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+"\nColor: "+color+"\nFilledColor: "+filledcolor+"\n");
	}

}
