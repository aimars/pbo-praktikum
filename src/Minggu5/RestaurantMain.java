package Minggu5;

public class RestaurantMain {
	static void initMakanan(Restaurant menu) {
		menu.tambahMenuMakanan("Bala - bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
	}
	
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		initMakanan(menu);
		
		menu.tampilMenuMakanan();
		System.out.println();
		menu.pesanMakanan("Bala - bala", (byte) 10);
		menu.pesanMakanan("Tahu",(byte) 10);
		
		menu.tampilMenuMakanan();
	}
}