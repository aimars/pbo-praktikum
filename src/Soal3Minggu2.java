import java.util.*;

public class Soal3Minggu2 {
	public static void main(String[] args) {
		String input;
		int a, b;
		
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		String splitter[] = input.split(" ");
		a = Integer.parseInt(splitter[0]);
		b = Integer.parseInt(splitter[2]);
		in.close();
		
		if(a >= 1 && a <= 1000 && b >= 1 && b <= 1000) {
			switch(splitter[1]) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "%":
				System.out.println(a % b);
				break;
			case "/":
				System.out.println(a / b);
				break;
			default:
				System.out.println("invalid operator");
				break;
			}
		} else {
			System.out.println("invalid input");
		}
	
		
		
		
	}
}