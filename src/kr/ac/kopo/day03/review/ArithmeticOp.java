package kr.ac.kopo.day03.review;

public class ArithmeticOp {
	
	static int member;
	
	public static void main(String[] args) {
		
		int int1 = 5, int2 = 28;
		int int3, int4, int5;
		int3 = int2 * int1;
		int4 = int2 / int1;
		int5 = int2 % int1;
		
//		int int3 = int2 * int1, int4 = int2 / int1, int5 = int2 % int1;
		
		System.out.println("28 * 5 =" + int3);
		System.out.println("28 / 5 =" + int4);
		System.out.println("25 % 5 =" + int5);
		System.out.println("++5 =" + int1++);
		System.out.println("5++ =" + ++int1);
		
		
	}

}
