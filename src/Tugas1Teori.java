import java.util.Scanner;
//mohammad aimar aziz 201511015 d3 2a jtk
public class Tugas1Teori {
	public static void main(String[] args) {
		String namaMhs;
		byte nilaiTugas, nilaiUTS, nilaiUAS;
		double nilaiAkhir;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Masukkan nama Mahasiswa: ");
		namaMhs = in.nextLine();
		
		System.out.println("Masukkan nilai tugas: ");
		nilaiTugas = in.nextByte();
		
		System.out.println("Masukkan nilai UTS: ");
		nilaiUTS = in.nextByte();
		
		System.out.println("Masukkan nilai UAS: ");
		nilaiUAS = in.nextByte();
		
		nilaiAkhir = (byte) (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);
		System.out.println("Nilai akhir mahasiswa " + namaMhs + " adalah : ");
		
		if(nilaiAkhir>85) {
			System.out.println("A");
		} else if(nilaiAkhir >= 75 && nilaiAkhir <= 84) {
			System.out.println("B");
		} else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
			System.out.println("C");
		} else if (nilaiAkhir >= 51 && nilaiAkhir <= 64) {
			System.out.println("D");
		} else if (nilaiAkhir < 50) {
			System.out.println("E");
		} /*else {
			System.out.println("Salah perhitungan!");
		}*/
	}
}