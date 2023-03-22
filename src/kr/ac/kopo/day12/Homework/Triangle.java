package kr.ac.kopo.day12.Homework;

public class Triangle extends Oblong  {
	
	public Triangle() {
		this.name = "삼각형";
	}
	
	public Triangle (String name, int area, int width, int height) {
		super(name, area, width, height);
	}
	
	public void areaCal() {
		super.area = this.width * this.height;
		System.out.printf("밑변 %d, 높이 %d 의 %s의 넓이는 %.2f 입니다.", width, height, name, area/2.0);
	}
	
	
	public void triArea() {
		super.width = scan.nextInt("밑변을 입력하세요 : ");
		super.height = scan.nextInt("높이를 입력하세요 : ");
		areaCal();
		
	}

}
