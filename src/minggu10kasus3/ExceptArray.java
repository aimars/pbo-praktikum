package minggu10kasus3;

public class ExceptArray {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		try {
			for(int count = 0; count <= 5; count++) {
				System.out.println("Konten dari array berindeks " + count + " adalah : " + a[count]);
			}
		} catch(Exception ex) {
			System.out.println("Indeks tidak valid.");
		}
		
	}
}