package minggu7task2;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		super();
		radius = 1.0;
	}
	
	public Circle(double rad) {
		super();
		this.radius = rad;
	}
	
	public Circle(double r, String color, boolean filled) {
		super(color, filled);
		this.radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return Math.PI*Math.PI*radius;
	}
	
	public String toString() {
		return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
	}
}