package kr.ac.kopo.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import kr.ac.kopo.util.FileClose;

//  iotest/FileIOMain02.java.txt ==> iotest/FileIOMain02-1.java.txt 복사

public class FileIOMain05 {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("iotest/FileIOMain02.java.txt");
			fw = new FileWriter("iotest/FileIOMain02-1.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
		
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
				
//				int c = br.read();
//				if(c == -1) break;
//				bw.write(c);
			}
			
			bw.flush();
			System.out.println("파일 복사완료...");
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}
		
	}

}
