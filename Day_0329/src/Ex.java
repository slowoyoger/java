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

public class Ex {

	public static void main(String[] args) {
		int end, i = 0;
		Scanner keyin = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		end = keyin.nextInt();

		while (i < end)
			++i;
		System.out.print(i + " "); // ���⿡ �ݺ� ���� ��
		++end;
	}
//System.out.println();
}
