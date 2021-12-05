package minggu10kasus3;

public class ExceptVariable {
	public static void main(String[] args) {
		String i;
		try {
			i = new String();
			System.out.println("Nilai i adalah : " + i);
		} catch (Exception ex) {
			System.out.println("Variable not initialized.");
		}
	}
}