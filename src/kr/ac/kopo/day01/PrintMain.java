package kr.ac.kopo.day01;

/*
 	출력메소드 System.out.출력메소드()
 	print()  :개행문자 비포함
 	println() : 개행문자 포함
 	printf() : 1.5~, 개행문자 비포함
 */

public class PrintMain {

	public static void main(String[] args) {
		
		System.out.println("\u0024\n");
		
		System.out.println(10 + " " + 12.34 + " " + "홍길동");
				
		//10 12.34 홍길동
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");

		System.out.print('홍');
			
		//방법3
		System.out.print("A\n");
		//방법2
		System.out.print('A');
		System.out.print('\n');
		//방법1
		System.out.println('A');
		System.out.println(10);
		System.out.println(12.34);
	
		
	}
}
