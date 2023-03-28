package kr.ac.kopo.day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	LIST
	특징 :  중복O, 순서O
	구현클래스 : 
		-ArrayList
		-LinkedList
		
	메소드
		-add()      : 데이터 삽입
		-get()      : 특정위치의 데이터 조회
		-remove()   : 특정위치 또는 특정값을 가진 데이터 삭제
		-clear()    : 전체 데이터 삭제
		-size()     : 리스트의 전체 원소 개수
		-isEmpty()  : 리스트가 비어있는지 여부 판단
		-contains() : 특정데이터가 존재하는지 판단
		-addAll()   : 다른 리스트의 원소들을 전체 추가
 */



public class ListMain { 
	
	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>(); // <> 안에는 참조자료형만 들어갈 수 있다
		List<String> list = new LinkedList<String>(); // 다형성에 의해 변화에 둔감
		
		System.out.println("list : " + list);
		System.out.println("전체 원소의 개수 : " + list.size());
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		System.out.println("list : " + list);
		System.out.println("add() 후 전체 원소의 개수 : " + list.size());
	
		System.out.println("0번지 데이터 : " + list.get(0));
		System.out.println("0번지 삭제 데이터 : " + list.remove(0));	
		System.out.println("list : " + list);
		System.out.println("remove(0) 후 0번지 데이터 : " + list.get(0));
		list.add(2, "TEN");
		System.out.println("list : " + list);
		
		System.out.println("< 인덱스를 통한 전체 데이터 출력 >"); // 내부적으로 배열처럼 쓰기 때문에 인덱스를 통한 출력 가능
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
	
		System.out.println("< 1.5버전의 for 문을 전체 데이터 출력 >"); // 내부적으로 배열처럼 쓰기 때문에 1.5버전의 for문을  통한 출력 가능
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("three 문자열 존재여부 판단 : " + list.contains("three")); //있는지 없는지만 알고 몇 번째에 있는지는 모름
		list.remove("three");
		System.out.println("three 문자열 존재여부 판단 : " + list.contains("three"));
		
		System.out.println("list : " + list);
		List<String> subList = new ArrayList<String>();
		subList.add("하나");
		subList.add("둘");
		subList.add("셋");
		list.addAll(subList);
		System.out.println("addAll 후 list : " + list);
	
	}
		
		
		
		
}

