package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework05_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		switch(book) {
		case 0 :
			System.out.println("보유하고 있는 책 없음");
			break;
		case 1 :
			System.out.println("1 book");
			break;
		default : 
			System.out.println(book < 0 ? "잘 못 입력했습니다" : book + " books");
		}		
		
		sc.close();
		
		
	}
}
