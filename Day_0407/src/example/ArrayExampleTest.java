package example;

import java.util.Scanner;

/*
1.5개의 크기를 가진 정수배열을 생성하시오(iary)
2.키보드로부터 정수 5개를 입력받아서 iary배열의 각 변수를 초기화 다섯 번 반복해야되니까 for문
3. iary*/
public class ArrayExampleTest {
	static int[] iary = new int[5];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 초기화
		for (int i = 0; i < iary.length; ++i) {
			System.out.println("iary[" + i + "] ==>");
			iary[i] = scanner.nextInt();

		}
//출력
		System.out.println("##입력된 결과");
		for (int i = 0; i < iary.length; ++i) {
			System.out.print(iary[i] + "");
		}
		System.out.println();

	}
}
