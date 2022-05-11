

public class Triangle extends MyPoint {
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
		return super.toString() + "width=" + width + ",height" + height;
	}
	
}
