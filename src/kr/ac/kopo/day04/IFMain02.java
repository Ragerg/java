package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 	보유하고 있는 책권수 입력 : 3
 	3 books
 
  	보유하고 있는 책권수 입력 : 1
  	1 book
  	
  	보유하고 있는 책권수 입력 : 0
  	보유하고 있는 책 없음
 */

public class IFMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 입력 : ");
		int book = sc.nextInt();
		
		if(book <0) {
			System.out.println("음수는 입력할 수 없습니다.");
		} else {
			
			if(book == 0) {
				System.out.println("보유하고 있는 책 없음"); // book이 음수가 아닌 것들 중에서 0인 것
			} else {
				
				if(book == 1) {
					System.out.println(book + " book"); // book이 0이 아닌 것들 중에서 1인 것
				} else {
					System.out.println(book + " books"); // book이 0이 아닌 것들 중에서 1이 아닌 것
					}	
				}
			}
		
		sc.close();
		
		
	}
}
