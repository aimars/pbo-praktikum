package minggu9kasus2;

public class AvengedSimulator {
	public static void main(String[] args) {
		SuperHero[] Heroes = new SuperHero[5];
		Heroes[0] = new ManRay(43, "Sagan");
		Heroes[1] = new FlyingDutchMan(225, "Nova");
		Heroes[2] = new ManRay(99999999, "Mortred");
		Heroes[3] = new DirtyBubble(542, "Lanaya");
		Heroes[4] = new FlyingDutchMan(7070, "Rizzrack");
		
		for(int i=0; i < Heroes.length; i++) {
			Heroes[i].identity();
			Heroes[i].showPower();
			System.out.println();
		}
	}
}