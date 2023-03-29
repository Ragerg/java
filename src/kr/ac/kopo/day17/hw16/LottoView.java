package kr.ac.kopo.day17.hw16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoView {
	
	Random r = new Random();
	public void start() {
		
		int gameCnt = 3;
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto5()));
			
		}
	}
	
	
	private int[] getLotto1() {
		
		int[] lottoNums = new int[6];
		loop : for(int i = 0; i <lottoNums.length;) { // continue 만나면 돌아올 곳
			lottoNums[i] = r.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					System.out.print('!');
					continue loop; // 멈추고 loop로 돌아가서 실행
				}
			}
			i++;
		}
		return lottoNums;
	}
		/*
		int[] lottoNums = new int[6];
		for(int i = 0; i <lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45)+1;
			boolean bool = true;
			for (int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					bool = false;
					break;
				}
			}
			if(bool) {
				i++;
			}
		}
		return lottoNums;
		*/
	
	private int[] getLotto2() {
		
		int[] lottoNums = new int[6];
		boolean[] flags = new boolean[45];  // 0~44
		
		for(int i = 0; i < lottoNums.length;) {
			int random = r.nextInt(45);
			if(flags[random]) {
				lottoNums[i++] = random + 1;
				flags[random] = true;
			} else
				System.out.print('!');
		}
		
		return lottoNums;
		
	}
	
	
	private int[] getLotto3() {
		int[] lottoNums = new int[6];
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
 		}
		
		for(int i = 0; i < 6; i++) {
			int randIdx = r.nextInt(45-i);
			
			int temp = nums[randIdx];
			nums[randIdx] = nums[45-1-i];
			nums[45-1-i] = temp;
			
		}
		
		System.arraycopy(nums, nums.length - lottoNums.length, lottoNums, 0, lottoNums.length);
		
		return lottoNums;
	}



	private int[] getLotto4() {
		int[] lottoNums = new int[6];
		
		Set<Integer> lottos = new HashSet<>();
		while(lottos.size() < 6) {
			lottos.add(r.nextInt(45)+1);
		}
		int i = 0;
		for(int num : lottos) {
			lottoNums[i++] = num;
		}
		return lottoNums;
	}

	private int[] getLotto5() {
		int[] lottoNums = new int[6];
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			nums.add(i);
		}
		Collections.shuffle(nums);
		for(int i =0; i < lottoNums.length; i++) {
			lottoNums[i] = nums.get(i);
		}
		
		return lottoNums;
	}































}
