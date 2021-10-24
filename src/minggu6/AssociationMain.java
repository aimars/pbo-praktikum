package minggu6;

public class AssociationMain {
	public static void main(String[] args) {
		Murid abdul = new Murid();
		abdul.setNamaMurid("Abdul");
		abdul.setNISN("00278916");
		abdul.setAlamatMurid("Bojongloa Kaler");
		
		abdul.printMurid();
		System.out.println();
		abdul.hubunganMuridGuru();
		System.out.println();
		
		Guru wawan = new Guru();
		wawan.setNamaGuru("Wawan");
		wawan.setNomorPokok("1098932781110");
		wawan.setAlamatGuru("Citarip");
		
		wawan.printGuru();
		System.out.println();
		wawan.hubunganGuruMurid();
	}
}