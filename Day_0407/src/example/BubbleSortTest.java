package example;

public class BubbleSortTest {
	public static void main(String[] args) {
		int[] ary = { 31, 5, 9, 12, 16, 22, 1, 14, 6, 18 };
	

		System.out.println("## ���� ��");
		print(ary);
		
		sort(ary);
		
		
		System.out.println("## ���� ��");
		print(ary);
	}

	public static void print(int[] ary) {
		for (int i = 0; i < ary.length; ++i) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();

	}

	public static void sort(int[] ary) {
		int temp;

		
		
		
		for (int i = 0; i < ary.length - 1; ++i) { // ��ü ����.���������� ���ƶ�.1���� 10���� ȸ��
			for (int j = 0; j < ary.length - (i + 1); ++j) { 
				//�������� ���� Ŀ���� ���ĵǴϱ� �װ� ���� 9����, 8����,7���� 
				if (ary[j] > ary[j + 1]) { //���� ���� �� ũ�ٸ� ������ ���̶� �ٲ��ش�. �������� ��
					temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}
			}

		}
	}
}
