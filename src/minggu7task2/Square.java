package minggu7task2;

public class Square extends Rectangle {
	
	Square() {
		super();
	}
	
	Square(double side) {
		super(side, side);
	}
	
	Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}
	
	public String toString() {
		return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
	}
	
}
