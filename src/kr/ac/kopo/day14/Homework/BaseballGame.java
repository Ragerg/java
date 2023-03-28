package kr.ac.kopo.day14.Homework;

import java.util.Scanner;

public class BaseballGame {
	
	
	
	public void game() {
		
		RandomNum r = new RandomNum();
		r.random();
//		r.end();
	
		Scanner sc = new Scanner(System.in);
		CompareNum c = new CompareNum();
		
		System.out.println("3자리 숫자를 입력해 주세요");
		
		
		
		for(int chance = 5; chance >= 0; chance--) { 
			int num = sc.nextInt();
			
			int [] nums = new int[3];
			nums[0] = num / 100;
			nums[1] = (num % 100) / 10 ;
			nums[2] = num % 10;
			
			c.checkNum(r.getNum(), nums);
			
			if(c.getStrikeCnt() == 3) {
				System.out.print("!!!HOMERUN!!!\n축하합니다! ");
				r.end();
				break;
			}
			if(c.getOutCnt() == 3) {
				System.out.print("\n3 OUT\n---GAME OVER-----\n");
				r.end();
				break;
			}
			if(chance == 0) {
				System.out.print("\n기회를 모두 소진 하셨습니다\n---GAME OVER-----\n");
				r.end();
				break;
			}
			System.out.print(c.getStrikeCnt() + " strike,  " + c.getBallCnt() + " ball,  " + c.getOutCnt() + " out");
			System.out.println("\n기회가 " + chance + "번 남았습니다");
		}
		
	}

}
