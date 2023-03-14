package kr.ac.kopo.day06.Homework;

public class Hw08 {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("문제 8");
		
		for(int k = 2; k <=9 ; k += 3) {
			System.out.printf("*** %d단 ***\t*** %d단 ***\t*** %d단 ***\n", k++ , k++, k++);
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 4; j++) {
					System.out.print(j + " * " + i + " = " + i * j + "\t");
				}
				System.out.println();
	
			}
		}
		
	
	}
	
	
}
