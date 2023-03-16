package kr.ac.kopo.day08.HomeworkMain;

public class HomeworkMain05 {
	
	public static void main(String[] args) {
		
		
		int step = 3;
		
		for (int i =2; i <= 9; i += step) {
			for (int j = 0; j <= 9; j++) {
				for(int k = i; k <= 9 && k < i+step; k++) {
					if( j == 0 ) {
						System.out.printf("*** %d단 ***\t", k);
					} else {
					System.out.printf("%d * %d = %d\t" , k , j , k*j);
					}
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
		/*
		for (int i =2; i <= 9; i += 3) {
			for ( int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t" , i , j , i*j);
				System.out.printf("%d * %d = %d\t" , i+1 , j , (i+1)*j);
				if (i+2 <= 9) {
					System.out.printf("%d * %d = %d\t" , i+2 , j , (i+2)*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
	}

}
