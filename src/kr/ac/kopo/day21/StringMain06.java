package kr.ac.kopo.day21;

public class StringMain06 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i < 300000; i++) {
			sum += 1;
		}
		System.out.println("종료...");
				
		String data = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i < 300000; i++) {
			data += i;			// data.concat(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end-start) / 1000. + "초");
		
		StringBuilder sb = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i = 0; i <300000; i++) {
			sb.append(i); // = sb += i;
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end-start) / 1000. + "초");
		
	}

}
