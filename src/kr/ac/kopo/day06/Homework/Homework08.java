package kr.ac.kopo.day06.Homework;

public class Homework08 {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("문제 8");
		
	
			for (int i = 2; i <= 9; i+=3) {
				for (int j = 1; j <= 9 ; j++) {
					for(int k = i; k <= i+2; k++) {
						if (k != 10) {
							System.out.print(k + " * " + j + " = " + k * j + "\t");
						} 
					}
					System.out.println();
				}
				System.out.println();
	
			}
			
		
		
	
	}
	
	
}
