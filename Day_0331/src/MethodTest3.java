import java.util.Scanner;

/*[연습문제]
 정수 1개를 입력받아 (메인메소드에)
 int value
 그 정수가 소수인지 판별하는 메소드 메인메솓드는 if // 메소드는 포문
 public static boolean isPrimeNumber(int value); // is라고 시작하는 애들은 불리언 썼을때
 1과 자기자신으로 나눴을 때 나머지 0
 
 
 소수이면 true
 아니면 false
 
 리턴이 두개
 
 */
public class MethodTest3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;

		System.out.println("정수 입력 : ");
		value = keyin.nextInt();

		
		if (isPrimeNumber(value)) //isPrimeNumber쓴거는 얘를 호출하겠다 저 메소드놈을 여기 메인에 데려와서 계산 값을 쓸것이다!!
			                      //value값을 쓴거는 저 밑에 isPrimeNumber를 사용할때 입력 값 value놈을 쓸것이다!!
			System.out.println(value + "는 소수입니다.");
		else
			System.out.println(value + "는 소수가 아닙니다.");
	}

	//메소드라는거는 메인을 위해 써먹는 자양분?? 아무튼 메인으로 가서 쉽게 활동하려고 만드는거다!!
	public static boolean isPrimeNumber(int value) { //여기 맨 뒤에 (int value는 value라는 이름이 중요한게 아니고
													// 메인에 있는 value랑 형을 맞추는게 중요!! 이름은 달라도 된당~!
		int i;
		for (i = 2; i < value; ++i) { // 자기보다 작은수로 나눴을때!
			if (value % i == 0)
				return false; // 나눠 떨어지면 소수가 아니잔여! 정수잔여!
		}
		return true;
	}

}
