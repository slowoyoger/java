
public class MultiLoopTest2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; ++i) {
			for (int j = 5-i; j >= 0; --j) { //5-i �̷������� ���Ŵ� j��i�� ���輺! i�� �þ��
				                             //j�� �پ��ٴ°� �����ٶ��
				System.out.print(""); //����� �����ǥ��
			}
			for (int j = 1; j <= i; ++j) { // ������ �� �߰�ȣ!!!
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
 * for(5�� �����) for//���� 4 3 2 1 0 ���鰨�� for // ���� �����
 */
