//Service 클래스, Manager 클래스 (로직들)
public class MainMenu {
	/**
	 * 화면에 주요한 메뉴를 출력해주는 메소드
	 * 
	 */
	
	public void menu() {
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
	public  void input() {
		System.out.println("1. 입력 ");
	}

	public  void output() {
		System.out.println("전체 출력을 선택했습니다.");
	}
	
	public void selectone() {
		System.out.println("조회를 선택했습니다.");
	}

	public  void delete() {
		System.out.println("삭제를 선택했습니다.");
	}

	public void update() {
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


