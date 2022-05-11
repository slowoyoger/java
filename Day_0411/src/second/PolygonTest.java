package second;

class Polygon {
	private int x;
	private int y;

	public Polygon() {
	} // 기본생성자. 기본생성자가 없으면 여기서가 아니라 자식에서 문제생긴다.

	public Polygon(int x, int y) { // 오버로딩된 생성자
		this.x = x;
		this.y = y;
	}

	public void print() { // final 붙이면 = 상속은 하되 고치진 마라
		System.out.println("x=" + x + ",y = " + y);
	}

	@Override
	public String toString() {
		return "x =" + x + ",y = " + y;
	}
}

class Rectangle extends Polygon {
	private int width;
	private int height; // 프라이빗 상속 엑스

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		// 부모 클래스 생성자를 호출하는 코드가 만들어짐 (내가 안 만들면 자바가 알아서)
		// super(); // 부모클래스 만들때는 수퍼.부모 클래스 명시적으로 만드려고 하면 맨 위에 있어야 한다! 최상단!!
		this.width = width;
		this.height = height; // 초기화

	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);// 위에 부모거 생성자 초기화 하려면
		this.width = width;
		this.height = height;

	}

	@Override
	public void print() {// 오버라이드 되면 이름이 같아지니까 부모가 감추어 지고 자식만 보인다.
		// 완전 외부에서는 가려지지만 오버라이드 내부에서는 아버지 호출가능
		super.print();
		System.out.println("width=" + width + ",height=" + height);
	}

	@Override
	public String toString() {
		return "width=" + width + ",height=" + height;
	}
}
// public printPolygon()가 상속 되었다!

public class PolygonTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.print(); // r1을 이용해서 polygon의 print()를 호출 할 수 없다!! 오버라이드 됐기 때문에 부모가 가려진다.
					// 위에 오버라이드 매소드 속에다가 수퍼로 부르면 둘다 가능하다
		System.out.println();

		Rectangle r2 = new Rectangle(10, 5);
		r2.print();
		System.out.println();

		Rectangle r3 = new Rectangle(3, 3, 15, 25);
		r3.print();
		System.out.println("---------------------");

		Polygon p1 = new Polygon();
		p1.print();

		// r3.toString()// 우리 멤버들을 문자열로 변환해서 리턴해주는 오브젝트매소드
		// 리턴된 데이터를 받아서 출력하는 게 투 스트링

		System.out.println(r3); // println은 뒤에 tostring따로 안 써줘도 가능
		System.out.println(r3);
		System.out.println(r3.toString());

	}
}
