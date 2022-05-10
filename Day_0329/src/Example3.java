import java.util.Scanner;

/*키보드로부터 정수값입력받기 (int = end)
 * 실행
 * 끝값을 입력 : 5(5까지 출력하기) 
 * 1 2 3 4 5 
 * 화면에 왼쪽으로 출력
 * 
 * int end = 0;
 * while(end>=5) {
 * }
 * 
 */

public class Example3 {

	public static void main(String[] args) {
		int end = 0; // int end, i=0;(while을 제어하는 i)
		Scanner scanner = new Scanner(System.in);
		// System.out.println("끝값을 입력 : ");
		end = scanner.nextInt();

		while (end <= 5) { // while(i<end)
							// ++i
			System.out.println(end); // System.out.print(i+" ") // 띄어쓰기에 반복 값이 들어감
			++end;

		}
		System.out.println();
	}

}
