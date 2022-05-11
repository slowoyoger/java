package first;

class Polygon {
	private int x;
	private int y;

	public Polygon() {
		System.out.println("polygon 클래스 기본 생성자!");// 생성자 상속 안함

	}

	public void printPolygon() {
		System.out.println("x=" + x + ",y = " + y);
	}
}

class Rectangle extends Polygon {
	private int width;
	private int height; // 프라이빗 상속 엑스

	public Rectangle() {
		// 부모 클래스 생성자를 호출하는 코드가 만들어짐 (내가 안 만들면 자바가 알아서)
		// super(); // 부모클래스 만들때는 수퍼.부모 클래스 명시적으로 만드려고 하면 맨 위에 있어야 한다! 최상단!!
		System.out.println("rectangle 클래스 기본 생성자!");// 생성자 상속 안함

	}

	public void printRectangle() {
		super.printPolygon(); // 부모를 불러온다! 자식만 부모를 불러올 수 있다.
		System.out.println("width=" + width + ",height=" + height);
	}
}
// public printPolygon()가 상속 되었다!

public class PolygonTest {

	public static void main(String[] args) {
		// Polygon p1 = new Polygon();
		// p1.printPolygon();

		Rectangle rect1 = new Rectangle();
//		rect1.printPolygon();   //상속받은 메소드
//		rect1.printRectangle();  //자신의 메소드

	}

}
