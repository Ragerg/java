package kr.ac.kopo.day07.Homework;

import java.util.Scanner;

public class Homework01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[10];
			for(int i = 0; i < num.length; i++) {
				System.out.print("num" + (i+1) + " : ");
				num[i] = sc.nextInt();
			}
			
			System.out.println("< 짝수 >");
			for(int data : num) {
				if(data % 2 == 0) {
					System.out.print(data + " ");
					
				} 
			}
			
			System.out.println("\n< 홀수 >");
			for(int data : num) {
				if(data % 2 == 1) {
					System.out.print(data + " ");
						
					
				}
				
			
			}
	
		
		
	}

}
