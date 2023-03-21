package kr.ac.kopo.day10.Homework;


public class Calculator {
	
	int num1;
	int num2;
	
	Calculator() {
		this(0, 0);
	}
	
	Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
		
	void arithmetic(){
		System.out.println("정수 : " + num1);
		System.out.println("정수 : " + num2);
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %f\n", num1, num2, (double)num1/num2);
	}
	
	void primenums() {
		boolean prime = true;
		for(int i = 2; i < num1; i++) {
			if(num1 % i == 0) {
				prime = false;
				break;
			}
				
		}
		System.out.println(num1 + "의 소수 체크 : " + prime);
		
		prime = true;
		for(int i = 2; i < num2; i++) {
			if(num2 % i == 0) {
				prime = false;
				break;
			}
			
		}
		System.out.println(num2 + "의 소수 체크 : " + prime);
		
		
		
	}
	
	void cal() {
		arithmetic();
		primenums();
	}
			

}
