package minggu10kasus3;

public class ExceptPembagian {
	public static void main(String[] args) {
		try {
			System.out.println("Mencoba membagi : " + 981/0);
		}
		catch(Exception ex) {
			System.out.println("Format tidak valid.");
		}
	}
}