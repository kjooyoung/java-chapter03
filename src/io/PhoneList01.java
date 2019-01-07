package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("File Not Found");
				return;
			}

			System.out.println("======파일정보======");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));

			System.out.println("======전화번호======");

			// 기반스트림(byte)
			FileInputStream fis = new FileInputStream(file);
			
			// 보조스트림1(bytes -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			// 보조스트림2(라인입력)
			br = new BufferedReader(isr);
			
			// 처리
			String line = null;
			while((line = br.readLine()) != null) {
				StringTokenizer st =
						new StringTokenizer(line, "\t ");
				int index = 0;
				while(st.hasMoreElements() == true) {
					String token = st.nextToken();
					System.out.print(token);

					if(index == 0) { //이름
						System.out.print(":");
					} else if(index == 1) { //번호1
						System.out.print("-");
					} else if(index == 2) {
						System.out.print("-");
					}
					index++;
				}
				System.out.print("\n");
			}
		} catch (IOException e) {
			System.out.println("Error:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
