class MyClass {  // ���� ���̳��ϸ� ��� ���� 	
	int var ; 					//�������
	final double DB = 3.5; 
	static int mydata = 5; 		//Ŭ���� ���� : �츮 �ȿ� ���� ������ �츮 ����� �ƴ�. �ٸ� ������ �ִ�.
								// �츮�� �ƴ϶� this ���̸� �� ��.
	
	
	public final void myMethod() { //�żҵ� �տ��� ���̳� ���� BUT �� �޼ҵ带 ��ӹ��� �ڽ���
		                           //�� �޼ҵ� ���� ����
		System.out.println(this.DB);
		System.out.println(MyClass.mydata);// ���̵���Ÿ�� ����ƽ �츮�Ű� �ƴϴϱ� this�� �� ��������
											//Ŭ�������� �տ� ����Ѵ�
	
	}
	
	/*
	 * //final double db; �̷��Ը� ���� 0���� �ʱ�ȭ �Ѵٴ°Ŵϱ�(final �� �ᵵ �� 0) ���̶�� �� �� ��� //�����
	 * �ִ� ���̳��� �̷��� ���ٷθ� �ʱ�ȭ ���� final double DB = 3.5; 
	 * final double DB 
	 *  DB = 3.5; �̷��� �� �ٷ� �Ұ�
	 * ////
	 */
}
public class FinalTest{
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
}



 	/*public class FinalTest {//���� �޼ҵ带 ���� �ָ� �ۺ��� ���� �� �ִ�. 
 							//�ۺ��� �������� �����̰� ���� �̸��̶� ���ƾ���.

	public static void main(String[] args) {
		int a = 10;
		a=22;
		
		final int b = 22;


	}*/

}

