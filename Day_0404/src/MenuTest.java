import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		MainMenu m = new MainMenu();
		Scanner keyin = new Scanner(System.in);
		String choice; // ����ڰ� ���� �� ������ �ٸ��� �𸣰� �������� �����ϱ� int��� �� �ϰ�
						// String�̶�� ���ذ�

		while (true) {
			m.menu(); //m=���۷��� ����
			choice = keyin.next();

			switch (choice) {
			case "1":
				m.input(); // m. = �׽�Ʈ�� �޴��� ������! ���⿡ new�� �����
				break;
			case "2":
				m.output();
				break;
			case "3":
				m.selectone();
				break;
			case "4":
				m.delete();
				break;
			case "5":
				m.update();
				break;
			case "0":
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("err) �޴��� �ٽ� ������ �ּ���.");
				return;
			}
			keyin.nextLine();
		}
	}
}
