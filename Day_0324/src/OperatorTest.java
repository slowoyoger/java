import java.util.Scanner;

/*Ű���带 ���̸� �Է¹޾�
 * �� 19�� �̻��̸� "���ű��� �ֽ��ϴ�." / ������ "���ű��� �����ϴ�."
 */
public class OperatorTest {

	public static void main(String[] args) {
		int age;
		String msg;
		Scanner key = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���");
		
		age= key.nextInt();
		msg = (age >= 19) ? "���ű��� �ֽ��ϴ�."
						  : "���ű��� �����ϴ�.";
		
		System.out.println(age + "��" + msg);
	}

}
