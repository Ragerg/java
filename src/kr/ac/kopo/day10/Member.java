package kr.ac.kopo.day10;

public class Member {
	
	/** 이름 */
	String name;
	/** 나이 */
	int age;
	/** 혈액형 */
	String bloodType;
	
	Member() {
		this("알 수 없음");
	}
	
	Member(String name) {
		this(name, -1);
	}
	
	Member(String name, int age) {
		this(name, age, "알 수 없음");
	}
		
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
		
	}
	

	
	
/*		
	Member() {
		//매개변수를 가지고 있는 생성자를 만들때 기본적으로 디폴트 생성자를 먼저 만들기!!
		
		this("알 수 없음", -1, "알 수 없음");
		
//		this.name = "알 수 없음";
//		this.age = -1;
//		this.bloodType = "알 수 없음";
		
	}
	
	Member(String name) {
		
		this(name, -1, "알 수 없음");
		
//		this.name = name;
//		this.age = -1;
//		this.bloodType = "알 수 없음";
	}
	
	Member(String name, int age) {
		
		this(name, age, "알 수 없음");
		
		
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알 수 없음";
	}
	

	
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
		
	}
 */
	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}

}
