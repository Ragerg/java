package kr.ac.kopo.day13.Homework;

public class Oblong extends Shapes {
	
	private int height;
	private int width;
	private String name = "직사각형";
	private int area;
	
	public Oblong() {
	}
	
	
	
	public void oblArea() {
		this.width = scan.nextInt("밑변을 입력하세요 : ");
		this.height = scan.nextInt("높이를 입력하세요 : ");
		this.area = this.width * this.height;
		System.out.printf("밑변 %d, 높이 %d 의 %s의 넓이는 %d 입니다.", width, height, name, area);
	}
	
	@Override
	public void areaCal() {
		oblArea();
	}

}
