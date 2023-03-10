package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 	1 - 3사이의 정수 입력 : 
 	
 	1입력   => ONE
 	2입력   => TWO
 	3입력   => THREE
 	그 외 입력 => ERROR
 */
	

public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		System.out.print("1-3사이의 정수 : ");
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		switch(no) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default : 
			System.out.println("ERROR");
		}
		
		/*
		if(no == 1) {
			System.out.println("ONE");
		} else if(no == 2) {
			System.out.println("TWO");
		} else if(no == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
		sc.close();
	}

}
