package kr.ac.kopo.day11.Homework;

import java.util.Scanner;

public class StringUtil_day0320 {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 입력받은 문자가 대문자면 true 반환
	 * @return 
	 */
	boolean isUpperChar(char c) {  
		if ('A' <= c && c <= 'Z' ) {
			return true;
		} 
		return false;
	}
	
	/**
	 * 입력받은 문자가 소문자면 true 반환
	 * @return
	 */
	boolean isLowerChar(char c) {
		if('a' <= c && c <= 'z') {
			return true;
		}
		return false;
		
	}
	
	/**
	 * 입력받은 두 숫자 중 큰 숫자를 반환
	 * @return 
	 */
	int max(int i, int j) {
		return i > j ? i : j;	
	}
	
	/**
	 * 입력받은 두 숫자 중 작은 숫자를 반환
	 * @return
	 */
	
	int min(int i, int j) {
		return i < j ? i : j;
	}
	
	/**
	 * 입력받은 문자열의 위치를 거꾸로 반환
	 * @return
	 */
	
	String reverseString(String str) {
		char[] reverse = new char[str.length()];
		int j = 0;
		for(int i = str.length()-1; i >= 0; i--) {
			reverse[j++] = str.charAt(i);
		}
		
		String rvs = new String(reverse);
		return rvs;
		

	}
	
	/**
	 * 입력받은 소문자 문자열을 대문자로 반환
	 * @return
	 */
	
	String toUpperString(String str) {
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
	 * 입력받은 대문자 문자열을 소문자로 반환
	 * @return
	 */
	String toLowerString(String str) {
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
	
	/**
	 * 입력받은 문자열의 크기를 비교하여 반환
	 * @param str
	 * @param str2
	 * @return
	 */
	
	
	int compareTo(String str, String str2) {
		int length = str.length() < str2.length() ? str.length() : str2.length();
		for (int i = 0; i < length; i++) {
			if(str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
		}
		if(str.length() == str2.length()) {
			return 0;
		} else if(str.length() == length) {
			return -str2.charAt(length);
		}
		return str.charAt(length);
	}
	
	/**
	 * 입력받은 문자열에서 검색할 문자열로 끝나는지 반환
	 * @param str 문자열
	 * @param sub 검색할 문자열
	 * @return 
	 */
	boolean endsWith(String str, String sub) {
		String strM = this.reverseString(str), strS = this.reverseString(sub);
		for(int i = 0; i < strS.length(); i++) {
			if (strM.charAt(i) == strS.charAt(i)) {
				return true;
			}
			return false;
		}
		return false;
		
	}
	
	
	
		
		
}
	
	























	
	
	
	
	
	
	
	
