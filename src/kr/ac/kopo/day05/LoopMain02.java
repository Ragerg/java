package kr.ac.kopo.day05;

public class LoopMain02 {
	
	public static void main(String[] args) {
		
		System.out.println("--- Start ---");
		// for( ; ; ) << 무한루프
		for( int cnt=1; cnt<=5; cnt++ ) {
			System.out.println("Hello");
		}		
		System.out.println("---- End ----");
		//System.out.println("cnt : " + cnt); cnt 변수가 for문 안에서 라이프사이클이 끝났기 때문에 for문 밖에서 실행할 수 없음
		
		for(int cnt = 1; cnt <=3; cnt++) {
			System.out.println("Good-bye");
		}
	}
}
