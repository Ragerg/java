package kr.ac.kopo.day08.Homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		Student stu5 = new Student();

		Student[] stuArr = {stu1, stu2, stu3, stu4, stu5};
		for(int i = 0; i < stuArr.length; i++) {
			System.out.print((i+1) + "'s 성적 : ");
			stuArr[i].score = sc.nextInt();
		}
		
		
		
		int sum = 0;
		int cnt = 0;
				
		System.out.println("\n< PRINT >\n");
		System.out.println("번호\t성적\t학점");
		for (int i = 0; i < stuArr.length; i++) {
			if(stuArr[i].score < 0 || 100 < stuArr[i].score) {
				System.out.println((i+1) + "\t" + "ERROR!!" );
				cnt++;
			} else {
				if(90 <= stuArr[i].score) {
					stuArr[i].grade = 'A';
				} else if(80 <= stuArr[i].score){
					stuArr[i].grade = 'B';
				} else if(70 <= stuArr[i].score){
					stuArr[i].grade = 'C';
				} else if(60 <= stuArr[i].score){
					stuArr[i].grade = 'D';
				} else if(0 <= stuArr[i].score){
					stuArr[i].grade = 'F';
				}
				sum += stuArr[i].score;
				System.out.println((stuArr[i].num) + "\t" + stuArr[i].score + "\t" + stuArr[i].grade);
			}
		} 
		
		System.out.println(stuArr.length + "명 입력 중 [" + cnt  + "]회 에러발생");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ((double)sum/(stuArr.length)));
		
	
		

	}

}
