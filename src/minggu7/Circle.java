package minggu7;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	public double getRadius() {
		return radius;
	}
	
	//Task 1.1
	public Circle(double rad, String colour) {
		radius = rad;
		color = colour;
	}
	//Task 1.1
	public String getColor() {
		return color;
	}
	//Task 1.1
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}