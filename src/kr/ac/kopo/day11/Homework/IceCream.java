package kr.ac.kopo.day11.Homework;

public class IceCream {
	
	int no;
	String name;
	int price;
	static int total;
	
	IceCream() {
		total = total+price;
	}
	
	IceCream(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
		total = total+price;
	}
	
	void info() {
		System.out.printf("%d	%-10s	%10d원\n", no, name, price);
	}
	
	static void totalPrice() {
		System.out.println("총계 : " + IceCream.total + "원");
	}
	
	
}
