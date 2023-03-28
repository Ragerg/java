package kr.ac.kopo.day15.Homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWorkCalendar {

	Calendar c = Calendar.getInstance();
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH) + 1;
	int date = c.get(Calendar.DATE);
	int day = c.get(Calendar.DAY_OF_WEEK);
	String[] dayArr = { "", "일", "월", "화", "수", "목", "금", "토" };

	void coiceCalendar() {
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 항목을 선택하세요(1. 특정년도  2. 특정월  3. 종료)");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("년도를 선택하세요 : ");
			year = sc.nextInt();
			printAll();
			break;
		case 2:
			System.out.println("년도를 입력하세요 : ");
			year = sc.nextInt();
			System.out.println("월을 입력하세요 : ");
			month = sc.nextInt();
			break;
		case 3:
			break;

		}

	}
	
	void printAll() {
		for(int i = 0; i <= 11; i++) {
			month = i;
			for(int j = 1; j <= c.getActualMaximum(Calendar.DATE); j++) {
				date = j;
				c.set(this.year, month, date);
				System.out.print(date);
			}
		}

	}

}
