package kr.ac.kopo.day18.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HwMain {
	
	public static void main(String[] args) {
		
		List<Members> members = new ArrayList<Members>();
		members.add(new Members("aaa", "1111"));
		members.add(new Members("bbb", "2222")); 
		members.add(new Members("ccc", "3333"));
		members.add(new Members("ddd", "4444"));		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 비밀번호 변경서비스 ***");
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		int cnt = 0;
		for(int i = 0; i < members.size(); i++) {
			if ((members.get(i)).getId().equals(id)) {
				cnt = i;
				break;
			}
			
			
		}
		
		if(cnt == members.size()) {
			System.out.println("입력하신 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("현재 비밀번호를 입력하세요 : ");
		String pw = sc.nextLine();
		if(!(members.get(cnt)).getPw().equals(pw)) {
			System.out.println("입력하신 비밀번호가 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경하실 비밀번호를 입력하세요 : ");
		String npw = sc.nextLine();
		members.get(cnt).setPw(npw);
		
		System.out.println("비밀번호 변경이 완료되었습니다");
		
		System.out.println("< 전체 회원 목록 >");
		System.out.println("---------------");
		System.out.println(" 아이디\t비밀번호");
		System.out.println("---------------");
		for(Members data : members) {
			System.out.println(data.getId() + "\t" + data.getPw());
		}
		System.out.println("---------------");
		
		
		
		
	}

}
