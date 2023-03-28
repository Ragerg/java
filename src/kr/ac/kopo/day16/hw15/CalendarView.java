package kr.ac.kopo.day16.hw15;

import java.util.Scanner;

public class CalendarView {
	
	private Scanner sc;
	private CalendarUtil util;
	
	public CalendarView() {
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}
	
	public int ScanInt(String msg) {
		
		System.out.print(msg);
		int type = sc.nextInt();
		sc.nextLine();
		
		return type;
	}
	
	public void process() {
		
//		CalendarUtil util = new CalendarUtil();
		
		while(true) {
			int type = ScanInt("항목을 선택하세요(1. 특정년도  2. 특정월  3. 종료) => ");
			int year, month;
			switch (type) {
			case 1 :
//				int year = ScanInt("년도를 입력 : ");
				year = ScanInt("년도를 입력 : ");
				util.showByYear(year);
				break;
			case 2 :
				year = ScanInt("년도를 입력 : ");
				month = ScanInt("월을 입력 : ");
				util.showByMonth(year, month);
				break;
			case 3 :
				System.out.println("달력서비스를 종료합니다");
				System.exit(0); // 소프트웨어 종료, (0) :  정상적으로 종료가 되었다.
			}
		}
	}

	
	
}
