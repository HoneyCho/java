package CircleTest;

public class Runner extends Circle{
	
	public static void main(String[] args) {
		Circle cir1 = new Circle();
		System.out.println("the radius of circle is " + cir1.getRadius() );
		System.out.println("the area of circle is " + cir1.getArea());
		System.out.println("the color of circle is  " + cir1.getColor());
		System.out.println("\n");

		Circle cir2=new Circle(0.2) ;
		System.out.println("the radius of circle is " + cir2.getRadius() );
		System.out.println("the area of circle is " + cir2.getArea());
		System.out.println("the color of circle is  " + cir2.getColor());
		System.out.println("\n");

		
		Circle cir3=new Circle(0.3,"yellow");
		System.out.println("the radius of circle is " + cir3.getRadius() );
		System.out.println("the area of circle is " + cir3.getArea());
		System.out.println("the color of circle is  " + cir3.getColor());
		System.out.println("\n");

		
		Circle cir4=new Circle();
		cir4.setRadius(0.5);
		cir4.setColor("pink");
		System.out.println("the radius of circle is " + cir4.getRadius() );
		System.out.println("the area of circle is " + cir4.getArea());
		System.out.println("the color of circle is  " + cir4.getColor());
		System.out.println("\n");

		Circle cir5= new Circle(0.6,"purple");
		System.out.print(cir5.toString());
	

		

	}

}
