import java.util.Scanner;

/*Ű����κ��� �������Է¹ޱ� (int = end)
 * ����
 * ������ �Է� : 5(5���� ����ϱ�) 
 * 1 2 3 4 5 
 * ȭ�鿡 �������� ���
 * 
 * int end = 0;
 * while(end>=5) {
 * }
 * 
 */

public class Example3 {

	public static void main(String[] args) {
		int end = 0; // int end, i=0;(while�� �����ϴ� i)
		Scanner scanner = new Scanner(System.in);
		// System.out.println("������ �Է� : ");
		end = scanner.nextInt();

		while (end <= 5) { // while(i<end)
							// ++i
			System.out.println(end); // System.out.print(i+" ") // ���⿡ �ݺ� ���� ��
			++end;

		}
		System.out.println();
	}

}
