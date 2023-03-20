package kr.ac.kopo.day10;

import java.util.Scanner;

/**
 * 연습용 간단한 메소드들을 모아놓은 클래스
 * @author User
 * @version
 * 
 *
 */

public class MethodExam {
	
	/**
	 * 호출자메소드에서 받아온 두개의 정수 사이의 총합을 반환하는 메소드
	 * @param num1 총합의 시작값    //@ <컴퓨터가 해석할 수 있는 주석
	 * @param num2 총합의 종료값
	 * @return num1~num2 사이의 총합
	 */
	

	
	public int getTotal(int num1, int num2) {
		
		int total = 0;
		for(int i = num1; i <= num2; i++){
			total += i;
		}
		return total;
		
	}
	
	
	/**
	 * 키보드로 단을 입력받아 반환
	 * @return 입력받은 단
	 */
	
	public int getDan() {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		return dan;
		
	}
	
	
	/**
	 * 
	 * 단을 이용하여 구구단을 출력
	 * @param dan 출력할 단
	 */
	public void printGugudan(int dan) { 
		System.out.println("***" + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	
	/**
	 * 2단부터 9단까지 전체 구구단을 출력
	 */
	
	public void printGugudan() {
		
		printGugudan(2, 9);
		
//		for (int dan = 2; dan <= 9; dan++) {
//			/*this.*/printGugudan(dan);  //내 클래스에 있는 다른 메소드를 출력하는 경우 경로 this. 은 생략가능
//		}
		
		/*
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("***" + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
			System.out.println();
		}
		*/
	}
	
	/**
	 * 시작단 ~ 종료단 구구단 출력
	 * @param startDan 시작단
	 * @param endDan   종료단
	 */
	
	public void printGugudan(int starDan, int endDan) {
		for (int dan = starDan; dan <= endDan; dan++) {
			printGugudan(dan);
		}
	}
	
	
}
