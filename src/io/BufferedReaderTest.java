package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader br = null;

		// 기반 스트림
		FileReader fr;
		try {
			fr = new FileReader("./src/io/BufferedReaderTest.java");

			// 보조 스트림
			br = new BufferedReader(fr);

			// input
			int index = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				index++;
				System.out.print(index+": ");
				System.out.println(line);
				//System.out.println("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("notf");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(br != null) {
				br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
