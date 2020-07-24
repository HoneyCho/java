package AbstractShape;

public abstract class shape {

	
		String color="yellow";
		Boolean filledcolor=true;
	public shape(){
		
	}
	public shape(String color,Boolean filledcolor)
	{
		this.color=color;
		this.filledcolor=filledcolor;
		
	}
	public String getColor(){
		return color;
	
	}
	public void setColor(String color) {
		this.color= "blue";
	}
	public Boolean isFilled(){
		return filledcolor;
	}
	public void setFilledColor(String color, Boolean filledcolor) 
	{
		this.filledcolor = filledcolor;
	}
	abstract double getArea();
	abstract double getPerimeter();
	
	}


