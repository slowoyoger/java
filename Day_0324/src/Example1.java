
public class Example1 {

	public static void main(String[] args) {
		int temp = 5784;
		int b = 30;
		String message = (temp % 2 == 0) ? temp + "짝수입니다." : "홀수입니다.";
		//temp를 2로 나눈다면 나머지가 0입니까? 맞다면 짝수입니다 아니라면 홀수입니다
		
	 // 변수 b에 임의의 정수를 넣고 3의 배수인지
		String message1 = (b % 3 == 0) ? b+"은 3의 배수입니다."
									  :  b+"는 3의 배수가 아닙니다.";
		System.out.println(message1);

	}

}
