package kr.ac.kopo.day12.Homework;

public class Square extends Oblong {

	public Square() {
		this.name = "정사각형";
	}

	public Square(String name, int area, int width) {
		super(name, area, width, width);
		this.width = width;


	}
	
	public void areaCal() {
		super.area = this.width * this.width;
		System.out.printf("가로, 세로 %d 의 %s의 넓이는 %d 입니다.", width , name, area);
	}
	
	
	public void squArea() {
		this.width = scan.nextInt("한 변의 길이를 입력하세요 : ");
		areaCal();
		
	}


}
