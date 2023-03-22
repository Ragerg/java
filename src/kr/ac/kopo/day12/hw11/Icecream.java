package kr.ac.kopo.day12.hw11;

public class Icecream {
	
	//이름과 가격을 가지고 있는 Icecream이라는 객체를 생성
	
	String name;
	int price;
	static int total;
	
	
	Icecream(){
		
	}
	
	
	Icecream(String name, int price){
		this.name = name;
		this.price = price;
		Icecream.total += price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static void totalInfo() {
		System.out.println("총액 : " + Icecream.total + "원");
	}

}
