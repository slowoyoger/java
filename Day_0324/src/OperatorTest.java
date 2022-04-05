import java.util.Scanner;

/*키보드를 나이를 입력받아
 * 만 19세 이상이면 "선거권이 있습니다." / 없으면 "선거권이 없습니다."
 */
public class OperatorTest {

	public static void main(String[] args) {
		int age;
		String msg;
		Scanner key = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		
		age= key.nextInt();
		msg = (age >= 19) ? "선거권이 있습니다."
						  : "선거권이 없습니다.";
		
		System.out.println(age + "는" + msg);
	}

}
