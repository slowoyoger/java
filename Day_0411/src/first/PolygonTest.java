package first;

class Polygon {
	private int x;
	private int y;

	public Polygon() {
		System.out.println("polygon Ŭ���� �⺻ ������!");// ������ ��� ����

	}

	public void printPolygon() {
		System.out.println("x=" + x + ",y = " + y);
	}
}

class Rectangle extends Polygon {
	private int width;
	private int height; // �����̺� ��� ����

	public Rectangle() {
		// �θ� Ŭ���� �����ڸ� ȣ���ϴ� �ڵ尡 ������� (���� �� ����� �ڹٰ� �˾Ƽ�)
		// super(); // �θ�Ŭ���� ���鶧�� ����.�θ� Ŭ���� ��������� ������� �ϸ� �� ���� �־�� �Ѵ�! �ֻ��!!
		System.out.println("rectangle Ŭ���� �⺻ ������!");// ������ ��� ����

	}

	public void printRectangle() {
		super.printPolygon(); // �θ� �ҷ��´�! �ڽĸ� �θ� �ҷ��� �� �ִ�.
		System.out.println("width=" + width + ",height=" + height);
	}
}
// public printPolygon()�� ��� �Ǿ���!

public class PolygonTest {

	public static void main(String[] args) {
		// Polygon p1 = new Polygon();
		// p1.printPolygon();

		Rectangle rect1 = new Rectangle();
//		rect1.printPolygon();   //��ӹ��� �޼ҵ�
//		rect1.printRectangle();  //�ڽ��� �޼ҵ�

	}

}
