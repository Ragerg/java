package kr.ac.kopo.day11.Homwork;

public class IceCreamShop {
	
	public static void main(String[] args) {
		
		ScannerUtil scan = new ScannerUtil();
		String another = "Y";
		int times = 0;
		
		do {
			int num = scan.nextInt("구입할 아이스크림 개수 : ");
	
			IceCream ice[] = new IceCream[num];
			for(int i = 1; i <= num; i++) {
				System.out.println("*** " + i + "번째 아이스크림 구매 정보 입력 ***");
				scan.nextString("");
				String iceName = scan.nextString("아이스크림 이름 : ");
				int icePrice = scan.nextInt("아이스크림 가격 : ");
				ice[i-1] = new IceCream(i, iceName, icePrice);
			}
			
			System.out.println("< 총 " + num + "개의 아이스크림 구매 정보 출력 >");
			System.out.printf("%s	%-10s	%10s\n","번호","아이스크림 이름","아이스크림 가격");
			
			int total = 0;
			for(int i = 0; i < num; i++) {
				ice[i].info();
				total += ice[i].price;
			}
			
			System.out.println("총합 : " + total + "원");
			times += 1;
			
			
			scan.nextString("");
			another = scan.nextString("계속 구매하시겠습니까? (Y/N)");
			
		} while(another.equalsIgnoreCase("Y"));

		
		System.out.println("총 " + times + "번의 구매정보 발생");
		IceCream.totalPrice();


		
		
		
		
		
	}

}
