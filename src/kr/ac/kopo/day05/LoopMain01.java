package kr.ac.kopo.day05;

public class LoopMain01 {

	public static void main(String[] args) {
		
		System.out.println("--- Start ---");
		int cnt = 1;
		while(cnt <= 5) {
		System.out.println("Hello");
		++cnt;
		}
		System.out.println("---- End ----");
			System.out.println("cnt : " + cnt);
		
			cnt = 1;
		while(cnt <= 3) {
			System.out.println("Good-bye");
			++cnt;
		}
	}
}
