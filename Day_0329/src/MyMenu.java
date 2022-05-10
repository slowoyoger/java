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
public class MyMenu {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("========[관리프로그램]========");
			System.out.println("1. 입력 ");
			System.out.println("2. 전체출력");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("5. 수정");
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			System.out.print("             선택> ");

			choice = keyin.nextInt(); //Exeption 처리하지 않았음! 사용자가 이상한거 누르면 익셉션 에러

			switch (choice) {
			case 1:
				System.out.println("입력을 선택했습니다.");
				break;
			case 2:
				System.out.println("전체 출력을 선택했습니다.");
				break;
			case 3:
				System.out.println("조회를 선택했습니다.");
				break;
			case 4:
				System.out.println("삭제를 선택했습니다.");
				break;
			case 5:
				System.out.println("수정을 선택했습니다.");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return; //완전 나갈때 return
			default:
				System.out.println("err) 메뉴를 다시 선택해 주세요.");
				return;
			// break = 스위치만 빠져나간다. 한겹만! 와일까지 끝내려면 리턴!!

			}
		}
	}
}
