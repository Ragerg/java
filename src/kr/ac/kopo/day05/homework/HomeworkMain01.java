package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int min = num, max = num2;
		if(num > num2) {
			min = num2;
			max = num;
		}
		
		if(num < min) {
			System.out.println(num3 + " < " + min + "<" + max);
		} else if (num3 < max) {
			System.out.println(min + " < " + num3 + "<" + max);
		} else {
			System.out.println(min + " < " + max + "<" + num3);
	    }
		

			/*
			if( num < num2 && num2 < num3) {
				
			} else if(num < num3 && num3 < num2) {
				
			} else if(num2 < num && num < num3) {
				
			} else if(num2 < num3 && num3 < num) {
				
			} else if(num3 < num && num < num2) {
				
			} else { // num3 < num2 && num2 < num
		
			}
			*/
	
		sc.close();
		}
	}

