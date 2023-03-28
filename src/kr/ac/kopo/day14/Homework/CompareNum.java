package kr.ac.kopo.day14.Homework;

public class CompareNum {
	
	private int outCnt;
	private int ballCnt;
	private int strikeCnt;

	
		
	
	public void checkNum(int[] num, int[] num2) {
		int cnt = 0;
		strikeCnt = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] == num2[i]) {
				strikeCnt++;
			}
			for(int j = 0; j <num2.length; j++) {
				if(num[i] == num2[j]) {
					cnt++;
				}
			}
		}
		ballCnt = cnt-strikeCnt;
		
		if(cnt == 0) {
			outCnt++;
		}
		
//		System.out.println(cnt);
		
	}
	
	public int getOutCnt() {
		return outCnt;
	}
	
	public int getStrikeCnt() {
		return strikeCnt;
	}

	public int getBallCnt() {
		return ballCnt;
	}

}
