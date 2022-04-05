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
		int sum;   // int time,amount; 이렇게 써도 된다
		int income;
			
		System.out.print("* 몇 시간 일하셨나요?");
		hour = keyin.nextInt();	

		sum = money*hour;
		income = sum - (int)(sum*tax);  //쌤이 작성(int)(sum-(sum*tax));
		
		System.out.println("* 총급여 : "+sum);
		System.out.println("* 세금 : "+(int)(sum*tax));
		System.out.println("* 실수령액 : "+income);
		
		System.out.println("Data"+(10-20));
	}

}
