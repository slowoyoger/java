
public class MethodTest1 {

	public static void main(String[] args) {
		int result;
		System.out.println("main() ����");
		add1();

		result = add2(); /// 30
		System.out.println("result=" + result);
		System.out.println("result=" + add2());// �� �Ʒ� ���� result �ߺ��Ǵϱ�
		
		int a = 5, b = 9;
		result = add3(a, b); // ( )�ȿ� �ִ³��� �ƱԸ�Ʈ����Ѵ�.
		System.out.println("add3() result=" + result);

		System.out.println("main() ��");

	}

	// [����������] [Ű����] ����Ÿ�� �޼ҵ��([�Ű���������]) 
	public static void add1() {
		int num1 = 10; // ��������. ���� ���������� ��밡���� ����. ���� �ۿ����� ���Ұ�.
		int num2 = 20;

		int result = num1 + num2;
		System.out.println("����� : " + result);

	}

	public static int add2() { // result Ÿ�� = ��Ƽ, ������ �̸��ϰ� ���߱� �ȱ׷� ������!!
		int num1 = 10; 
		int num2 = 20; // add1�� �ִµ��� �� ������ �� �� �ִ°Ŵ� �ٸ� �����̶�.

		int result = num1 + num2;
		return result; //
	}

	public static int add3(int num1, int num2) { // ��������, �Ű�����(parameter),

		int result = num1 + num2;
		return result; //

	}
}