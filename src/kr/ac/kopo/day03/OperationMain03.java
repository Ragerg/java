package kr.ac.kopo.day03;

/*
  두 개 정수 입력 : 12 5
  12는 5의 배수 판단 : false
  
  두 개 정수 입력 : 12 6
  12는 6의 배수 판단 : true
 */

public class OperationMain03 {
	
	public static void main(String[] args) {
	
		int num01 = 12, num02 = 5; // ,(순서연산자)
		boolean bool = (num01 % num02 == 0);
		System.out.printf("%d는 %d의 배수판단 : %b\n" , num01, num02, bool);
		
		int num03 = 15, num04 = 0;
		boolean bool2 = (num04 != 0 && num03 % num04 == 0);
		System.out.printf("%d는 %d의 배수판단 : %b\n" , num03, num04, bool2);
		
		int num05 = 12, num06 = 6;
		boolean bool3 = (num06 != 0 && num05 % num06 == 0);
		System.out.printf("%d는 %d의 배수판단 : %b\n" , num05, num06, bool3);
				
		
		
		
	}

}
