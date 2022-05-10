import java.util.Scanner;

/*연습문제
 정수를 입력받는다.
 입력받은 정수가 소수인지 판별하는 프로그램
 (소수 = Prime Number) 1과 자기자신을 제외한 다른 값을 나누어 떨어지지 않는 값.
 ex) 3, 5, 7...  / % ==
 
 <결과>
 정수를 입력 : 6
 6은 소수가 아닙니다.
  if (value > 0 && value %value
 
 
 정수를 입력 : 7 
 7은 소수입니다.
 
 
 */
public class Fortest3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;

		System.out.print("정수를 입력 : ");
		value = keyin.nextInt();

		for (int i = 2; i < value; ++i) {

			if (value % i == 0) {// 소수가 아님을 의미
				System.out.println(value + "는 소수가 아닙니다!");
			}
		}
		System.out.println(value + "는 소수입니다.");

	}
}
