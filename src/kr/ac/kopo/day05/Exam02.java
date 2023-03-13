package kr.ac.kopo.day05;

public class Exam02 {

	public static void main(String[] args) {
		
		System.out.println("\n1번");
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 5; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
		
			
		System.out.println("\n2번");
			for(int i = 1; i <= 5; i ++) {
				for(int j = 1; j <= 5; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		
			
		System.out.println("\n3번");
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 5; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		
		System.out.println("\n4번");
			for(int i = 1; i <= 5; i++) {
				for(int j = i; j <= i+4; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			
		System.out.println("\n5번");
			for(int i = 5; i >= 1; i--) {
				for(int j = i; j <= i+4; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			
		System.out.println("\n6번");
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
			
		System.out.println("\n7번");
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 6-i; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		
		System.out.println("\n8번");
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print(' ');
				}
				for(int j = 1; j <= 6-i; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		
		System.out.println("\n9번");
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 5-i; j++) {
					System.out.print(' ');
				}
				for(int j = 1; j <= i; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		
		System.out.println("\n10번");
		 for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
			 	for(int j = 1; j <= i; j++) {
					 System.out.print('*');
				 }
			} else {
				for(int j= 1; j <= 10-i; j++) {
					System.out.print('*');
				}
			}
			 	System.out.println();
		 }
		 
		 System.out.println("\n11번");
		 	for(int i = 1; i <= 9; i++) {
		 		if(i <= 5) {
		 			for(int j = 1; j <= 6-i; j++) {
		 				System.out.print('*');
		 			}
		 		} else {
		 			for(int j = 1; j <= i-4; j++) {
		 				System.out.print('*');
		 			}
		 		}
		 		System.out.println();
		 	}
		 
		 System.out.println("\n12번");
		 	for(int i = 1; i <= 9; i++) {
		 		if(i <= 5) {
		 			for(int j = 1; j <= i-1; j++) {
		 				System.out.print(' ');
		 			}
		 			for(int j = 1; j <= 6-i; j++) {
		 				System.out.print('*');
		 			}
		 		} else {
		 			for(int j = 1; j <= 9-i; j++) {
		 				System.out.print(' ');
		 			}
		 			for(int j = 1; j <= i-4; j++) {
		 				System.out.print('*');
		 			}
		 		}
		 		System.out.println();
		 	}
		 
	 	System.out.println("\n12번");
	 		for(int i = 1; i <= 9; i++) {
	 			if(i <=5 ) { 
	 				for(int j = 1; j <= 5-i; j++) {
	 					System.out.print(' ');
	 				}
	 				for(int j = 1; j <= i; j++) {
	 					System.out.print('*');
	 				}
	 			} else {
	 				for(int j = 1; j <= i-5; j++) {
	 					System.out.print(' ');
	 				}
	 				for(int j = 1; j <= 10-i; j++) {
	 					System.out.print('*');
	 				}
	 			}
	 			System.out.println();
	 		}
		 
	}
}
