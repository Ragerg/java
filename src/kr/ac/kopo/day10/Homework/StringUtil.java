package kr.ac.kopo.day10.Homework;

import java.util.Scanner;

public class StringUtil {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 키보드로 입력받은 문자가 대문자면 true 반환
	 * @return 
	 */
	boolean isUpperChar() {  
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		if ('A' <= ch && ch <= 'Z' ) {
			return true;
		} 
		return false;
	}
	
	/**
	 * 키보드로 입력받은 문자가 소문자면 true 반환
	 * @return
	 */
	boolean isLowerChar() {
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		if('a' <= ch && ch <= 'z') {
			return true;
		}
		return false;
		
	}
	
	/**
	 * 키보드로 입력받은 두 숫자 중 큰 숫자를 반환
	 * @return 
	 */
	int max() {
		System.out.print("비교할 두 개의 숫자를 입력하세요 : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		if(i < j) {
			return j;
		}
		return i;
	}
	
	/**
	 * 키보드로 입력받은 두 숫자 중 작은 숫자를 반환
	 * @return
	 */
	
	int min() {
		System.out.print("비교할 두 개의 숫자를 입력하세요 : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		if(i > j) {
			return j;
		}
		return i;
	}
	
	/**
	 * 
	 * 키보드로 입력받은 문자열의 위치를 거꾸로 반환
	 * @return
	 */
	String reverseString() {
		System.out.print("변경할 문자열을 입력하세요 : ");
		sc.nextLine();
		String str = new String(sc.nextLine());
		char[] reverse = new char[str.length()];
		int j = 0;
		for(int i = str.length()-1; i >= 0; i--) {
			str.getChars(i, i+1, reverse, j++);
		}
		
		String rvs = new String(reverse);
		return rvs;
		

	}
	
	/**
	 * 
	 * 키보드로 입력받은 소문자 문자열을 대문자로 반환
	 * @return
	 */
	String toUpperString() {
		System.out.print("변경할 문자열을 입력하세요 : ");
		String str = new String(sc.nextLine());
		char[] big = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97) {
			big[i] = (char) (str.charAt(i) - 32);
			} else {
				big[i] = str.charAt(i);
			}
		}
		
		String b = new String(big);
		return b;
	}
	
	/**
	 * 
	 * 키보드로 입력받은 대문자 문자열을 소문자로 반환
	 * @return
	 */
	String toLowerString() {
		System.out.print("변경할 문자열을 입력하세요 : ");
		String str = new String(sc.nextLine());
		char[] small = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(65 <= str.charAt(i) && str.charAt(i) < 97) {
			small[i] = (char) (str.charAt(i) + 32);
			} else {
				small[i] = str.charAt(i);
			}
		}
		
		String s = new String(small);
		return s;
	}
	

		
		
}
	
	
	
	
	
	
	
	
	
	
