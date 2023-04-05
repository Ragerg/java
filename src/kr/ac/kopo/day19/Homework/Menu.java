package kr.ac.kopo.day19.Homework;

import java.io.File;
import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void menu() {
		try {
			Print.print(); // 현재 경로의 내용 출력
		} catch (Exception e) { // 없는 디렉토리 입력 시 출력
			System.out.println("없는 폴더입니다.");
			highDir(); // 다시 상위 디렉토리로 이동
			menu();
			
		}
		System.out.print("[c] 새폴더   [m] 하위디렉토리 이동   [U]상위디렉토리 이동   [R] 이름변경");
		char m = sc.nextLine().charAt(0);
		
		switch (m) {
		case 'c' :
			this.newFolder();
			break;
		case 'm' :
			this.lowDir();
			break;
		case 'U' :
			this.highDir();
			break;
		case 'R' :
			this.reName();
			break;
		default:
			System.out.println("종료하겠습니다");
			System.exit(0);		
		}
		menu();
		
	}
	public void newFolder() {
		System.out.println("새로 만들 폴더이름을 입력해 주세요");
		String newfolder = sc.nextLine();
		File dirObj = new File(Print.getPath() + newfolder); // 현재 경로에 새로 만들 폴더 이름 추가하여 새 경로 생성
		dirObj.mkdirs(); // 새로운 폴더 생성
	}
	
	public void lowDir() {
		System.out.println("이동할 하위 디렉토리를 입력해 주세요");
		String low = sc.nextLine();
		Print.setPath(Print.getPath() + low); // 현재 경로에 이동할 경로 추가하여 하위디렉토리 경로로 이동
	}
	
	public void highDir() {
		File high = new File(Print.getPath()); // 현재 경로를 가진 새로운 파일객체 생성
		if(high.getParent() != null) {
			Print.setPath(high.getParent()); // 새로운 파일객체의 상위 경로로 변경
		} else {
			System.out.println("없는 경로입니다.");
		}
	}
	
	public void reName() {
		System.out.println("변경하실 파일을 선택해 주세요");
		String ori = sc.nextLine();
		File origin = new File(Print.getPath() + ori);  // 원래 파일의 경로
		
		System.out.println("새로운 이름을 입력해 주세요");
		String re = sc.nextLine();
		File rename = new File(Print.getPath() + re); // 변경할 파일의 경로
		boolean result = origin.renameTo(rename); // 이름 변경
		if(result) {
			System.out.println("이름이 변경 되었습니다");
		} else {
			System.out.println("이름이 변경에 실패했습니다");
			
		}
	
		
		
		
		
	}
	
	

}
