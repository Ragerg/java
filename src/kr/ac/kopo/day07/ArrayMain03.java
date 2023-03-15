package kr.ac.kopo.day07;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 키보드로 3개의 실수를 입력받아 출력하는 코드를 작성하시오.
 * 1번째 실수 : 12.3
 * 2번째 실수 : 66.23
 * 3번째 실수 : 10.673
 * 
 * <print>
 * 12.3 66.23 10.673
 * 
 */
public class ArrayMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] ar = new double[3];
		
		for(int i =0; i < ar.length; i++) {
			System.out.print(i+1 + "번째 실수 : ");
				ar[i] = sc.nextDouble();
		/*
		 * 배열의 모든 요소를 출력하는 방식
		 * 1. index를 이용해서 출력
		 * 2. 1.5버전의 for문을 이용해서 출력
		 * 3. Arrays.toString() 메소드를 이용해서 출력		  
		 */
				
				
		}
		System.out.println("< index를 이용한 출력 >");
		for(int i =0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}
		System.out.println();
		
		System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for( double data : ar) {
			System.out.print(data + "\t");
			
		}
		System.out.println();
		
		System.out.println("< Arrays.toString() 메소드를 이용한 출력 >"); // import 꼭 필요
		System.out.println(Arrays.toString(ar));
	}

}
