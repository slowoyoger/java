package example;

public class CallTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int[] ary = { 10, 20 };

		System.out.println("교환 전 : a=" + a + ",b=" + b);
		exchange(a, b);// 값을 전달하면서 호출한다 // Call by Value //원본에 접근 못한다.
		System.out.println("교환 후 : a=" + a + ",b=" + b);

		System.out.println("배열교환 전 : ary[0]=" + ary[0] + ",ary[1]=" + ary[1]);
		exchange(ary);// 값을 전달하면서 호출한다 // ★Call by Reference★ 참조하는 놈한테 가야지 원본에 접근할 수 있다.
		System.out.println("배열교환 후 : ary[0]=" + ary[0] + ",ary[1]=" + ary[1]);

	}

	public static void exchange(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	public static void exchange(int[] ary) { // 오버로딩
		int temp; 
		temp = ary[0];  //레퍼런스로 원본의 주소를 참조해 그 값을 불러오는거! 원본에 접근이 가능하다
		ary[0] = ary[1];
		ary[1] = temp;

	}
}
