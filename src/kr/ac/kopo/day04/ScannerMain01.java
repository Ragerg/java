package kr.ac.kopo.day04;

import java.util.Scanner; //암기 , ctrl + shift + o

public class ScannerMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //암기 
		
		System.out.print("문자를 입력 : ");;
//		char ch = sc.nextChar(); 
		char ch = sc.nextLine().charAt(0); //문자형으로 받아오기 위한 메소드
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 : ");
//		String str = sc.next();
		String str = sc.nextLine(); 
		
		System.out.println("str :  " + str);
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		System.out.print("실수를 입력 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("num2 : " + num2);
		sc.close();
	

	}

}

