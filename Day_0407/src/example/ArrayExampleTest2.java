package example;

import java.util.Scanner;

/*
1.5���� ũ�⸦ ���� �����迭�� �����Ͻÿ�(iary)
2.Ű����κ��� ���� 5���� �Է¹޾Ƽ� iary�迭�� �� ������ �ʱ�ȭ �ټ� �� �ݺ��ؾߵǴϱ� for��
3. iary*/
public class ArrayExampleTest2 {
	static int[] iary = new int[5];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �ٲ� ���� �� �ʿ�!

		// �ʱ�ȭ
		for (int i = 0; i < iary.length; ++i) {
			System.out.println("iary[" + i + "] ==>");
			iary[i] = scanner.nextInt();

		}
		// ���
		System.out.println("##��ȯ �� ���");
		for (int i = 0; i < iary.length; ++i) {
			System.out.print(iary[i] + "");
		}
		System.out.println();

		// ��ȯ
		// 0 �ϰ� leng-1 / 1�ϰ�length-2
		int temp;
		for (int i = 0; i < iary.length / 2; ++i) {
			temp = iary[i];
			iary[i] = iary[iary.length - (i + 1)];
			iary[iary.length - (i + 1)] = temp;
		}

		System.out.println("##��ȯ �� ���");
		for (int i = 0; i < iary.length; ++i) {
			System.out.print(iary[i] + "");
		}
		System.out.println();
	}
}