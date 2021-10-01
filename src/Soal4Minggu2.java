import java.util.Scanner;

public class Soal4Minggu2 {
	public static void main(String[] args) {
		
		int gajiPokok = 500000;
		int bonus = 0;
		int gajiTotal = 0;
		int hargaItem = 50000;
		Scanner in = new Scanner(System.in);
		int angkaPenjualan = in.nextInt();
		in.close();
		
		if(angkaPenjualan > 40) {
			bonus = (int)((angkaPenjualan * hargaItem) * 0.25);
			gajiTotal = gajiPokok + bonus;
		} else if (angkaPenjualan > 80) {
			bonus = (int) ((angkaPenjualan * hargaItem) * 0.35);
			gajiTotal = gajiPokok + bonus;
		} else if (angkaPenjualan < 15){
			bonus = (int)((angkaPenjualan * hargaItem) * 0.15);
			gajiTotal = gajiPokok - bonus;
		} else {
			bonus = (int) ((angkaPenjualan * hargaItem) * 0.10);
			gajiTotal = gajiPokok + bonus;
		}
		
		System.out.println(gajiTotal);
		
		
	}
}