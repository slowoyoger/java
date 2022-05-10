
public class StudentVO {//어디선가 new StudentVO를 해야 이놈을 쓸 수 있다.
	private String id; // 계산할거 아닌이상 스트링으로 쓴다.
	private String name; // (지역 변수가 아닌cf.지역변수는 메인에 쓰인거!) 멤버변수, 인스턴스 변수
	private double javaLang;
	private double cLang; // 프라이빗 =정보에 접근 못하게 막는다. 세상모든 사람에게 공개xx

	// 기본생성자 (메모리에 올리기!)
	public StudentVO() { //리턴타입이 없어야 생성자다!
	} // 초기값으로 초기화 한다.

	// 오버로딩된 생성자(기본생성자가 있어야 오버로딩된 생성자 만든다.)
	public StudentVO(String id, String name, double javaLang, double cLang) { // 얘네는 지역변수
		// 지역변수가 우선
		this.id = id; // this = 우리거, 같은 클래스 내에 있는 변수들!
		// 외부에서 id 입력받아 3째줄 우리거에 대입한다. 초기화한다.
		this.name = name; //우리멤버에 접근하는 동작이라고 할 수 있다.
		this.javaLang = javaLang;
		this.cLang = cLang;
	}

	// setter/getter
	public void setId(String id) { //set = 값을 넣겠다! / 이미 ↑위에 오버로딩 생성자로 메모리가 올라가있는데에
		                           // 값을 수정 하는 용도!!! 
		this.id = id;
	}

	public String getId(String id) { //get = id 달라고 하면 던져준다!반환 값이라 단위가 붙는다!
		return id;
	}

	public void setName(String name) {
		this.name = name; // this 생략가능
	}

	public String getName(String name) {
		return name;
	}

	public void setJavaLang(double javaLang) {
		this.javaLang = javaLang;

	}

	public double getJavaLang(double javalang) {
		return javalang;
	}

	public void setCLang(double cLang) {
		this.cLang = cLang;
	}

	public double getCLang(double cLang) {
		return cLang;

	}
	
	public void output() { //setter getter 빼고는 다 기능이 있는 메소드라고 볼 수 있다.
		System.out.println(id+ ":" + name +"," + javaLang+","+cLang);
	}
	
}