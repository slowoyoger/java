
public class Example1 {

	public static void main(String[] args) {
		int temp = 5784;
		int b = 30;
		String message = (temp % 2 == 0) ? temp + "¦���Դϴ�." : "Ȧ���Դϴ�.";
		//temp�� 2�� �����ٸ� �������� 0�Դϱ�? �´ٸ� ¦���Դϴ� �ƴ϶�� Ȧ���Դϴ�
		
	 // ���� b�� ������ ������ �ְ� 3�� �������
		String message1 = (b % 3 == 0) ? b+"�� 3�� ����Դϴ�."
									  :  b+"�� 3�� ����� �ƴմϴ�.";
		System.out.println(message1);

	}

}
