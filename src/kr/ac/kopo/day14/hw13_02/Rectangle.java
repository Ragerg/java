package kr.ac.kopo.day14.hw13_02;

public class Rectangle extends PlainFigure {
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		super(width, height);
		double area = (double)width * height;
		setArea(area);
	}

	@Override
	public void printArea() {
		
		System.out.printf("밑변 %d 높이 %d인 직사형의 넓이 : %f\n", getWidth(), getHeight(), getArea());
	}

}

