package kr.ac.kopo.day14.hw13;

public class HomeworkMain {
	
	public static void main(String[] args) {
		
		FigureView view = new FigureView();
		view.print(new Triangle(3,4));
		
		Figure f = new Circle(10);
//		Circle c = new Circle(10);
		f.printArea();
		
		Triangle t = new Triangle(2, 3);
		t.printArea();
		
		Rectangle r = new Rectangle(2, 3);
		r.printArea();
		
		Square s = new Square(3);
		s.printArea();
		
		
	}

}
