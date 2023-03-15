package kr.ac.kopo.day07.Homework;

import java.util.Scanner;

public class StarExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("7번 문제");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num+1-i; j++) {
				 System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("9번 문제");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num-i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("11번 문제");
		for (int i = 1; i < (2*num); i++) {
			if(i <= num) {
				for (int j = 1; j <= num-i+1; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = 1; j <= i-num+1; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		System.out.println("13번 문제");
		for (int i = 1; i < (2*num); i++) {
			if(i <= num) {
				for (int j = 1; j <= num-i; j++) {
					System.out.print(' ');
				}
				for (int j = 1; j <= i; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = 1; j <= i-num; j++) {
					System.out.print(' ');
				}
				for (int j = 1; j <= 2*num-i; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		System.out.println("15번 문제");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= 2*(num+1-i)-1; j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		
		System.out.println("17번");
		int star = 1;
		if(num % 2 == 0) {
			num++;
		}
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(j <= star  || num+1-j <= star) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			
			System.out.println();
			if(i < num/2 +1) {
				star++;
			} else {
				star--;
			}
		}
		

	}
}
