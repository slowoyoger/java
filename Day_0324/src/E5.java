/*
 * 
 */

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int money = 9500;
		double tax = 0.033;
		int hour;
		int sum;   // int time,amount; �̷��� �ᵵ �ȴ�
		int income;
			
		System.out.print("* �� �ð� ���ϼ̳���?");
		hour = keyin.nextInt();	

		sum = money*hour;
		income = sum - (int)(sum*tax);  //���� �ۼ�(int)(sum-(sum*tax));
		
		System.out.println("* �ѱ޿� : "+sum);
		System.out.println("* ���� : "+(int)(sum*tax));
		System.out.println("* �Ǽ��ɾ� : "+income);
		
		System.out.println("Data"+(10-20));
	}

}
