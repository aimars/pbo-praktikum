package Minggu5;

public class Restaurant {
//	public String[] nama_makanan;
//	public double[] harga_makanan;
//	public int[] stok;
//	public static byte id = 0;
//	private String[] nama_makanan;
//	private double[] harga_makanan;
//	int[] stok;
//	public static byte id = 0;
	private Makanan menu;
	
	
	public Restaurant() {
//		nama_makanan = new String[10];
//		harga_makanan = new double [10];
//		stok = new int[10];
		menu = new Makanan();
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
//		this.nama_makanan[id] = nama;
//		this.harga_makanan[id] = harga;
//		this.stok[id] = stok;
		menu.setNamaMakanan(nama);
		menu.setHargaMakanan(harga);
		menu.tambahStok(stok, Makanan.getId());
		
	}
	
	public void tampilMenuMakanan() {
		for(byte i = 0; i <= Makanan.getId(); i++) {
			if(!isOutOfStock(i)) {
				System.out.println(menu.getNamaMakanan(i) + "[" + menu.getStok(i) + "]" +  "\t Rp." + menu.getHargaMakanan(i));
			}
		}
	}
	
	public boolean isOutOfStock(byte id) {
		if(menu.getStok(id) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
//	public static void nextId() {
//		id++;
//	}
	
	public void pesanMakanan(String nama, byte jumlah) {
		byte idGetter = menu.findId(nama);
		if(menu.getStok(idGetter) >= jumlah && idGetter != 0) {
			menu.tambahStok(-jumlah, idGetter);
		} else if (menu.getStok(idGetter) > 0) {
			System.out.println("Stok " + menu.getNamaMakanan(idGetter) + " tidak mencukupi.");
		} else {
			System.out.println("Stok " + menu.getNamaMakanan(idGetter) + " kosong.");
		}
	}
}