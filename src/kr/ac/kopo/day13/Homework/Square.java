package kr.ac.kopo.day13.Homework;

public class Square extends Oblong {
	
	private int width;
	private String name = "정사각형";
	private int area;

	public Square() {
	}

	
	public void squArea() {
		this.width = scan.nextInt("한 변의 길이를 입력하세요 : ");
		this.area = this.width * this.width;
		System.out.printf("가로, 세로 %d 의 %s의 넓이는 %d 입니다.", width , name, area);
		
	}

	@Override
	public void areaCal() {
		squArea();
	}

}
