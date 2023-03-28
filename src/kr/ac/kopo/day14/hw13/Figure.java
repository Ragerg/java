package kr.ac.kopo.day14.hw13;

public abstract class Figure {
	
	private double area;
	
	public double getArea() {  // 내가 가진 값을 외부에 보여주기 위한 메소드
		return this.area;
	}
	
	public void setArea(double area) { // 외부에서 멤버변수 값을 변경하기 위한 메소드
		this.area = area;
	}
	
	public abstract void printArea();
	
	
	
}
