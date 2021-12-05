package minggu10kasus2;

import java.util.*;

public class HexadecimalExcept{
	public static int Hexdec(String hex){
		try {
			return Integer.parseInt(hex, 16);
		} catch(NumberFormatException ex) {
			System.out.println(ex + " handled, value set to 0.");
			return 0;
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Konversi nilai hexadecimal ke decimal\n");
		System.out.println("Masukkan angka hexadecimal anda di bawah : ");
		String hex = sc.next();
		int dec = Hexdec(hex);
		System.out.println("Hasil konversi anda adalah bilangan desimal berikut : " + dec);
	}
	
}