
public class OverloadingTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		double d1 = 22.5, d2 = 36.7;
		String s1 = "Hellow", s2 = "World";

		add(a, b);
		add(d1, d2);
		add(s1, s2);
	}

//�޼ҵ� �����ε�(Method Overloading)
// �Ű� ������ Ÿ���� �ٸ��ų�, ������ �ٸ��� �޼ҵ��� �̸��� ���Ƶ� �ٸ� �޼ҵ�� ���.
//	�� ū �Ű������� ���� �ִ¾ָ� ȣ���ؼ� �װɷ� ���ȴ�
// ȣ���ϴ� �ʿ��� �ޙ����� �����ؼ� ȣ������ �� �ֵ��� �����ؾ��Ѵ�.
	public static void add(double d1, double d2) { //double a = 10 / add(double d1)�� ���´� ����
		System.out.println(d1 + d2);

	}

	public static void add(String s1, String s2) {
		System.out.println(s1+2);
	}

	public static void add() {
		System.out.println();
	}

}
