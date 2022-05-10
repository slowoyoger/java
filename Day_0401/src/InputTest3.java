import java.util.Scanner;

public class InputTest3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String data = null;
		int number = 0;

		while (true) {
			System.out.println("문자를 입력하세요 : ");
			data = keyin.next();
			
			keyin.nextLine();//버퍼비우기 목적! 앞에 뭐 안 써도 된다. 사용자가 요류 냈을 때 앞에거만 가져오는거
			
			System.out.println(" 정수를 입력하세요 : ");
			number = keyin.nextInt();

			System.out.println("입력한 데이터는 " + data + "," + number);
		}

	}

}
