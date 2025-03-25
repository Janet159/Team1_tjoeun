package Java_Mission_Yoon.ClassRoom._10_Shape;

public class Trapezoid {

	private int top, bottom, height;

	public Trapezoid() {
	}

	public Trapezoid(int top, int bottom, int height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}
	
	public double getArea() {
		double s = (top + bottom)*height/2;
		return s;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
