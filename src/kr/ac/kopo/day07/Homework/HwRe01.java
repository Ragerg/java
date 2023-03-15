package kr.ac.kopo.day07.Homework;

import java.util.Scanner;

public class HwRe01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			System.out.print("num " + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("< 짝수 >");
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("< 홀수 >");
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 1) {
				System.out.print(num[i] + " ");
			}
		}
		
			
		
		
		
	}

}
