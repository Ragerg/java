package kr.ac.kopo.day11.day10homework;

import java.util.Scanner;

/**
 * 
 * 다양한 상수를 입력받을 수 있는 기능클래스
 * @author User
 *
 */
public class ScannerUtil {
	
//	Scanner sc = new Scanner(System.in);
	
	Scanner sc;
	
	ScannerUtil() { // ScannerUtil을 호출할 때 멤버변수 sc를 초기화
		sc = new Scanner(System.in);
	}
	
	char nextChar(String msg) {
		System.out.print(msg);
//		char ch = sc.nextLine().charAt(0);
//		return ch;
		return sc.nextLine().charAt(0);
	}
	
	int nextInt(String msg) {
		System.out.print(msg);
		return sc.nextInt();
	}
	
	String nextString(String msg) {
		System.out.print(msg);
		return sc.nextLine();

	}
	
	
	
	
	
}
