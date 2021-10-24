package minggu6;

public class Murid {
	private String namaMurid;
	private String NISN;
	private String alamatMurid;
	
	public String getNamaMurid() {
		return namaMurid;
	}
	
	public String getNISN() {
		return NISN;
	}
	
	public String getAlamatMurid() {
		return alamatMurid;
	}
	
	public void setNamaMurid(String nama) {
		this.namaMurid = nama;
	}
	
	public void setNISN(String nisn) {
		this.NISN = nisn;
	}
	
	public void setAlamatMurid(String alamat) {
		this.alamatMurid = alamat;
	}
	
	public void printMurid() {
		System.out.println("Nama murid  : " + this.namaMurid);
		System.out.println("Nomor Induk : " + this.NISN);
		System.out.println("Alamat      : " + this.alamatMurid);
	}
	
	public void hubunganMuridGuru() {
		System.out.println("Murid " + this.namaMurid + " dapat diajari oleh banyak Guru, dan Guru dapat mengajari banyak Murid");
	}
	
}