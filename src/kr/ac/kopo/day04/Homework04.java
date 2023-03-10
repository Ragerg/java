package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int no1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int no2 = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int no3 = sc.nextInt();
		System.out.print("네 번째 정수 : ");
		int no4 = sc.nextInt();
		
		if(no1 > no2 && no1 > no3 && no1 > no4) {
			System.out.println(no1);
		} else if(no2 > no1 && no2 > no3 && no2 > no4) {
			System.out.println(no2);
		} else if(no3 > no1 && no3 > no2 && no3 > no4) {
			System.out.println(no3);
		} else {
			System.out.println(no4);
		}
		
		sc.close();
	}

}
