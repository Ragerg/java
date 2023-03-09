package kr.ac.kopo.day03;
/**
 * 파일명 : Comment.java
 * 작성일 : 2023/03/09
 * 작성자 : 김자바
 */

/* 다음 클래스는 다음과 같은 두 줄의 내용을 출력하는 자바 프로그램이다.
   "출력될 내용은 다음과 같습니다."
   "처음 작성한 자바 프로그램입니다."
 */
public class Comment {
	
	/* 첫 번째 출력될 내용을 저장한 변수 선언*/
	static String s = "출력될 내용은 다음과 같습니다.\n";
	
	//두 번째 줄에 내용을 출력하는 메소드 선언
	static String getMessage() {
		return "처음 작성한 자바 프로그램입니다.";
	}
			
	public static void main(String[] args) {
		System.out.println(s + getMessage()); // 도스창출력
	}
}
