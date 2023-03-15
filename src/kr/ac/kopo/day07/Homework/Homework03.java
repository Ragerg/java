package kr.ac.kopo.day07.Homework;

import java.util.Scanner;

public class Homework03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] grade = new int[5];
		for (int i = 0; i < grade.length; i++) {
			System.out.print((i+1) + "'s 성적 : ");
			grade[i] = sc.nextInt();
			
		}
		
		char credit = 0;
		int sum = 0;
		int cnt = 0;
				
		System.out.println("\n< PRINT >\n");
		System.out.println("번호\t성적\t학점");
		for (int i = 0; i < grade.length; i++) {
			if(grade[i] < 0 || 100 < grade[i]) {
				System.out.println((i+1) + "\t" + "ERROR!!" );
				cnt++;
			} else {
				if(90 <= grade[i]) {
					credit = 'A';
				} else if(80 <= grade[i]){
					credit = 'B';
				} else if(70 <= grade[i]){
					credit = 'C';
				} else if(60 <= grade[i]){
					credit = 'D';
				} else if(0 <= grade[i]){
					credit = 'F';
				}
				sum += grade[i];
				System.out.println((i+1) + "\t" + grade[i] + "\t" + credit);
			}
		} 
		
		System.out.println(grade.length + "명 입력 중 [" + cnt  + "]회 에러발생");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ((double)sum/(grade.length)));
		
		
	}

}
