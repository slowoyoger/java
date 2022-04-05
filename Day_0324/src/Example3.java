import java.util.Scanner;

/*[연습]
 * int fee = 35000;
 * int total = 4;
 * int child = 1(7세이하) 10%할인;
 * 
 * int amount; 총요금
 * 결과 : 요금은~원 입니다.
 * 
 * 
 * 
 * 최저임금 9500원
 * 세금3.3% 제하기
 * 일한시간은 키보드에 입력한 걸로 계산되게
 * 
 */
public class Example3 { // 이런식으로 깨끗하게 정리하자!
	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	int fee = 35000;
	int total;
	int child;
		
	System.out.print("* 몇 분이세요?");
	total = keyin.nextInt();	
	
	System.out.print("* 7세이하 어린이는 몇명이에요?");
	child = keyin.nextInt();
		
	int amount = (total-child)*fee+(int)((fee*0.9)*child);
	
	System.out.println(amount+"원 입니다.");
		
	}

}
