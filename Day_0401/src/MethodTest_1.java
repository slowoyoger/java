import java.util.Scanner;

/*
 Ű����κ��� ������ �Է¹޾� 2~�ش������ ����� ��ȯ�ϴ� �޼ҵ带 ����ÿ�.
<���>
�����Է� : 6 (���, ������ �������� ��) ->value

���ο��� ������� �θ��� ȣ�� �ݺ���!!

����� ��� i���� ����
����� �ƴ� ��� : -1
*/

public class MethodTest_1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;

		System.out.print("������ �Է��Ͻÿ� : ");
		value = keyin.nextInt();

		for (int i = 2; i <= value; ++i) { //�ݺ����Ѽ� �� ������ ������!
			if (divisor(value, i) == -1)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static int divisor(int value, int i) {
		//for (i = 2; i < value; ++i) {
		if (value % i == 0)
			return i;
		return -1;
//���ϰ��� �ϳ��� �����ϱ� ����� ������ �� ���� ���ο��� �ݺ���Ŵ!
	}
}
