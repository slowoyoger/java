import java.util.Scanner;

/*[��������]
 ���� 1���� �Է¹޾� (���θ޼ҵ忡)
�� �������� �����ϴ� ��� �Ҽ��� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
 - �Է¹޴� ���� 10�̻��̾�� �Ѵ�. -->���� �� ���ǿ� ���յ��� ������ ������ �޽����� ����� �� ����(���� �ȿ��� return ����)
  
 <���>
 ������ �Է� : 10 (for����)
 2 3 5 7

 
 */
public class MethodTest4 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;
		int cnt = 0;

		boolean result;

		System.out.println("���� �Է� : ");
		value = keyin.nextInt();
		if (value < 10) {
			System.out.println("Error !!! 10 �̻��� ���� �Է��Ͻÿ�");
			return;
		}

		for (int i = 2; i <= value; ++i) {
			result = isPrimeNumber(i); // i???
			if (result) {
				System.out.print(i + " ");
				++cnt; // ���???
				if (cnt % 5 == 0)
					System.out.println();
			}
		}
		System.out.println("\2~" + value + "���� �Ҽ��� ���� : " + cnt);
	}

	public static boolean isPrimeNumber(int value) {
		int i;
		for (i = 2; i < value; ++i) { // �ڱ⺸�� �������� ��������!
			if (value % i == 0)
				return false; // ���� �������� �Ҽ��� �ƴ��ܿ�! �����ܿ�!
		}
		return true;
	}

}
