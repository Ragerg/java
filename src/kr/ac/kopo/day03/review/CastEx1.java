package kr.ac.kopo.day03.review;

class CastEx1 {

	public static void main(String args[]) {
		
		byte b1 = 127;
		char c1 = '가';
		int i1;
		double d1;
		
		System.out.println("자동 형변환의 결과");
		
		i1 = b1;
		System.out.println("1 = b1의 형변환" + i1);
		
		i1 = c1;
		System.out.println("i1 = c1의 형변환" + i1);
		
		d1 = i1;
		System.out.println("d1 = i1의 형변환" + d1);
	}
}
