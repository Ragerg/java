package kr.ac.kopo.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {
	
	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("iotest/tulips.jpg"); // 파일시스템은 대소문자를 구분하지 않는다
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("iotest/tulips3.jpg");
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.println("tulips3.jpg에 복사완료...");
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초 ");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
			/*
			FileClose.close(bis);
			FileClose.close(fis);
			FileClose.close(bos);
			FileClose.close(fos);
			*/
			
			/*
			if(bis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(bos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			 */
		}
	}

}
