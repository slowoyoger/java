import java.util.Scanner;

/*[����]
 * int fee = 35000;
 * int total = 4;
 * int child = 1(7������) 10%����;
 * 
 * int amount; �ѿ��
 * ��� : �����~�� �Դϴ�.
 * 
 * 
 * 
 * �����ӱ� 9500��
 * ����3.3% ���ϱ�
 * ���ѽð��� Ű���忡 �Է��� �ɷ� ���ǰ�
 * 
 */
public class Example3 { // �̷������� �����ϰ� ��������!
	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	int fee = 35000;
	int total;
	int child;
		
	System.out.print("* �� ���̼���?");
	total = keyin.nextInt();	
	
	System.out.print("* 7������ ��̴� ����̿���?");
	child = keyin.nextInt();
		
	int amount = (total-child)*fee+(int)((fee*0.9)*child);
	
	System.out.println(amount+"�� �Դϴ�.");
		
	}

}
