package kr.ac.kopo.day13.Homework;

public class Circle extends Shapes {
	
	private int radius;
	private String name = "원";
	private int area;
	
	public Circle() {
	}
	
	
	public void cirArea() {
		this.radius = scan.nextInt("반지름의 길이를 입력하세요 : ");
		this.area = this.radius * this.radius;
		System.out.printf("반지름 %d 의 %s의 넓이는 %.2f 입니다.", radius, name, area* Math.PI);
	}

	@Override
	public void areaCal() {
		cirArea();
	}
	
}
