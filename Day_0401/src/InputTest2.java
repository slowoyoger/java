import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		String address;
		String name;
		String age;
		double height;

		Scanner keyin = new Scanner(System.in);
		System.out.println("�̸� : " );
		name = keyin.next();
		keyin.nextLine();
	
		System.out.println("�ּ� : " );
		address = keyin.nextLine();
		
		
		System.out.println("���� : " );
		age = keyin.next();
		keyin.nextLine();
		
		System.out.println("Ű : ");
		height = keyin.nextDouble();
		keyin.nextLine();
	
		
		System.out.println("�̸� : " + name + '\n' + "�ּ� : " + address +'\n' + "���� : " + age + '\n' + "Ű : " + height);
	
		// '\n' = ����
	}

}

/*
 * �̸� : ȫ�浿 �ּ� : ����� ������ ���ﵿ 1234���� ���� : 25�� Ű : 177.5cm
 */
