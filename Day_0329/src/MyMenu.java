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
public class MyMenu {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("========[�������α׷�]========");
			System.out.println("1. �Է� ");
			System.out.println("2. ��ü���");
			System.out.println("3. ��ȸ");
			System.out.println("4. ����");
			System.out.println("5. ����");
			System.out.println("0. ����");
			System.out.println("--------------------------");
			System.out.print("             ����> ");

			choice = keyin.nextInt(); //Exeption ó������ �ʾ���! ����ڰ� �̻��Ѱ� ������ �ͼ��� ����

			switch (choice) {
			case 1:
				System.out.println("�Է��� �����߽��ϴ�.");
				break;
			case 2:
				System.out.println("��ü ����� �����߽��ϴ�.");
				break;
			case 3:
				System.out.println("��ȸ�� �����߽��ϴ�.");
				break;
			case 4:
				System.out.println("������ �����߽��ϴ�.");
				break;
			case 5:
				System.out.println("������ �����߽��ϴ�.");
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return; //���� ������ return
			default:
				System.out.println("err) �޴��� �ٽ� ������ �ּ���.");
				return;
			// break = ����ġ�� ����������. �Ѱ㸸! ���ϱ��� �������� ����!!

			}
		}
	}
}
