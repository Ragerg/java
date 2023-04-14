package kr.ac.kopo.day18;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	
	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		
		System.out.println("-----------");
		System.out.println(dirObj.getPath() + " 폴더");
		System.out.println("-----------");
		String[] dataArr = dirObj.list(); 
		for(String data : dataArr) {
			System.out.println(data);
		}
		System.out.println("-----------");
		
		
		File dirObj1 = new File("iotest/새폴더/고양이");
		
		System.out.println(dirObj1.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다");
		dirObj1.mkdirs();
		System.out.println(dirObj1.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		
		
		File fileObj = new File("iotest/a.txt");
		
		System.out.println(fileObj.exists() ? "존재합니다" : "잘못된 이릅니다");
		System.out.println(fileObj.isFile() ? "파일입니다" : "파일이 아닙니다");
		System.out.println(fileObj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다");
		
		System.out.println("실제주소 : " + fileObj.getAbsolutePath());
		System.out.println("path : " + fileObj.getPath());
		System.out.println("폴더 : " + fileObj.getParent());
		System.out.println("파일이름 : " + fileObj.getName());
		
		System.out.println("파일크기 : " + fileObj.length() + "byte");
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = fileObj.lastModified();
		String pattern = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정날짜 : " + sdf.format(new Date(lastTime)));
		
	}

}
