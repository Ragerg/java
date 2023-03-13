package kr.ac.kopo.day05;

public class LoopMain03 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		do {  // 최소 1번은 실행하기 위해 조건문을 실행문 아래로 내린다
			System.out.println("Hello");
			++cnt;
		} while(cnt >= 5); // 아래있는 블록스코프가 아닌 위에 있는 블록과 한 쌍이라는 것을 알려주기 위해 ; 
		
	}

}
