package minggu6;

import java.util.*;

class Jurusan {
	public String namaJurusan;
	public String kodeJurusan;
	
	Jurusan(String nama, String kode) {
		this.namaJurusan = nama;
		this.kodeJurusan = kode;
	}
	
	public String getNamaJurusan() {
		return namaJurusan;
	}
	
	public String getKodeJurusan() {
		return kodeJurusan;
	}
	
}

class PerguruanTinggi {
	private String namaPt;
	private List<Jurusan> jurusans;
	
	PerguruanTinggi(String nama, List<Jurusan> jurusans) {
		this.namaPt = nama;
		this.jurusans = jurusans;
	}
	
	public List<Jurusan> getJurusan() {
		return jurusans;
	}
	
	public String getNamaPt() {
		return namaPt;
	}
	
}

public class Composition {
	public static void main(String[] args) {
		Jurusan fisip = new Jurusan("Fakultas Ilmu Sosial dan Ilmu Politik", "FISIP");
		Jurusan fmipa = new Jurusan("Fakultas Matematika dan Ilmu Pengetahuan Alam", "FMIPA");
		
		List<Jurusan> jurusans = new ArrayList<Jurusan>();
		jurusans.add(fisip);
		jurusans.add(fmipa);
		
		PerguruanTinggi unpad = new PerguruanTinggi("Universitas Padjajaran", jurusans);
		
		List<Jurusan> jrsns = unpad.getJurusan();
		System.out.println("Nama Perguruan Tinggi : " + unpad.getNamaPt());
		for(Jurusan jrsn : jrsns) {
			System.out.println("Nama Jurusan : " + jrsn.namaJurusan);
			System.out.println("Kode Jurusan : " + jrsn.kodeJurusan);
		}
	}
}