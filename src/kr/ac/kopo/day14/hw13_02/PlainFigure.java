package kr.ac.kopo.day14.hw13_02;

public abstract class PlainFigure extends Figure {

	private int width;
//	protected int height;
	private int height;
	
	public PlainFigure() {
		
	}

	public PlainFigure(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
//	@Override
//	public void setArea(double area) {
//		super.setArea(area);
//	}
}
