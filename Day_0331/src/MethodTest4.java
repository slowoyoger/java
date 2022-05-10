import java.util.Scanner;

/*[연습문제]
 정수 1개를 입력받아 (메인메소드에)
그 정수까지 존재하는 모든 소수를 출력하는 코드를 작성하시오
 - 입력받는 수는 10이상이어야 한다. -->만약 이 조건에 부합되지 않으면 적당한 메시지를 출력한 후 종료(메인 안에서 return 종료)
  
 <결과>
 정수를 입력 : 10 (for루프)
 2 3 5 7

 
 */
public class MethodTest4 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;
		int cnt = 0;

		boolean result;

		System.out.println("정수 입력 : ");
		value = keyin.nextInt();
		if (value < 10) {
			System.out.println("Error !!! 10 이상의 수만 입력하시오");
			return;
		}

		for (int i = 2; i <= value; ++i) {
			result = isPrimeNumber(i); // i???
			if (result) {
				System.out.print(i + " ");
				++cnt; // 계산???
				if (cnt % 5 == 0)
					System.out.println();
			}
		}
		System.out.println("\2~" + value + "까지 소수의 개수 : " + cnt);
	}

	public static boolean isPrimeNumber(int value) {
		int i;
		for (i = 2; i < value; ++i) { // 자기보다 작은수로 나눴을때!
			if (value % i == 0)
				return false; // 나눠 떨어지면 소수가 아니잔여! 정수잔여!
		}
		return true;
	}

}
