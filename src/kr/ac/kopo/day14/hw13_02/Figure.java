package kr.ac.kopo.day14.hw13_02;

public abstract class Figure implements AreaPrintable {
	
	private double area;
	
	public double getArea() { 
		return this.area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
}
