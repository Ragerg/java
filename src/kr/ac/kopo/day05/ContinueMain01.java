package kr.ac.kopo.day05;

public class ContinueMain01 {

	public static void main(String[] args) {

		int cnt = 1;
		for (; cnt <= 10; cnt++) {

			if (cnt >= 3) {
				continue; // if else 로 가능
			}
			System.out.println(cnt + "HI");

		}
		System.out.println("cnt : " + cnt);

	}
}
