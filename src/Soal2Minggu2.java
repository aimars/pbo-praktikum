import java.util.Scanner;


class Soal2Minggu2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("================================");
		for(int i=0;i<3;i++) {
			String str = in.next();
			int x = in.nextInt();
			System.out.printf("%-15s", str);
			System.out.printf("%03d%n", x);
		}
		in.close();
		System.out.println("================================");
	}
}