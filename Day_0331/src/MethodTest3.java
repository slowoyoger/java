import java.util.Scanner;

/*[��������]
 ���� 1���� �Է¹޾� (���θ޼ҵ忡)
 int value
 �� ������ �Ҽ����� �Ǻ��ϴ� �޼ҵ� ���θޙ���� if // �޼ҵ�� ����
 public static boolean isPrimeNumber(int value); // is��� �����ϴ� �ֵ��� �Ҹ��� ������
 1�� �ڱ��ڽ����� ������ �� ������ 0
 
 
 �Ҽ��̸� true
 �ƴϸ� false
 
 ������ �ΰ�
 
 */
public class MethodTest3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;

		System.out.println("���� �Է� : ");
		value = keyin.nextInt();

		
		if (isPrimeNumber(value)) //isPrimeNumber���Ŵ� �긦 ȣ���ϰڴ� �� �޼ҵ���� ���� ���ο� �����ͼ� ��� ���� �����̴�!!
			                      //value���� ���Ŵ� �� �ؿ� isPrimeNumber�� ����Ҷ� �Է� �� value���� �����̴�!!
			System.out.println(value + "�� �Ҽ��Դϴ�.");
		else
			System.out.println(value + "�� �Ҽ��� �ƴմϴ�.");
	}

	//�޼ҵ��°Ŵ� ������ ���� ��Դ� �ھ��?? �ƹ�ư �������� ���� ���� Ȱ���Ϸ��� ����°Ŵ�!!
	public static boolean isPrimeNumber(int value) { //���� �� �ڿ� (int value�� value��� �̸��� �߿��Ѱ� �ƴϰ�
													// ���ο� �ִ� value�� ���� ���ߴ°� �߿�!! �̸��� �޶� �ȴ�~!
		int i;
		for (i = 2; i < value; ++i) { // �ڱ⺸�� �������� ��������!
			if (value % i == 0)
				return false; // ���� �������� �Ҽ��� �ƴ��ܿ�! �����ܿ�!
		}
		return true;
	}

}
