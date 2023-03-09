package kr.ac.kopo.day03.review;

public class CastEx2 {
	
	public static void main(String[] args) {
		
		byte b1;
		char c1;
		int i1 = 128;
		int i2 = 97;
		double d1 = 3.14;
		
		System.out.println("명시적 형변환의 결과");
		
		b1 = (byte)i1;
		System.out.println("b1 = (byte)i1의 형변환" + b1);
		
		c1 = (char)i2;
		System.out.println("c1 = (char)i2의 형변환" + c1);
		
		i1 = (int)d1;
		System.out.println("i1 = (double)d1의 형변환" +i1);
		
		
		int e = 21;
		System.out.printf("%d %x %o\n", e, e, e);
		
		int f =025;
		System.out.printf("%d %x %o\n", f, f, f);

		int g =0x1f;
		System.out.printf("%d %X %o", g, g, g);
	}

}
