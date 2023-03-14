package kr.ac.kopo.day06.Homework;

public class Homework01 {

	public static void main(String[] args) {
		
		System.out.println("문제 1");
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%d" , i);
		}
		
		System.out.println();
		System.out.println("문제 2");
		for(int i = 1; i <=100; i+=2) {
			System.out.printf("%d" , i);
		}
		
		System.out.println();
		System.out.println("문제 3");
		for(int i = 2; i <=100; i+=2) {
			System.out.printf("%d" , i);
		}
		
		
		System.out.println();
		System.out.println("문제 4");
		int high = 0, time = 0;
		while(high <= 100) {
			high += 5;
			if(high < 50) {
				high -= 1;
			} else {
				high -= 2;
			}
			time++;
			System.out.printf("[%d시간 후 달팽이가 올라간 총 높이 : %dM\n" , time , high);
		}
		
			
		
		
		
		
	}
	
		
}
