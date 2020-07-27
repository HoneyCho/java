package RactangleTest;

public class RectangleRunner extends Rectangle{

	public static void main(String[] args) {

		Rectangle r1= new Rectangle();
		
		System.out.println("the lenght : " + r1.getLength()+ " \n width : "  + r1.getWidth() + "\nArea "
				+ r1.getArea()+"\n Perimeter  : "  + r1.getPerimeter());
	
		
		Rectangle r2=new Rectangle(0.2f,0.2f);
		System.out.print(r2.toString());
		

}
}