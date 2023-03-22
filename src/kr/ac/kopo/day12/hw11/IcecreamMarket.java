package kr.ac.kopo.day12.hw11;

import kr.ac.kopo.day11.hw10.ScannerUtil;

public class IcecreamMarket {
	
	void open() {
		
		ScannerUtil scan = new ScannerUtil();
		
		int cnt = scan.nextInt("아이스크림 몇 개 입력할래? => ");
		Icecream[] iceArr = new Icecream[cnt];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 입력 ***\n", i+1);
			String name = scan.nextString("아이스크림명 : ");
			int price = scan.nextInt("아이스크림가격 : ");
			
			iceArr[i] = new Icecream(name, price);
		}
		
		System.out.printf("< 총 %d 개 아이스크림 구매정보 출력 >\n", iceArr.length);
		System.out.println("번호\t아이스크림명\t아이스크림 가격");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].getName() + "\t" + iceArr[i].getPrice());
		}
		
		Icecream.totalInfo();
		
	}

}
