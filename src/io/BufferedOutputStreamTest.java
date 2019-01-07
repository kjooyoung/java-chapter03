package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = null;
		try {
			//기반 스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream("text.txt");
			
			//보조 스트림(기반 스트림에 연결)
			bos = new BufferedOutputStream(fos);
			
			//output
			for(int i='a'; i<'z'; i++) {
			//for(int i=97; i<=122; i++)
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: "+e);
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
