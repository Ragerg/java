package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain03 {
	
	public static void main(String[] args) {
		
		System.out.println("==== start ====");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		try {
			System.out.println("random : " + random);
			System.out.println(10 / random);
			
			String str = "hello";
			System.out.println(str.charAt(5));
		} catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
			
		/*	
		} catch (ArithmeticException ae) {
			System.out.println("예외발생!!!");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBounds 예외발생!!!");
			se.printStackTrace();
		}
		*/
			
		System.out.println("==== end ====");
	}

}
