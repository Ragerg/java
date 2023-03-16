package kr.ac.kopo.day08;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {

		int loc = 0;

		// "하이테크" "자바" "교육"
//		String[] strArr = {"하이테크", "자바", "교육"};
		String[] strArray = new String[5];
		strArray[loc++] = "하이테크";
		strArray[loc++] = "인공지능";
		strArray[loc++] = "자바";
		strArray[loc++] = "교육";

		System.out.println("< index 이용 출력 >");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		System.out.println("< 1.5버전 for 출력 >");
		for (String str : strArray) {
			System.out.println(str);
		}
		System.out.println("< Arrays.toString() 이용 출력 >");
		System.out.println(Arrays.toString(strArray));

	}
}
