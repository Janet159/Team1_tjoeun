package Java_Mission_Yoon.ClassRoom._10_Shape;

public class Circle {

	private double radius, PI;
	
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double Area() {
		PI = Math.PI;
		double s = PI*Math.pow(radius, 2);
		
		return s;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + "]";
	}
	
	
	
}
