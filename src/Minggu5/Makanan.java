package Minggu5;

class Makanan {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	private static byte id = 0;
	
	public Makanan() {
		nama_makanan = new String[10];
		harga_makanan = new double [10];
		stok = new int[10];
	}
	
	public String getNamaMakanan(byte id) {
		return nama_makanan[id];
	}
	
	public double getHargaMakanan(byte id) {
		return harga_makanan[id]; 
	}
	
	public int getStok(byte id) {
		return stok[id];
	}
	
	public void setNamaMakanan(String nama) {
		this.nama_makanan[id] = nama;
	}
	
	public void setHargaMakanan(double harga) {
		this.harga_makanan[id] = harga;
	}
	
	public void tambahStok(int stok, int id) {
		this.stok[id] += stok;
	}
	
	public static void nextId() {
		id++;
	}
	
	public static byte getId() {
		return id;
	}
	
	public byte findId(String inputNama) {
		for(byte i = 1; i <= id; i++) {
			if(inputNama.compareTo(this.nama_makanan[i])==0) {
				return i;
			}
		}
		return 0;
	}
	

}