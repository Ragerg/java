package kr.ac.kopo.day06;

public class Exam {
	public static void main(String[] args) {
		

		System.out.println("14번");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("15번");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= 9-(2*i-2); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("16번");
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print(' ');
				}
				for(int j = 1; j <= 11-2*i; j++) {
					System.out.print('*');
				}
			} else {
				for(int j =1; j <= 9-i; j++) {
					System.out.print(' ');
				}
				for(int j = 1; j <= 2*i-9; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		
		System.out.println("17번");
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= star  || 10-j <= star) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			
			System.out.println();
			if(i < 5) {
				star++;
			} else {
				star--;
			}
		}
		
	}
}
