package kr.ac.kopo.day12.Homework;

public class Circle extends Shapes {
	
	int radius;
	
	
	public Circle() {
		this.name = "원";
	}
	
	public Circle(String name, int area, int radius) {
		super(name, area);
		this.radius = radius;
		
	}
	
	public void areaCal() {
		super.area = this.radius * this.radius;
		System.out.printf("반지름 %d 의 %s의 넓이는 %.2f 입니다.", radius, name, area* Math.PI);
	}
	
	public void cirArea() {
		this.radius = scan.nextInt("반지름의 길이를 입력하세요 : ");
		areaCal();
	}

}
