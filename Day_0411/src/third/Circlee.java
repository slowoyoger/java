package third;

public class Circlee implements Calculate {
	private int radius;
	

	public Circlee() {
	}

	public Circlee(int radius) {
		this.radius = radius;
		

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public String toString() { //��� ������ ��Ʈ������ �����. ���� ��� �Ǵµ� ���߿� ����ã�ų� �� �� �ʿ�!!
		return "radius=" + radius;
	}

	@Override // �������̽����� ������ �� �԰��� �����ϴ°� �������̵�
	public double area() {
		return (this.radius * this.radius * PI); //�������̽��� pi�� ������ �ִ°��̴ϱ� ���� �� this�Ƚᵵ �ȴ�!

	}

	@Override
	public void print() {
		System.out.println("radius=" + radius + "area = " + this.area());
	}

}
