package minggu10kasus3;

import java.io.*;

public class ExceptFile {
	public static void main(String[] args) {
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream("file.txt");
		} catch(Exception ex) {
			System.out.println("File Not Found");
		}
	}
}