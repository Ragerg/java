package kr.ac.kopo.day04.review;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		int i = args.length;
		System.out.println(i);
		
		switch (i) {
			case 1 :
				System.out.println("매개변수가 반지름인 원의 너비를 구한다.");
				break;
			case 2 :
				System.out.println("매개변수가 가로, 세로인 사각형 너비를 구한다.");
				break;
			case 3 :
				System.out.println("매개변수가 가로, 세로, 높이인 육면체부피를 구한다.");
				break;
			default:
				System.out.println("오류!!!");
				
		}
	}

}
