package minggu9;

abstract class Shape {
	private String ShapeName;
	
	public Shape(String name) {
		this.ShapeName = name;
	}
	
	public abstract double area();
	
	public String toString() {
		return "this shape of : " + ShapeName;
	}
}