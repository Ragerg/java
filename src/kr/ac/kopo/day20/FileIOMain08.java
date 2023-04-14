package kr.ac.kopo.day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIOMain08 {
	
	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 20, "010-1111-2222");
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("iotest/userInfo.txt");
			pw = new PrintWriter(fw);
			
			pw.printf("%s#%d#%s\n" , user.getName() , user.getAge() , user.getPhone());
			pw.flush();
			
			System.out.println("userInfo.txt에 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(pw, fw);
		}
		
	}
	
	public static void read() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			String data = br.readLine();
			String[] dataArr = data.split("#");
			
			String name = dataArr[0];
		//	int age = Integer.valueOf(dataArr[1]);
			int age = Integer.parseInt(dataArr[1]);
			String phone = dataArr[2];
			
			UserInfo user = new UserInfo(name, age, phone);
			
			System.out.println(user);		
			System.out.println(Arrays.toString(dataArr));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
		}
	}
	
	
	public static void main(String[] args) {
		
		read();
		//write();
	}

}
