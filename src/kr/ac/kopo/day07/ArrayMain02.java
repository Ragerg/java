package kr.ac.kopo.day07;

public class ArrayMain02 {
	
	public static void main(String[] args) {
		
//		int[] arr = {10, 20, 30, 40, 50};
		int[] arr = new int[] {10, 20, 30, 40, 50};
		
		
		/*
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		*/
		
		/*
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		*/
				
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
//		arr = new int[10];
//		arr = {1,2,3,4,5,6,7,8,9,10}; // 이미 만들어져있는 참조변수의 크기를 변경 불가
		arr = new int[] {1,2,3,4,5,6,7,8,9,10}; // new int[]로 새로 선언
		
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		
		
	}
}
