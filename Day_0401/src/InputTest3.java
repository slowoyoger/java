import java.util.Scanner;

public class InputTest3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String data = null;
		int number = 0;

		while (true) {
			System.out.println("���ڸ� �Է��ϼ��� : ");
			data = keyin.next();
			
			keyin.nextLine();//���ۺ��� ����! �տ� �� �� �ᵵ �ȴ�. ����ڰ� ��� ���� �� �տ��Ÿ� �������°�
			
			System.out.println(" ������ �Է��ϼ��� : ");
			number = keyin.nextInt();

			System.out.println("�Է��� �����ʹ� " + data + "," + number);
		}

	}

}
