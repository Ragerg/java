package kr.ac.kopo.day11.Homwork;

import java.util.Scanner;

/**
 * 
 * 다양한 상수를 입력받을 수 있는 기능클래스
 * @author User
 *
 */
public class ScannerUtil {
	

	Scanner sc;
	
	ScannerUtil() { 
		sc = new Scanner(System.in);
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
