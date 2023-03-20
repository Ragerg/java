package kr.ac.kopo.day10;

public class Member {
	
	/** 이름 */
	String name;
	/** 나이 */
	int age;
	/** 혈액형 */
	String bloodType;
	
	Member() {
		//매개변수를 가지고 있는 생성자를 만들때 기본적으로 디폴트 생성자를 먼저 만들기!!
	}
	
	Member(String n, int a, String bt) {
		name = n;
		age = a;
		bloodType = bt;
		
	}

}
