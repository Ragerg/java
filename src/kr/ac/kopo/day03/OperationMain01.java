package kr.ac.kopo.day03;

public class OperationMain01 {
		
	public static void main(String[] args) {
		
		int num = 123;
		
		//num = num + 1;
		//num = num + 50;
		num += 50; // 복합대입연산자, 배정연산자 : += -= *= /= %=
		
		++num;
		num++;
										
		System.out.println("num : " + num);
		
		int a = 5;
		System.out.println(a++); // 1. print(a); 2. a=a+1;
		System.out.println(++a); // 1. a=a+1; 2. print(a);
		System.out.println(--a); 
		System.out.println(a); 
		System.out.println(a--); 
		System.out.println(a++);
		System.out.println(a);
			
	}

}
