import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		
		//var to hold number of test cases
		//int t;
		long n = 0;
		//var to hold input
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number: ");
			n = sc.nextLong();
			
			System.out.println(n + " can be fitted in: " );
			
			if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
				System.out.println("*byte");
//				datatype = "byte";
			}
			if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
				System.out.println("*short");
			}
			if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
				System.out.println("*int");
			}
			if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
				System.out.println("*long");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			String[] value = e.getMessage().split(":");
			System.out.println(value[1] + " can't be fitted anywhere");
		}
	}
}