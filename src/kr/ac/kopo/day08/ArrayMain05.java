package kr.ac.kopo.day08;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		int[] dest = new int[arr.length];
		System.out.println("arr  : " + Arrays.toString(arr));
		System.out.println("dest : " + Arrays.toString(dest));
		
		/*
		for(int i = 0; i < arr.length; i++) {
			dest[i] = arr[i];
		}
		*/
		
//		System.arraycopy(arr, 0 , dest, 0, arr.length);
	
		/*
		//if(arrIdx +3 < arr.length)
		for(int arrIdx = 3 , destIdx = 1 , i = 0; i < 3; i++) {
			dest[destIdx++] = arr[arrIdx++];
		}
		*/
		
		System.arraycopy(arr, 3 , dest, 1, 3);
		
		
		
		System.out.println("arr  : " + Arrays.toString(arr));
		System.out.println("dest : " + Arrays.toString(dest));
		
	}
}











