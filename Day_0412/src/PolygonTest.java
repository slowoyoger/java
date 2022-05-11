import java.util.Scanner;

public class PolygonTest {
	public static void main(String[] args) {
		MyPoint p;
		p = new MyPoint(1, 1);// 자식을 가리키고 있는거
		output(p);

		p = new Circle(5.5); // ★다형성 최고중요!!!
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
		c1.setX(1); //부모한테 받은거는 뭐 없이도 그대로 수정 가능
		c1.setY(1);
		System.out.println(c1);
		
		Triangle t1 = new Triangle(7, 8);
		
		t1.setX(10);
		t1.setY(10); // 10을 상속 받았다.
		System.out.println(t1);
		
		System.out.println(p1 instanceof MyPoint); //p1이 마이포인트의 인스턴스냐?
		System.out.println(p1 instanceof Object); //p1이 오브젝트의 인스턴스냐??  // 아 자식의 부모가 이거냐? ==가능
		System.out.println(p1 instanceof Triangle);  // 부모가 자식클래스냐?? == 불가능
	
		System.out.println(c1 instanceof Circle); //c1이 써클을 가르키냐??
		System.out.println(c1 instanceof MyPoint); //c1이 오브젝트의 인스턴스냐??
		
		System.out.println(c1 instanceof Triangle); //형제끼리 불가능
	}

}
//====================================
//instanceof : 이항연산자. 상속 관계에서만 사용 가능. true/false로 리턴한다
*/
	