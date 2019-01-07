package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class FileReaderTest {
	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;

		try {
			//char 단위 읽기
			in = new FileReader("123.txt");
			int count = 0;
			int data = -1;
			while ((data = in.read()) != -1) {
				count++;
				System.out.print((char) data);
			}
			System.out.print("\n");
			System.out.println("count : " + count);

			System.out.println("==================");

			// byte 단위 읽기
			is = new FileInputStream("123.txt");
			count = 0;
			while ((data = is.read()) != -1) {
				count++;
				System.out.print((char) data);
			}
			System.out.print("\n");
			System.out.println("count : " + count);

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다. : " + e);
		} catch (Exception e) {
			System.out.println("입출력 오류 : " + e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
