package kr.ac.kopo.day19.hw18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		
	
	List<Member> members = new ArrayList<>();
	members.add(new Member("aaa", "1111"));
	members.add(new Member("bbb", "2222")); 
	members.add(new Member("ccc", "3333"));
	members.add(new Member("ddd", "4444"));
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("*** 비밀번호 변경서비스 ***");
	System.out.print("아이디를 입력하세요 : ");
	String id = sc.nextLine();
	
	Member mem = null;
	for(int i = 0; i <members.size(); i++) {
		if(members.get(i).getId().equals(id)) {
			mem = members.get(i);
			break;
		}
	}
	
	if(mem == null) {
		System.out.println("입력하신 [" + id + "]는 존재하지 않습니다");
		System.out.println("서비스를 종료합니다");
		System.exit(0);
	}
	
	System.out.print("현재 비밀번호를 입력하세요 : ");
	String pw = sc.nextLine();
	if(!mem.getPw().equals(pw)) {
		System.out.println("입력하신 비밀번호가 올바르지 않습니다");
		System.out.println("서비스를 종료합니다");
		System.exit(0);
	}
	
	System.out.print("변경하실 비밀번호를 입력하세요 : ");
	String npw = sc.nextLine();
	mem.setPw(npw);
	System.out.println("비밀번호 변경이 완료되었습니다");
	
	System.out.println("-----------------");
	System.out.println("< 전체회원 정보 출력 >");
	System.out.println("-----------------");
	System.out.println(" 아이디\t비밀번호");
	System.out.println("-----------------");
	for(Member m : members) {
		System.out.println(m.getId() + "\t" + m.getPw());
	}
	System.out.println("-----------------");
	
	
	
	

	}
}
