package kr.ac.kopo.day14.Homework;

import java.util.Random;

public class RandomNum {

	int[] num = new int[3];
	
	public int[] getNum() {
		return num;
	}
	
	public void random() {
		
			Random r = new Random();
			num[0] = r.nextInt(10);
			num[1] = r.nextInt(10);
			num[2] = r.nextInt(10);
			
			do {
				if(num[0] == num[1]) {
					num[1] = r.nextInt(10);
				}
			} while(num[0] == num[1]);
			
			do {
				if(num[0] == num[2] || num[1] == num[2]) {
					num[2] = r.nextInt(10);
				}
			} while(num[0] == num[2] || num[1] == num[2]);
			
	}
	
	public void end() {
		
		System.out.print("정답은 ");
		for(int random : num) {
			System.out.print(random);
		}
		System.out.print(" 입니다.");
	}

}
