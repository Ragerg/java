package kr.ac.kopo.day08.HomeworkMain;

import java.util.Scanner;

public class HomeworkMain08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d\'s score : ", i+1);
			score[i] = sc.nextInt();
		}
		
		
		int errCnt = 0;
		int sum = 0;
		System.out.println("NO\tSCORE\tGRADE");
		for(int i = 0; i < score.length; i++) {
			
			
			if(score[i] >= 0 && score[i] <= 100) {
				sum = sum + score[i];
				
				char grade;
				switch(score[i] / 10) {
				case 10 :
				case 9 :
					grade = 'A'; break;
				case 8 :
					grade = 'B'; break;
				case 7 :
					grade = 'C'; break;
				case 6 :
					grade = 'D'; break;
				default : 
					grade = 'F';
				}
				
			System.out.print(i+1 + "\t" + score[i] + "\t" + grade);
			} else {
				System.out.print(i+1 + "\tError!!");
				++errCnt;
			}
			System.out.println();
		}
		System.out.printf("5회 입력 중[%d]회 에러발생!!\n", errCnt);
		System.out.println("총점 : " + sum + "점" );
		System.out.println("평균 : " + ((double)sum / score.length) + "점");
		
	}

}
