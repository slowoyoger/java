
public class OverloadingTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		double d1 = 22.5, d2 = 36.7;
		String s1 = "Hellow", s2 = "World";

		add(a, b);
		add(d1, d2);
		add(s1, s2);
	}

//메소드 오버로딩(Method Overloading)
// 매개 변수의 타입이 다르거나, 개수가 다르면 메소드의 이름이 같아도 다른 메소드로 취급.
//	더 큰 매개변수를 갖고 있는애를 호출해서 그걸로 계산된다
// 호출하는 쪽에서 메솓르를 구별해서 호루출할 수 있도록 개발해야한다.
	public static void add(double d1, double d2) { //double a = 10 / add(double d1)와 형태는 같음
		System.out.println(d1 + d2);

	}

	public static void add(String s1, String s2) {
		System.out.println(s1+2);
	}

	public static void add() {
		System.out.println();
	}

}
