
public class MethodTest5 {

	public static void main(String[] args) {
		myMethod();
		//yourMethod(); // static�� main������ non-static�� yourMethod()���� �Ұ�!!!
	}

	public static void myMethod() {
		System.out.println("myMethod�� static�Դϴ�.");
	}
	
	public void yourMethod() {
		System.out.println("yourMethod�� non-static�Դϴ�.");
	}
	
}
/*static --> static �޼ҵ忡���� non-static�� ȣ���� �� ����!
 ����ƽ�� ���� �� �����!!!! -> �޸� ���� ������! �ǵ��� �ͽ���ƽ���� �����!
 						Ŭ������ ������ �Ŀ��� ����� �� �ִ�.
 public--> �ٸ� Ŭ���������� �� �޼ҵ带 ����� �� �ֵ��� ���ִ� Ű����.
 (�ۺ� ���� ���� = default) : ���������ڰ� ���� ����. ���� Ŭ�������� ���� ����!
 �ۺ� ���� ���� ��ȥ�� �� �� �ִ°�~!
 */
