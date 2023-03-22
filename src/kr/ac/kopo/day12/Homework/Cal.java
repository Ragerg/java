package kr.ac.kopo.day12.Homework;

import kr.ac.kopo.day11.hw10.ScannerUtil;

public class Cal {
	
	public void start() {
		
		ScannerUtil scan = new ScannerUtil();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Oblong obl = new Oblong();
		Circle cir = new Circle();
		
		int choice = scan.nextInt("면적을 구할 도형을 선택하세요 : ");
		
		switch (choice) {
		case 1 :
			tri.triArea();
			break;
		case 2 :
			squ.squArea();
			break;
		case 3 :
			obl.oblArea();
			break;
		case 4 :
			cir.cirArea();
			
		}
		
		
		
		
	}

}
