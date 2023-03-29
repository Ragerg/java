package kr.ac.kopo.day16.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoView {
	
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	public void start() {
		
		System.out.print("몇 게임? : ");
		int gameCnt = sc.nextInt();
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto4()));
			
		}
	}
	
	private Object[] getLotto1() {
		
		Set<Integer> set = new HashSet<>();
		for(int i = 1; i <= 6; i++) {
			boolean bool = true;
			while(bool) {
				bool = !set.add(r.nextInt(45)+1);
			}
		}
		Object[] lottoNums = set.toArray();
		
		return lottoNums;
	}
	
	private Object[] getLotto2() {
		
		List<Integer> list  = new ArrayList<>();
		for(int i = 1; list.size() <= 6; i++) {
			Integer j = r.nextInt(45)+1;
			if(list.contains(j)) {
			} else {
				list.add(j);
				
			}
		}
		Object[] lottoNums = list.toArray();
		
		return lottoNums;
	}
	
	private Object[] getLotto3() {
		
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) {
			int i = r.nextInt(45) + 1;
			set.add(i);
		}
		
		Object[] lottoNums = set.toArray();
		return lottoNums;
		
	}
	
	private int[] getLotto4() {
		
		
		
		int[] lottoNums = new int[6];
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.print('!');
					lottoNums[j] = r.nextInt(45)+1;
				}
			}
		}
		return lottoNums;
		
}
		
		
	
	private int[] getLotto5() {
		
		int[] lottoNums = new int[6];
		
		List<Integer> list  = new LinkedList<>();
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		
		for(int j = 0; j < lottoNums.length; j++) {
			lottoNums[j] = list.remove(r.nextInt(list.size()));
		}
		
		
		return lottoNums;	
		
	}
	
	
}
