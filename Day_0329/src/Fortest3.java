import java.util.Scanner;

/*��������
 ������ �Է¹޴´�.
 �Է¹��� ������ �Ҽ����� �Ǻ��ϴ� ���α׷�
 (�Ҽ� = Prime Number) 1�� �ڱ��ڽ��� ������ �ٸ� ���� ������ �������� �ʴ� ��.
 ex) 3, 5, 7...  / % ==
 
 <���>
 ������ �Է� : 6
 6�� �Ҽ��� �ƴմϴ�.
  if (value > 0 && value %value
 
 
 ������ �Է� : 7 
 7�� �Ҽ��Դϴ�.
 
 
 */
public class Fortest3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;

		System.out.print("������ �Է� : ");
		value = keyin.nextInt();

		for (int i = 2; i < value; ++i) {

			if (value % i == 0) {// �Ҽ��� �ƴ��� �ǹ�
				System.out.println(value + "�� �Ҽ��� �ƴմϴ�!");
			}
		}
		System.out.println(value + "�� �Ҽ��Դϴ�.");

	}
}
