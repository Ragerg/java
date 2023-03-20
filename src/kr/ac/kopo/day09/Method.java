package kr.ac.kopo.day09;

public class Method {
	
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출..."); 
		// method Overloading : 같은 클래스 내에 메소드명이 동일하고, 매개변수가 다른 메소드가 정의되어 있는 것
	}
	
	void call(String s, int i) {
		System.out.println("call(String, int) 메소드 호출..."); 
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출..."); 
	}
	
}
