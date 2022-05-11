package second;

class Polygon {
	private int x;
	private int y;

	public Polygon() {
	} // �⺻������. �⺻�����ڰ� ������ ���⼭�� �ƴ϶� �ڽĿ��� ���������.

	public Polygon(int x, int y) { // �����ε��� ������
		this.x = x;
		this.y = y;
	}

	public void print() { // final ���̸� = ����� �ϵ� ��ġ�� ����
		System.out.println("x=" + x + ",y = " + y);
	}

	@Override
	public String toString() {
		return "x =" + x + ",y = " + y;
	}
}

class Rectangle extends Polygon {
	private int width;
	private int height; // �����̺� ��� ����

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		// �θ� Ŭ���� �����ڸ� ȣ���ϴ� �ڵ尡 ������� (���� �� ����� �ڹٰ� �˾Ƽ�)
		// super(); // �θ�Ŭ���� ���鶧�� ����.�θ� Ŭ���� ��������� ������� �ϸ� �� ���� �־�� �Ѵ�! �ֻ��!!
		this.width = width;
		this.height = height; // �ʱ�ȭ

	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);// ���� �θ�� ������ �ʱ�ȭ �Ϸ���
		this.width = width;
		this.height = height;

	}

	@Override
	public void print() {// �������̵� �Ǹ� �̸��� �������ϱ� �θ� ���߾� ���� �ڽĸ� ���δ�.
		// ���� �ܺο����� ���������� �������̵� ���ο����� �ƹ��� ȣ�Ⱑ��
		super.print();
		System.out.println("width=" + width + ",height=" + height);
	}

	@Override
	public String toString() {
		return "width=" + width + ",height=" + height;
	}
}
// public printPolygon()�� ��� �Ǿ���!

public class PolygonTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.print(); // r1�� �̿��ؼ� polygon�� print()�� ȣ�� �� �� ����!! �������̵� �Ʊ� ������ �θ� ��������.
					// ���� �������̵� �żҵ� �ӿ��ٰ� ���۷� �θ��� �Ѵ� �����ϴ�
		System.out.println();

		Rectangle r2 = new Rectangle(10, 5);
		r2.print();
		System.out.println();

		Rectangle r3 = new Rectangle(3, 3, 15, 25);
		r3.print();
		System.out.println("---------------------");

		Polygon p1 = new Polygon();
		p1.print();

		// r3.toString()// �츮 ������� ���ڿ��� ��ȯ�ؼ� �������ִ� ������Ʈ�żҵ�
		// ���ϵ� �����͸� �޾Ƽ� ����ϴ� �� �� ��Ʈ��

		System.out.println(r3); // println�� �ڿ� tostring���� �� ���൵ ����
		System.out.println(r3);
		System.out.println(r3.toString());

	}
}
