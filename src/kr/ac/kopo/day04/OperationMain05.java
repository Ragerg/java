package kr.ac.kopo.day04;

public class OperationMain05 {
	
	public static void main(String[] args) {
		
		int num = 0x0055ff00;
		System.out.printf("%8x\n" , num);
		
		System.out.printf("%x\n" , ~num);
		
		System.out.printf("%8x\n" , num & 0xffff0000);
		System.out.printf("%8x\n" , num | 0x0000ffff);
		
	}

}
