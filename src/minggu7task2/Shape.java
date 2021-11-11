package minggu7task2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String c, boolean fill) {
		color = c;
		filled = fill;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String stringFilled(boolean filled) {
		if (filled = true) {
			return "Filled";
		} else {
			return "Not filled";
		}
	}
	
	public String toString() {
		if(isFilled())
			return "A Shape with color of " + getColor() + " and Filled";
		else 
			return "A Shape with color of " + getColor() + " and Not filled";
	}
}