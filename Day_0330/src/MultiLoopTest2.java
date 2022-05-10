
public class MultiLoopTest2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; ++i) {
			for (int j = 5-i; j >= 0; --j) { //5-i 이런식으로 쓴거는 j와i의 관계성! i가 늘어날때
				                             //j는 줄어든다는걸 보여줄라고
				System.out.print(""); //띄어쓰기로 빈공간표현
			}
			for (int j = 1; j <= i; ++j) { // 포쓰고 꼭 중괄호!!!
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
 * for(5줄 만들기) for//감소 4 3 2 1 0 공백감소 for // 증가 별출력
 */
