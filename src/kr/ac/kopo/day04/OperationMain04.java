package kr.ac.kopo.day04;

/*
  두 개 정수 입력 : 12 5
  12는 5의 배수 판단 : 배수가 아닙니다
  
  두 개 정수 입력 : 12 6
  12는 6의 배수 판단 : 배수입니다
 */

public class OperationMain04 {
	
	public static void main(String[] args) {
		
//		String msg = true ? "배수" : "배수아님";
//		System.out.println(10 > 4 ? "배수다" : "배수가 아니다");
	
		int num01 = 12, num02 = 5; 
		boolean bool = (num01 % num02 == 0);
		String result = bool ? "배수입니다" : "배수가 아닙니다";
		
		System.out.printf("%d는 %d의 배수판단 : %s\n" , num01, num02, result);
		
		int num03 = 15, num04 = 0;
		boolean bool1 = (num04 != 0 && num03 % num04 == 0);
		String result1 = bool1 ? "배수입니다" : "배수가 아닙니다";
		System.out.printf("%d는 %d의 배수판단 : %s\n" , num03, num04, result1);
		
		int num05 = 12, num06 = 6;
		boolean bool2 = (num06 != 0 && num05 % num06 == 0);
		String result2 = bool2 ? "배수입니다" : "배수가 아닙니다";
		System.out.printf("%d는 %d의 배수판단 : %s\n" , num05, num06, result2);
				
		
		
		
	}

}
