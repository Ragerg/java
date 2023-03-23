package kr.ac.kopo.day13.Homework;

public class Triangle extends Oblong  {
	
	private int height;
	private int width;
	private String name = "삼각형";
	private int area;
	
	public Triangle() {
	}
	
	
	public void triArea() {
		this.width = scan.nextInt("밑변을 입력하세요 : ");
		this.height = scan.nextInt("높이를 입력하세요 : ");
		this.area = this.width * this.height;
		System.out.printf("밑변 %d, 높이 %d 의 %s의 넓이는 %.2f 입니다.", width, height, name, area/2.0);
		
	}

	@Override
	public void areaCal() {
		triArea();
	}
}
