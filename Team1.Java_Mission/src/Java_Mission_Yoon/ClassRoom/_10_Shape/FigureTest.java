package Java_Mission_Yoon.ClassRoom._10_Shape;

public class FigureTest {
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		Rectangle ractangle = new Rectangle(10, 20);
		Circle circle = new Circle(5);
		Trapezoid trapezoid = new Trapezoid(5, 10, 8);
		
		System.out.println("삼각형의 넓이 : " + triangle.Area());
		System.out.println("사각형의 넓이 : " + ractangle.Area());
		System.out.println("원형의 넓이 : " + circle.Area());
		System.out.println("사다리꼴의 넓이 : " + trapezoid.Area());
	}
}
