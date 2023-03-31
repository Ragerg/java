package kr.ac.kopo.day19.Homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Print {
	private static String path = "IoTest"; // 최상위 경로의 이름 생성
	

	public static void print() throws Exception { // 없는 폴더 입력하여 에러 발생 시 print() 호출한 쪽으로 예외처리 넘김
		File dirObj = new File(path); // 최상위 경로의 이름을 가진 파일객체 dirObj 생성
			
		System.out.println("----------------------------------------");
		System.out.println(dirObj.getPath()); // dirObj 이름 출력
		System.out.println("----------------------------------------");
		String[] dataArr = dirObj.list(); // dirObj가 가진 내용물들의 이름 확인
			for(String data : dataArr) {
				File file = new File(path + "/" + data); // 최상위경로.내용물 들의 파일객체 생성
				if(file.isDirectory()) { // 파일객체가 디렉토리인 경우 출력
					System.out.printf("%-10s<DIR>\n",file.getName());
				} else { // 파일객체가 디렉토리가 아닌 경우 출력
					System.out.printf("%-25s%10s%s   ",file.getName(), file.length(), "bytes");
					long lastTime = file.lastModified();
					String pattern = "yyyy-MM-dd hh:mm:ss";
					SimpleDateFormat sdf = new SimpleDateFormat(pattern);
					System.out.println(sdf.format(new Date(lastTime)));
				}
			}
			
			
		System.out.println("----------------------------------------");
	}

	public static String getPath() { // 현재 경로
		return path + "/";
	}
	
	public static void setPath(String path) { // 새로 지정된 경로
		Print.path = path;
	}
}
