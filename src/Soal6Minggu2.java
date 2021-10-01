import java.util.Scanner;
import java.math.*;

public class Soal6Minggu2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str1, str2;
		
		str1 = in.nextLine();
		str2 = in.nextLine();
		in.close();
		
		System.out.println(new BigInteger(str1).add(new BigInteger(str2)));
		System.out.println((new BigInteger(str1).multiply(new BigInteger(str2))));
		
	}
}