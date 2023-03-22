package kr.ac.kopo.day12.Homework;

public class Oblong extends Square {
	
	int height;
	
	public Oblong() {
		this.name = "직사각형";
	}
	
	public Oblong (String name, int area, int width, int height) {
		super(name, area, width);
		this.height = height;
		
	}
	
	public void areaCal() {
		super.area = this.width * this.height;
		System.out.printf("밑변 %d, 높이 %d 의 %s의 넓이는 %d 입니다.", width, height, name, area);
	}
	
	public void oblArea() {
		this.width = scan.nextInt("밑변을 입력하세요 : ");
		this.height = scan.nextInt("높이를 입력하세요 : ");
		areaCal();
	}
	

}
