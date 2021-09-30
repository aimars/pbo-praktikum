import java.util.Scanner;

class Soal1Minggu2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		input = input.trim();
		if (input.length() == 0) {
			System.out.println(0);
		} else {
			String[] strings = input.split("[!'!?,._@ ]+");
			System.out.println(strings.length);
			for (String str : strings) 
				System.out.println(str);
		}
	}
}