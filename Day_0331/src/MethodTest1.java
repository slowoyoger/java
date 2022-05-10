
public class MethodTest1 {

	public static void main(String[] args) {
		int result;
		System.out.println("main() 시작");
		add1();

		result = add2(); /// 30
		System.out.println("result=" + result);
		System.out.println("result=" + add2());// 위 아래 같음 result 중복되니까
		
		int a = 5, b = 9;
		result = add3(a, b); // ( )안에 있는놈을 아규먼트라고한다.
		System.out.println("add3() result=" + result);

		System.out.println("main() 끝");

	}

	// [접근지정자] [키워드] 리턴타입 메소드명([매개변수선언]) 
	public static void add1() {
		int num1 = 10; // 지역변수. 여기 지역에서만 사용가능한 변수. 지역 밖에서는 사용불가.
		int num2 = 20;

		int result = num1 + num2;
		System.out.println("결과는 : " + result);

	}

	public static int add2() { // result 타입 = 인티, 맨위에 이름하고 맞추기 안그럼 에러남!!
		int num1 = 10; 
		int num2 = 20; // add1에 있는데도 또 같은걸 쓸 수 있는거는 다른 지역이라서.

		int result = num1 + num2;
		return result; //
	}

	public static int add3(int num1, int num2) { // 전달인자, 매개변수(parameter),

		int result = num1 + num2;
		return result; //

	}
}