package kr.ac.kopo.day07.Homework;

import java.util.Scanner;

public class HwRe02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			num[i] = sc.nextInt();
			for (; num[i] < 0 || 100 <= num[i];) {
				System.out.print("num" + (i+1) + " : ");
				num[i] = sc.nextInt();
			}
		}
		
		
		System.out.println("\n< PRINT >");
		for (int data : num) {
			System.out.print(data + " ");
		}
		
		System.out.println("\n< REVERSE >");
		for (int i = num.length-1; i >= 0; i--) {
			int no1 = num[i] / 10;
			int no2 = num[i] % 10;
			System.out.printf("%d%d " , no2 , no1);
		}
		
		
	}

}
