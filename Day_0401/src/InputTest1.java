import java.util.Scanner;

public class InputTest1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);

		String name;
		int age;

		System.out.print("이름 :  ");
		name = keyin.nextLine(); //한개의 단어만 입력할 수 있다.
		//keyin.nextLine(); // 위에 이름 다카하시 노리유키 입력하면 두개 다 통에 들어갔다가 위에 next에서 노리유키만 출력되고
		//노리유키는 nextline으로 날아간다~! 넥스트 라인은 지워주는 역할
		System.out.print("나이 : ");
		age = keyin.nextInt();

		System.out.println("당신의 이름 : " + name + ", 나이 : " + age + "살 입니다.");
	}

}
/*
 next() : 한개의 문자열 단어를 입력받는다.WS(White Space,공백):스페이스,탭,엔터 = 얘네들은 입력받지 못한다.
 nextline() : 문장을 입력 받는다. 엔터를 친 위치까지!! stdin을 싹 비우는 역할도 수행한다.
 
 ex>
 name = keyin.next();라고 하고
 제임스 딘 입력하고
 밑에 
 age = keyin.next();라고 하면 제임스가 이름에 들어가고 스페이스랑 딘은 버퍼에 아직 그대로 남아있기 때문에
 age에서도 먼저 남아있는 스페이스랑 딘이 들어가서 오류난다!
 			  stdin을 싹 비우는 역할도 수행한다.
 * 
 */

