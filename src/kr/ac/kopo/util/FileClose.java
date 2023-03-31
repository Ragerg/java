package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {
	
	public static void close(InputStream is) {
		if(is != null) {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(OutputStream os) {
		if(os != null) {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(InputStream bis, InputStream is) {
		FileClose.close(bis);
		FileClose.close(is);
	}
	
	public static void close(OutputStream bos, OutputStream os) {
		FileClose.close(bos);
		FileClose.close(os);
	}

	public static void close(Writer fw) {
		if(fw != null) {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void close(Reader fr) {
		if(fr != null) {
			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void close(Reader br, Reader fr) {
		FileClose.close(br);
		FileClose.close(fr);
		
	}
	
	public static void close(Writer bw, Writer fw) {
		FileClose.close(bw);
		FileClose.close(fw);
		
	}
	
}
