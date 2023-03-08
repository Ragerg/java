package kr.ac.kopo.day02;

public class VariableMain01 {

	public static void main(String[] args) {
		
		char ch;
		
		ch = 'A';
		
		{
			int a = 10;
			System.out.println("a : " + a);
		}
		//a = 20;  // 문법오류가 발생, 변수의 라이프 사이클은 가장 가까운 블록 스코프
		
		ch = '!';
		ch = 80;
		ch = '\u0061';
		
		
		System.out.println("ch : " + ch);
		
	}
}
