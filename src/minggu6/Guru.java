package minggu6;

import java.util.*;

public class Guru {
	private String namaGuru;
	private String nomorPokok;
	private String alamatGuru;
	private List<MataPelajaran> mapelGuru;
	
	public Guru(String nama, String np, String alamat, List<MataPelajaran> mapel) {
		this.namaGuru = nama;
		this.nomorPokok = np;
		this.alamatGuru = alamat;
		this.mapelGuru = mapel;
	}
	
	public List<MataPelajaran> getMapel() {
		return mapelGuru;
	}
	
	public String getNamaGuru() {
		return namaGuru;
	}
	
	public String getNomorPokok() {
		return nomorPokok;
	}
	
	public String getAlamatGuru() {
		return alamatGuru;
	}
	
	public void setNamaGuru(String nama) {
		this.namaGuru = nama;
	}
	
	public void setNomorPokok(String np) {
		this.nomorPokok = np;
	}
	
	public void setAlamatGuru(String alamat) {
		this.alamatGuru = alamat;
	}
	
	public void printGuru(MataPelajaran mapelGuru) {
		System.out.println("Nama guru           : " + this.namaGuru);
		System.out.println("Nomor Pokok         : " + this.nomorPokok);
		System.out.println("Alamat              : " + this.alamatGuru);
		System.out.println("Guru mata pelajaran : " + mapelGuru.getNamaMapel());
	}
	
	public void hubunganGuruMurid() {
		System.out.println("Guru " + this.namaGuru + " dapat mengajar banyak Murid, dan Murid dapat diajari oleh banyak Guru");
	}
}