package kr.ac.kopo.day15;

/*final*/ class Super{
	/*final*/ int NO = 100;
	Super(){}
	
	Super(int no) {
		this.NO = no;
	}
	
	/*final*/ void print() {
		System.out.println("super");
	}
	
}

class Sub extends Super{
	
	@Override
	void print() {
		System.out.println("sub...");
		
	}
}
public class finalMain {
	
	public static void main(String[] args) {
		
		Super s = new Super();
		System.out.println(s.NO);
	}

}
