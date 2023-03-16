package kr.ac.kopo.day06.Homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		System.out.println("문제 1");
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d ", i);
		}

		System.out.println();
		System.out.println("문제 2");
		for (int i = 1; i <= 100; i += 2) {
			System.out.printf("%d ", i);
		}

		System.out.println();
		System.out.println("문제 3");
		for (int i = 100; i >= 2; i -= 2) {
			System.out.printf("%d ", i);
		}

		System.out.println();
		System.out.println("문제 4");
		int high = 0, time = 0;
		while (high < 100) {
			high += 5;
			if (high < 50) {
				high--;
			} else {
				high -= 2;
			}
			time++;
			System.out.printf("[%d시간 후 달팽이가 올라간 총 높이 : %dM\n", time, high);
		}

		System.out.println();
		System.out.println("문제 5");

		Scanner sc = new Scanner(System.in);
		int times = 0;
		for(times = 1; times < 2 || 9 < times; ) {
			System.out.println("2 - 9 사이의 단을 입력 : ");
			times = sc.nextInt();			
		}

		System.out.printf("*** %d단 ***\n", times);
		for (int i = 1; i <= 9; i++) {
			System.out.println(times + " * " + i + " = " + times * i);
		}

		System.out.println();
		System.out.println("문제 6");

		for (int i = 2; i <= 9; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("문제 7");

		System.out.println("시작단을 입력 : ");
		int times1 = sc.nextInt();
		System.out.println("종료단을 입력 : ");
		int times2 = sc.nextInt();

		if (times1 < times2) {
			for (int i = times1; i <= times2; i++) {
				System.out.printf("*** %d단 ***\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}
		} else {
			for (int i = times2; i <= times1; i++) {
				System.out.printf("*** %d단 ***\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}

		}

		System.out.println();
		System.out.println("문제 8");

			
				for(int i = 1; i < 9; i += 3) {
					System.out.printf("*** %d단 ***\n", i);
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
					System.out.println();
				}
				
			
	}

}
