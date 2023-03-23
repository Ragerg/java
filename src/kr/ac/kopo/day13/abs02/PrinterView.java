package kr.ac.kopo.day13.abs02;

import java.util.Scanner;

public class PrinterView {
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void work() {
		
		System.out.print("출력할 프린터를 선택하세요(1. SAMSUNG   2. HP   3. LG) : ");
		int choice = sc.nextInt();
		sc.nextLine(); // 버퍼비우는 용
		
		Printer p = null;
		switch(choice) {
		case 1 : 
			p = new SamsungPrinter();
//			p.print();
			break;
		case 2 :
			p = new HPPrinter();
//			p.print();
			break;
		case 3 :
			p = new LGPrinter();
			break;
		default : 
			System.out.println("잘 못 입력하셨습니다.");
		}
		if(p != null) { // p가 null 이 아닐 때만 출력
			p.print();
		}
	}
}
