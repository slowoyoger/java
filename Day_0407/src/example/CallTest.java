package example;

public class CallTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int[] ary = { 10, 20 };

		System.out.println("��ȯ �� : a=" + a + ",b=" + b);
		exchange(a, b);// ���� �����ϸ鼭 ȣ���Ѵ� // Call by Value //������ ���� ���Ѵ�.
		System.out.println("��ȯ �� : a=" + a + ",b=" + b);

		System.out.println("�迭��ȯ �� : ary[0]=" + ary[0] + ",ary[1]=" + ary[1]);
		exchange(ary);// ���� �����ϸ鼭 ȣ���Ѵ� // ��Call by Reference�� �����ϴ� ������ ������ ������ ������ �� �ִ�.
		System.out.println("�迭��ȯ �� : ary[0]=" + ary[0] + ",ary[1]=" + ary[1]);

	}

	public static void exchange(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	public static void exchange(int[] ary) { // �����ε�
		int temp; 
		temp = ary[0];  //���۷����� ������ �ּҸ� ������ �� ���� �ҷ����°�! ������ ������ �����ϴ�
		ary[0] = ary[1];
		ary[1] = temp;

	}
}
