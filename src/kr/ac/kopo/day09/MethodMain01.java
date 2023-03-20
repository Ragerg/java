package kr.ac.kopo.day09;

public class MethodMain01 {
	
	static int prnStar(int num , String data) { // 호출자 메소드가 정수값을 넘겨주면 num으로 기억
		System.out.println("**********");
		System.out.println("호출자가 넘겨준 정수 : " + num);
		System.out.println("호출자가 넘겨준 문자열 : " + data);
		int sum = num%10 + num/10;
		
		return sum;// return : 호출자메소드로 무조건 복귀
//						return + 값 : 값을 가지고 호출자메소드로 복귀 
		
	}
	
	public static void main(String[] args) {
		
			int cnt = 10;
			 int s = prnStar(cnt, "abc"); // cnt : 호출자가 피호출자에게 넘겨주는 정수
			 System.out.println("자리수 합 : " + s );
			 System.out.println("Hello");
			 s = prnStar(34, "hi");
			 System.out.println("자리수 합 : " + s );
			 System.out.println("Hi");
			 s = prnStar(22, "good");
			 System.out.println("자리수 합 : " + s );
			 System.out.println("Good-bye");
			 s= prnStar(78,"bye");
			 System.out.println("자리수 합 : " + s );
			 
			 
			 
	}
}


