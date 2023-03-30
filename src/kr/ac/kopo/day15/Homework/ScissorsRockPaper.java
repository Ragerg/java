package kr.ac.kopo.day15.Homework;

public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	public int startGame(int you) {
		int me = (int)(Math.random()*3)+1;
		if(me == you) {
			System.out.println("비겼습니다");
			return -1;
		} else if(me + 1 == you || me - 2 == you) {
			System.out.println("You win");
			return 1;
		} else {
			System.out.println("You lose");
			return 0;
		}
	}

}
