
public class MultiLoopTest1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; ++i) {
			System.out.print(i + " : ");
			for (int j = 1; j <= 5; ++j) {
				System.out.print(j + " ");
			}
			System.out.println(); // �ٸ� �ٲ��شٴ� ���ΰ�???

		}
	}
}

/*
 * for (int i = 1; i <= 3; ++i) { for (int j = 1; j <= 5; ++j) {
 * System.out.print("����"); } System.out.println(); } } }
 */
