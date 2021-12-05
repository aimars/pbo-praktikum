package minggu9;
import java.text.DecimalFormat;

public class PaintThings {
	public static void main(String[] args) {
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		Rectangle deck;
		Sphere bigBall;
		Cylinder tank;
		
		double deckAmt, ballAmt, tankAmt;
		
		//instatiate
		deck = new Rectangle(20,30);
		bigBall = new Sphere(15);
		tank = new Cylinder(10,30);
		
		//compute
		deckAmt = paint.amount(deck);
		ballAmt = paint.amount(bigBall);
		tankAmt = paint.amount(tank);
		
		//print
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("\nNumber of gallons of paint needed...");
		System.out.println("Deck " + fmt.format(deckAmt));
		System.out.println("Big ball " + fmt.format(ballAmt));
		System.out.println("Tank " + fmt.format(tankAmt));
	}
	
}