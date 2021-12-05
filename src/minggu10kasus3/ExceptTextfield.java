package minggu10kasus3;

import java.util.*;

public class ExceptTextfield {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			System.out.println("Nilai x adalah :" + x); 
		} catch(Exception ex) {
			System.out.println("Input tidak valid");
		}
	
	}
}