package kr.ac.kopo.day05;

public class BreakMain01 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		for (; cnt <= 10; cnt++) {

			if (cnt >= 3) {
				break;
			}

			System.out.println("Hi");
		}
		System.out.println("cnt : " + cnt);

	}
}

