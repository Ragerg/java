package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework05_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		if(book <0) {
			System.out.println("잘 못 입력했습니다.");
		} else if(book == 0) {
			System.out.println("보유하고 있는 책 없음"); 
		} else if(book == 1) {
			System.out.println(book + " book"); 
		} else {
			System.out.println(book + " books"); 
		}		
		
		sc.close();
		
		
	}
}
