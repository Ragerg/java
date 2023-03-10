package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력 : ");
		int price = sc.nextInt();
		
		System.out.print("지불한 액수를 입력 : ");
		int money = sc.nextInt();
		
		int a = money-price;
		int b = a / 1000;
		int c = (a % 1000) / 500;
		int d = ((a % 1000) % 500) / 100 ;
		int e = (((a % 1000) % 500) % 100) / 50;
		int f = ((((a % 1000) % 500) % 100) % 50) / 10;
		
		if(price > money) {
			System.out.printf("%d원이 부족합니다" , -a);
		} else {
		System.out.printf("거스름돈 : %d 원 \n" , a);
		System.out.printf("1000원 : %d 개 \n" , b);
		System.out.printf(" 500원 : %d 개 \n" , c);
		System.out.printf(" 100원 : %d 개 \n" , d);
		System.out.printf("  50원 : %d 개 \n" , e);
		System.out.printf("  10원 : %d 개 \n" , f);
		}
		
		
		
		
		
		
		sc.close();
	}

}
