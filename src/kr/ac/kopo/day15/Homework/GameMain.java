package kr.ac.kopo.day15.Homework;

import java.util.Scanner;

public class GameMain {
	
	public static void main(String[] args){ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임을 선택하세요\nA. 가위바위보\nB. 주사위 값 맞추기\nC. 종료 ");
		String choice = sc.nextLine();
		
		int winCnt = 0, loseCnt = 0, drawCnt = 0, cnt = 3;
		
		do {
			switch(cnt) {
			case -1 :
				drawCnt++;
				break;
			case 1 :
				winCnt++;
				break;
			case 0 :
				loseCnt++;
				break;
			}
			
			switch(choice) {
			case "A" : 
				System.out.println("가위바위보 게임입니다.\n가위바위보중 하나를 선택하세요.\n(1:가위, 2:바위, 3보)");
				int you = sc.nextInt();
				sc.nextLine();
				ScissorsRockPaper srp = new ScissorsRockPaper();
				cnt = srp.startGame(you);
				break;
			case "B" :
				System.out.println("주사위 값 맞추기 게임입니다.\n주사위을 선택하세요(1~6값 중 하나)");
				you = sc.nextInt();
				sc.nextLine();
				Dice d = new Dice();
				cnt = d.startGame(you);
				
				break;
			case "C" :
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은 " + winCnt + "승 " + loseCnt + "패 " + drawCnt + "무 입니다");
				System.exit(0);
			default : 
				System.out.println("다시 입력하세요");
			}
			System.out.println("게임을 선택하세요\nA. 가위바위보\nB. 주사위 값 맞추기\nC. 종료 ");
			choice = sc.nextLine();
		} while (true);
	
	
	}

}
