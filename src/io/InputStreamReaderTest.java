package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		try {
			//기반 스트림
			FileInputStream fis = 
					new FileInputStream("ms949.txt");
			//보조 스트림
			isr = new InputStreamReader(fis, "MS949");
			
			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:"+e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupoorted Encoding"+e);
		} catch (IOException e) {
			System.out.println("Error:"+e);
		} finally {
			try {
				if(isr != null) {
					isr.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
