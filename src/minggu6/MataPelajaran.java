package minggu6;
//import java.util.*;

public class MataPelajaran {
	private String namaMapel;
	private String kodeMapel;
	
	public MataPelajaran(String nama, String kode) {
		this.namaMapel = nama;
		this.kodeMapel = kode;
	}
	
	public String getNamaMapel() {
		return namaMapel;
	}
	
	public String getKodeMapel() {
		return kodeMapel;
	}
	
	public void setNamaMapel(String mapel) {
		this.namaMapel = mapel;
	}
	
	public void setKodeMapel(String kode) {
		this.kodeMapel = kode;
	}
	
}