import java.util.Scanner;

/*========[관리프로그램]========
 * 1. 입력 
 * 2. 전체출력
 * 3. 조회
 * 4. 삭제
 * 5. 수정 
 * 0. 종료
 * -----------
 * 선택>3
 * 조회를 선택했습니다.
 * 다시보여주기 
 * while(true)
 * if(0) 일때만 종료---출력) 프로그램을 종료합니다.
 * 
 */
public class MyMenu2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String choice; // 사용자가 숫자 안 누르고 다른거 모르고 누를수도 있으니까 int라고 안 하고
						// String이라고 해준거
		test(10, 5);

		while (true) {
			menu();
			choice = keyin.next();

			switch (choice) {
			case "1":
				input();
				break;
			case "2":
				output();
				break;
			case "3":
				selectone();
				break;
			case "4":
				delete();
				break;
			case "5":
				update();
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				return; // 완전 나갈때 return
			default:
				System.out.println("err) 메뉴를 다시 선택해 주세요.");
				return;
			// break = 스위치만 빠져나간다. 한겹만! 와일까지 끝내려면 리턴!!

			}
			keyin.nextLine();
		}
	}

	/**
	 * 화면에 주요한 메뉴를 출력해주는 메소드
	 * 
	 */
	// 문서주석! /** 프로그램은 다른 사람이 쓰라고 만든는 거기 때문에 문서주식을 충실히 다는 편이 좋다.
	public static void menu() {
		System.out.println("========[관리프로그램]========");
		System.out.println("1. 입력 ");
		System.out.println("2. 전체출력");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 수정");
		System.out.println("0. 종료");
		System.out.println("--------------------------");
		System.out.print("             선택> ");
	}

	/**
	 * 정보를 키보드로 입력해서 관리하는 메소드
	 */
	public static void input() {
		System.out.println("1. 입력 ");
	}

	/**
	 * 처리된 데이터의 목록을 전부 출력한다.
	 */
	public static void output() {
		System.out.println("전체 출력을 선택했습니다.");
	}

	/**
	 * 데이터 중에서 필요한 데이터를 조회해서 그 정보를 반환함.
	 */
	public static void selectone() {
		System.out.println("조회를 선택했습니다.");
	}

	public static void delete() {
		System.out.println("삭제를 선택했습니다.");
	}

	public static void update() {
		System.out.println("수정을 선택했습니다.");
	}

	/**
	 * 이 메소드는 a의 거듭제곱을 구하는 메소드다.
	 * 
	 * @param a : 밑수
	 * @param b : 지수
	 * @return 거듭제곱의 결과
	 */

	public static int test(int a, int b) {
		return 0;
	}
}
