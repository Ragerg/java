package kr.ac.kopo.day13.Homework;

import kr.ac.kopo.day11.hw10.ScannerUtil;

public class Cal {
	
	ScannerUtil scan = new ScannerUtil();

	
	public void start() {
		
		
		System.out.println("1. 삼각형  2. 정사각형  3. 직사각형  4. 원");
		int choice = scan.nextInt("면적을 구할 도형을 선택하세요 : ");

		Shapes sha = null;
		
		
		switch (choice) {
		case 1 :
			sha = new Triangle();
			break;
		case 2 :
			sha = new Square();
			break;
		case 3 :
			sha = new Oblong();
			break;
		case 4 :
			sha = new Circle();
			
		}
		
		if (sha != null) {
			sha.areaCal();
			
		}
		
		
		
		
	}

}
