package kr.ac.kopo.day12.Homework;

public class StringUtilMain {
	
	public static void main(String[] args) {
		
		StringUtil_add_add su = new StringUtil_add_add();
		
		boolean ew = su.endsWith("Hello", "ello");
		System.out.println(ew);
		
		System.out.println(StringUtil_add_add.checkChar("Hello World Java", 'W'));
		
		System.out.println(StringUtil_add_add.removeChar("Hello World Java", 'l'));
		
		int io = su.indexOf("Hello", "l");
		System.out.println(io + "번지에 위치함");
		
		
		
		
		
		
		
		
	}
}
