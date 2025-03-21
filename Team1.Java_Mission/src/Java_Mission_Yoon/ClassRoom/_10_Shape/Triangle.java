package Java_Mission_Yoon.ClassRoom._10_Shape;

public class Triangle {

	// 삼각형 높이, 너비를 알 때 넓이 구하는 메소드
	private int height, width;

	// 기본 생성자
	public Triangle() {
		
	}
	
	// 매개변수 있는 생성자 
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	
	// 넓이 구하는 식
	public double Area() {
		double s = height*width/2;
		
		return s;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Triangle [height=" + height + ", width=" + width + "]";
	} 
	
	
	
	
}
