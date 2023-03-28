package kr.ac.kopo.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set : 순서X, 중복X
 	구현클래스
 		-HashSet
 		-TreeSet
 	메소드
 		-add()      : 데이터 삽입
 		-contains() : 데이터 존재여부 판단
 		-remove()   : 특정 데이터 삭제
 		-clear()    : 전체 데이터 삭제
		-size()     : 전체 원소 개수
		-isEmpty()  : 비어있는지 여부 판단
 */

public class SetMain {
	
		public static void main(String[] args) {
			
			Set<String> set = new HashSet<>(); // 1.7버전 부터는 우변의 타입명 생략가능
//			Set<String> set = new TreeSet<>(); // 출력 시 사전 순으로 출력
			set.add("one");
			System.out.println("add(two) : " + set.add("two"));
			set.add("three");
			set.add("four");
			set.add("five");
			set.add("two"); // 중복 허용 X
			System.out.println("add(two) : " + set.add("two")); // 중복된 데이터가 있었을 때 덮어쓰기되는 것이 아닌 아예 입력이 안됨 
			
			System.out.println("set : " + set); // 출력되는 순서는 입력하는 순서와 상관없다
			
			
			System.out.println("remove(two) : " + set.remove("two"));
			System.out.println("remove(two) : " + set.remove("two"));
			System.out.println("set : " + set); 
			
			// "two"가 존재하면 삭제하고 "삭제성공", 존재하지 않으면" 존재하지 않음" 출력
			
			System.out.println(set.remove("two") ? "삭제성공" : "존재하지 않음");
			
			/*
			if(set.contains("two")) {
				set.remove("two");
				System.out.println("\"two\" 데이터 삭제 성공");
			} else {
				System.out.println("\"two\" 데이터 존재하지 않음");
			}
			*/
			
			/*
			 * Set 전체데이터 접근방식
			 * 1. 1.5 버전의 for문 이용
			 * 2. toArray() 메소드 이용
			 * 3. Iterator 객체 이용
			 */
			
			System.out.println("< 1.5 버전의 for문 이용 >");
			for(String data : set) {
				System.out.println(data);
			}
			
			System.out.println("< toArrary() 메소드 이용 >");
			Object[] dataArr = set.toArray();
			for(int i = 0; i < dataArr.length; i++) {
				System.out.println(dataArr[i] + ", length() : " + ((String)dataArr[i]).length());
			}
			
			/*
			 * Iterator 주요 메소드
			 * hasNext() : 다음 데이터 존재여부 판단
			 * next()    : 데이터 이동
			 */
			System.out.println("< Iterator 객체 이용 >");
			Iterator<String> ite = set.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next());
			}
			
		}

}
