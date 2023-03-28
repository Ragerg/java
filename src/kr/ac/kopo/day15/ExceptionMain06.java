package kr.ac.kopo.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {
	
	public static void a() {
		
		System.out.println("a() 시작");
		try {
			//컴파일시점 예외처리,  checked Exception
			FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println("a() 종료");
	}
	
//	public static void b() throws NullPointerException {
	public static void b() throws Exception {
		
		System.out.println("b() 시작....");
		String str = null;
		System.out.println("length : " + str.length());
		System.out.println("b() 종료....");
	}
	
	public static void main(String[] args) {
//	public static void main(String[] args) throws Exception { 도 가능은 함
		
		try {
			b();
//		} catch(NullPointerException e) {
		} catch(Exception e) {
			System.out.println("main 예외처리...");
			e.printStackTrace();
				
		}
		a();
		
	}

}
