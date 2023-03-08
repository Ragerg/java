package kr.ac.kopo.day01;

/*
 printf : 변환 문자를 이용하여 상수 출력
     %s : 문자
     %d : 10진수 정수
     %f : 실수
     %s : 문자열
     %b : 논리값
 */

public class PrintMain02 {

	public static void main(String[] args) {
		System.out.println(5>3);
		System.out.println(2>3);
		System.out.println(true); 
		System.out.println(false);
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.2f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.3f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.36, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.34+0.05, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.34-0.05, "홍길동");
		System.out.printf("[%d] %.1f %s\n", 10, 12.34, "홍길동");
		System.out.printf("[%d] %.1f %s\n", 1000, 12.34, "홍길동");
		System.out.printf("[%5d] %.1f %s\n", 10, 12.34, "홍길동");
		System.out.printf("[%5d] %.1f %s\n", 1000, 12.34, "홍길동");
		System.out.printf("[%-5d] %.1f %s\n", 10, 12.34, "홍길동");
		System.out.printf("[%-5d] %.1f %s\n", 1000, 12.34, "홍길동");
		System.out.printf("[%5d] %.1f [%-10s]\n", 1000, 12.34, "홍길동");
		System.out.printf("[%05d] %.1f %s\n", 123, 12.34, "홍길동");
		System.out.printf("[%5d] %.1f %s\n", 12345678, 12.34, "홍길동");
		System.out.printf("4 > 2 : %b\n", 4>2);
		
	}
}
