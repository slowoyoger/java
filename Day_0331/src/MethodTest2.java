import java.util.Scanner;

public class MethodTest2 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int num1, num2;
			
			System.out.print("두 개의 정수를 입력하세요 : ");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();

			System.out.println("add() = " + add(num1, num2));
			System.out.println("substract() = " + substract(num1, num2));
			System.out.println("multiply() = " + multiply(num1, num2));
			System.out.println("divide() = " + divide(num1, num2));
			
			scanner.close(); //스캐너 안 닫혀있다고 뜰때 요거 넣기
		}
		
		public static int add(int a, int b) {
			return (a+b);
		}
		public static int substract(int a, int b) {
			return (a-b);
		}
		public static int multiply(int a, int b) {
			return (a*b);
		}
		public static double divide(int a, int b) {
			return (a/(double)b);
		}
	}
/*
 * [연습문제1] 2개의 정수를 입력받아 메인 메소드에서 아래의 4개 메소드들을 호출한 후 그 리턴값을 출력하시오 public static
 * int add(int a, int b); public static int substract(int a, int b); public
 * static int multiply(int a, int b); public static int double divide(int a, int
 * b);
 */
