package kr.ac.kopo.day10.Homework;

public class StringUtilMain {

	public static void main(String[] args) {
		
		StringUtil su = new StringUtil();
		
		boolean c1 = su.isUpperChar();
		System.out.println(c1);
		
		boolean c2 = su.isLowerChar();
		System.out.println(c2);
		
		int i3 = su.max();
		System.out.println("큰 수 : " + i3);
		
		int i4 = su.min();
		System.out.println("작은 수 : " + i4);
		
		String str5 = su.reverseString();
		System.out.println("REVERSE : " + str5);
		
		String str6 = su.toUpperString();
		System.out.println("UPPER : " + str6);
		
		String str7 = su.toLowerString();
		System.out.println("LOWER : " + str7);

		
		
	}
}
