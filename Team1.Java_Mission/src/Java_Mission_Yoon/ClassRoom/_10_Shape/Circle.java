package Java_Mission_Yoon.ClassRoom._10_Shape;

public class Circle {

	private double radius;
	
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double Area() {
		double s = Math.PI*Math.pow(radius, 2);
		
		return s;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}



	
	
	
}
