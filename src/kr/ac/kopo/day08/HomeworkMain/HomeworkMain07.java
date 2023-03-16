package kr.ac.kopo.day08.HomeworkMain;

import java.util.Scanner;

public class HomeworkMain07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		/*
		int i = 0;
		while(true) {
			System.out.printf("num %d : ", i+1);
			nums[i] = sc.nextInt();
			if(nums[i] >= 0 && nums[i] <= 99) {
				i++;
				if(i == nums.length) {
					break;
				}
			}
		}
		*/
		
		for(int i = 0; i < nums.length; ) {
			System.out.printf("num %d : ", i+1);
			nums[i] = sc.nextInt();
			if(nums[i] >= 0 && nums[i] <= 99) {
				i++;
			}
		}
		
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >=0; i--) {
			
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			
			System.out.print(n1 * 10 + n10+ "\t");
		}
		System.out.println();
	}
}










