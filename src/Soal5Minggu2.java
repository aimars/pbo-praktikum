import java.util.*;

public class Soal5Minggu2 {
	public static void main(String[] args) {
		String input;
		String str;
		long hasilInput;
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		str = input.replaceAll("\\s", "");
		in.close();
		
		hasilInput = Long.parseLong(str);
		long newHasil =(hasilInput - 999999) % 5;
		if (newHasil == 0) {
			System.out.println("berhenti");
		} else {
			System.out.println("jalan");
		}	
	}
}