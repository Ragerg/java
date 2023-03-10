package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		int r = sc.nextInt();
		
		System.out.print("원의 넓이 : ");
		System.out.printf("%.4f \n" , 3.141592*r*r);
		System.out.print("원의 둘레 : ");
		System.out.printf("%.4f" , 2*3.14159*r);
		
		
		sc.close();
		
		
		
	}

}
