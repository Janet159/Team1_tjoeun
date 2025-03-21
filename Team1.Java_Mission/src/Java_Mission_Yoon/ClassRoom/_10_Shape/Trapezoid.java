package Java_Mission_Yoon.ClassRoom._10_Shape;

public class Trapezoid {

	private int N1, N2, height;
	
	public Trapezoid() {
		
	}

	public Trapezoid(int n1, int n2, int height) {
		N1 = n1;
		N2 = n2;
		this.height = height;
	}
	
	public double Area() {
		double s = (N1+N2)/height;
		
		return s;
	}

	public int getN1() {
		return N1;
	}

	public void setN1(int n1) {
		N1 = n1;
	}

	public int getN2() {
		return N2;
	}

	public void setN2(int n2) {
		N2 = n2;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trapezoid [N1=" + N1 + ", N2=" + N2 + ", height=" + height + "]";
	}
	
	
	
	
	
}
