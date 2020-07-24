package AbstractShape;

public class AbstractShape extends shape{

	public static void main(String[] args) {
		AbstractShape s=new AbstractShape();
		circle c = new circle(10,s.color,s.filledcolor);
		c.showInfo();
		rectangle r = new rectangle(10,5,s.color,s.filledcolor);
		r.showInfo();
		Square sq = new Square(10,s.color,s.filledcolor);
		sq.showInfo();
		
 	}

	@Override
	double getArea() {
		return 0;
	}

	@Override
	double getPerimeter() {
		return 0;
	}

}
