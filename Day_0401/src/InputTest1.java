import java.util.Scanner;

public class InputTest1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);

		String name;
		int age;

		System.out.print("�̸� :  ");
		name = keyin.nextLine(); //�Ѱ��� �ܾ �Է��� �� �ִ�.
		//keyin.nextLine(); // ���� �̸� ��ī�Ͻ� �븮��Ű �Է��ϸ� �ΰ� �� �뿡 ���ٰ� ���� next���� �븮��Ű�� ��µǰ�
		//�븮��Ű�� nextline���� ���ư���~! �ؽ�Ʈ ������ �����ִ� ����
		System.out.print("���� : ");
		age = keyin.nextInt();

		System.out.println("����� �̸� : " + name + ", ���� : " + age + "�� �Դϴ�.");
	}

}
/*
 next() : �Ѱ��� ���ڿ� �ܾ �Է¹޴´�.WS(White Space,����):�����̽�,��,���� = ��׵��� �Է¹��� ���Ѵ�.
 nextline() : ������ �Է� �޴´�. ���͸� ģ ��ġ����!! stdin�� �� ���� ���ҵ� �����Ѵ�.
 
 ex>
 name = keyin.next();��� �ϰ�
 ���ӽ� �� �Է��ϰ�
 �ؿ� 
 age = keyin.next();��� �ϸ� ���ӽ��� �̸��� ���� �����̽��� ���� ���ۿ� ���� �״�� �����ֱ� ������
 age������ ���� �����ִ� �����̽��� ���� ���� ��������!
 			  stdin�� �� ���� ���ҵ� �����Ѵ�.
 * 
 */

