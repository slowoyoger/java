package third;

public class Triangle implements Calculate {
	private int width;
	private int height;

	public Triangle() {
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "width=" + width + ",height" + height;
	}

	@Override
	public double area() {
		return (this.width * this.height) * 0.5;
	}

	@Override
	public void print() {
		System.out.println("width=" + width + ",height" + height + "area = " + this.area());
	}
	
}
