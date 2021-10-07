package minggu4;

public class Barang {
	private String kode_barang;
	private String nama_barang;
	private int stok;
	
	public Barang(String kode, String nama, int stock) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stock;
	}
	
	public String getKode() {
		return kode_barang;
	}
	
	public String getNama() {
		return nama_barang;
	}
	
	public int getStok() {
		return stok;
	}
	
	public void setKode(String code) {
		code = kode_barang;
	}
	
	public void setNama(String name) {
		name = nama_barang;
	}
	
	public void setStok(int stock) {
		stock = stok;
	}
	
	public void tambahStok(int penambahan) {
		stok = stok + penambahan;
	}
}