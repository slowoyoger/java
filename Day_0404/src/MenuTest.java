import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		MainMenu m = new MainMenu();
		Scanner keyin = new Scanner(System.in);
		String choice; // 사용자가 숫자 안 누르고 다른거 모르고 누를수도 있으니까 int라고 안 하고
						// String이라고 해준거

		while (true) {
			m.menu(); //m=레퍼런스 변수
			choice = keyin.next();

			switch (choice) {
			case "1":
				m.input(); // m. = 테스트가 메뉴를 생성함! 여기에 new가 생긴거
				break;
			case "2":
				m.output();
				break;
			case "3":
				m.selectone();
				break;
			case "4":
				m.delete();
				break;
			case "5":
				m.update();
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("err) 메뉴를 다시 선택해 주세요.");
				return;
			}
			keyin.nextLine();
		}
	}
}
