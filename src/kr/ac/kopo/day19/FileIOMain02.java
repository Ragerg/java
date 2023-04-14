package kr.ac.kopo.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import kr.ac.kopo.util.FileClose;

public class FileIOMain02 {

	// iotest/Tulips.jpg 파일을 iotest/Tulips2.jpg에 복사
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("iotest/Tulips.jpg");
			fos = new FileOutputStream("iotest/Tulips2.jpg");

			long start = System.currentTimeMillis();

			while (true) { 
				int c = fis.read();
				if (c == -1)
					break;
				fos.write(c);
			}
			fos.flush(); // 출력 byte 스트림에 남아 있는 데이터를 밀어넣어준다
			long end = System.currentTimeMillis();
			System.out.println("Tulips2.jpg에 복사완료...");

			System.out.println("소요시간 : " + (end - start) / 1000. + "초 ");

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			
			FileClose.close(fis);
			FileClose.close(fos);
			
			/*
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			*/

		}

	}

}
