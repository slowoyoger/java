import java.util.Scanner;

public class MethodTest2 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int num1, num2;
			
			System.out.print("�� ���� ������ �Է��ϼ��� : ");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();

			System.out.println("add() = " + add(num1, num2));
			System.out.println("substract() = " + substract(num1, num2));
			System.out.println("multiply() = " + multiply(num1, num2));
			System.out.println("divide() = " + divide(num1, num2));
			
			scanner.close(); //��ĳ�� �� �����ִٰ� �㶧 ��� �ֱ�
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
 * [��������1] 2���� ������ �Է¹޾� ���� �޼ҵ忡�� �Ʒ��� 4�� �޼ҵ���� ȣ���� �� �� ���ϰ��� ����Ͻÿ� public static
 * int add(int a, int b); public static int substract(int a, int b); public
 * static int multiply(int a, int b); public static int double divide(int a, int
 * b);
 */
