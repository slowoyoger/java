/*

//12345�ʴ� �� ���ϱ��?? 
 * �� = ��, ������ = ��
 * 12345�ʴ�  �� ���Դϴ�.
*/

public class Example2 {

	public static void main(String[] args) {
		int second = 12345;
		int minute = second / 60;

		int remainsecond = second % 60;

		int hour = minute / 60;
		int remainminute = minute % 60;

		System.out.println(second + "�ʴ�" + hour + "�ð�" + remainminute + "��" + remainsecond + "���Դϴ�");

	}

}
