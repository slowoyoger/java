import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		String address;
		String name;
		String age;
		double height;

		Scanner keyin = new Scanner(System.in);
		System.out.println("이름 : " );
		name = keyin.next();
		keyin.nextLine();
	
		System.out.println("주소 : " );
		address = keyin.nextLine();
		
		
		System.out.println("나이 : " );
		age = keyin.next();
		keyin.nextLine();
		
		System.out.println("키 : ");
		height = keyin.nextDouble();
		keyin.nextLine();
	
		
		System.out.println("이름 : " + name + '\n' + "주소 : " + address +'\n' + "나이 : " + age + '\n' + "키 : " + height);
	
		// '\n' = 엔터
	}

}

/*
 * 이름 : 홍길동 주소 : 서울시 강남구 역삼동 1234번지 나이 : 25살 키 : 177.5cm
 */
