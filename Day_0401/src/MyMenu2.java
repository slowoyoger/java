import java.util.Scanner;

/*========[�������α׷�]========
 * 1. �Է� 
 * 2. ��ü���
 * 3. ��ȸ
 * 4. ����
 * 5. ���� 
 * 0. ����
 * -----------
 * ����>3
 * ��ȸ�� �����߽��ϴ�.
 * �ٽú����ֱ� 
 * while(true)
 * if(0) �϶��� ����---���) ���α׷��� �����մϴ�.
 * 
 */
public class MyMenu2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String choice; // ����ڰ� ���� �� ������ �ٸ��� �𸣰� �������� �����ϱ� int��� �� �ϰ�
						// String�̶�� ���ذ�
		test(10, 5);

		while (true) {
			menu();
			choice = keyin.next();

			switch (choice) {
			case "1":
				input();
				break;
			case "2":
				output();
				break;
			case "3":
				selectone();
				break;
			case "4":
				delete();
				break;
			case "5":
				update();
				break;
			case "0":
				System.out.println("���α׷��� �����մϴ�.");
				return; // ���� ������ return
			default:
				System.out.println("err) �޴��� �ٽ� ������ �ּ���.");
				return;
			// break = ����ġ�� ����������. �Ѱ㸸! ���ϱ��� �������� ����!!

			}
			keyin.nextLine();
		}
	}

	/**
	 * ȭ�鿡 �ֿ��� �޴��� ������ִ� �޼ҵ�
	 * 
	 */
	// �����ּ�! /** ���α׷��� �ٸ� ����� ����� ����� �ű� ������ �����ֽ��� ����� �ٴ� ���� ����.
	public static void menu() {
		System.out.println("========[�������α׷�]========");
		System.out.println("1. �Է� ");
		System.out.println("2. ��ü���");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("5. ����");
		System.out.println("0. ����");
		System.out.println("--------------------------");
		System.out.print("             ����> ");
	}

	/**
	 * ������ Ű����� �Է��ؼ� �����ϴ� �޼ҵ�
	 */
	public static void input() {
		System.out.println("1. �Է� ");
	}

	/**
	 * ó���� �������� ����� ���� ����Ѵ�.
	 */
	public static void output() {
		System.out.println("��ü ����� �����߽��ϴ�.");
	}

	/**
	 * ������ �߿��� �ʿ��� �����͸� ��ȸ�ؼ� �� ������ ��ȯ��.
	 */
	public static void selectone() {
		System.out.println("��ȸ�� �����߽��ϴ�.");
	}

	public static void delete() {
		System.out.println("������ �����߽��ϴ�.");
	}

	public static void update() {
		System.out.println("������ �����߽��ϴ�.");
	}

	/**
	 * �� �޼ҵ�� a�� �ŵ������� ���ϴ� �޼ҵ��.
	 * 
	 * @param a : �ؼ�
	 * @param b : ����
	 * @return �ŵ������� ���
	 */

	public static int test(int a, int b) {
		return 0;
	}
}
