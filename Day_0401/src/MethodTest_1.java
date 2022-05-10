import java.util.Scanner;

/*
 키보드로부터 정수를 입력받아 2~해당수까지 약수를 반환하는 메소드를 만드시오.
<결과>
정수입력 : 6 (약수, 나누어 떨어지는 값) ->value

메인에서 디바이저 부르는 호출 반복문!!

약수일 경우 i값을 리턴
약수가 아닐 경우 : -1
*/

public class MethodTest_1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;

		System.out.print("정수를 입력하시오 : ");
		value = keyin.nextInt();

		for (int i = 2; i <= value; ++i) { //반복시켜서 값 여러개 나오게!
			if (divisor(value, i) == -1)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static int divisor(int value, int i) {
		//for (i = 2; i < value; ++i) {
		if (value % i == 0)
			return i;
		return -1;
//리턴값은 하나만 나오니까 결과값 여러개 못 뱉어내서 메인에서 반복시킴!
	}
}
