import java.util.Scanner;

public class PolygonTest {
	public static void main(String[] args) {
		MyPoint p;
		p = new MyPoint(1, 1);// �ڽ��� ����Ű�� �ִ°�
		output(p);

		p = new Circle(5.5); // �ڴ����� �ְ��߿�!!!
		output(p);
		p = new Triangle(6,7);
		output(p);
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static void output(MyPoint p) {
		System.out.println(p);
		
	}
}
		/*	MyPoint p1 = new MyPoint(5, 5);
		System.out.println(p1);
		
		Circle c1 = new Circle(4.5);
		c1.setX(1); //�θ����� �����Ŵ� �� ���̵� �״�� ���� ����
		c1.setY(1);
		System.out.println(c1);
		
		Triangle t1 = new Triangle(7, 8);
		
		t1.setX(10);
		t1.setY(10); // 10�� ��� �޾Ҵ�.
		System.out.println(t1);
		
		System.out.println(p1 instanceof MyPoint); //p1�� ��������Ʈ�� �ν��Ͻ���?
		System.out.println(p1 instanceof Object); //p1�� ������Ʈ�� �ν��Ͻ���??  // �� �ڽ��� �θ� �̰ų�? ==����
		System.out.println(p1 instanceof Triangle);  // �θ� �ڽ�Ŭ������?? == �Ұ���
	
		System.out.println(c1 instanceof Circle); //c1�� ��Ŭ�� ����Ű��??
		System.out.println(c1 instanceof MyPoint); //c1�� ������Ʈ�� �ν��Ͻ���??
		
		System.out.println(c1 instanceof Triangle); //�������� �Ұ���
	}

}
//====================================
//instanceof : ���׿�����. ��� ���迡���� ��� ����. true/false�� �����Ѵ�
*/
	