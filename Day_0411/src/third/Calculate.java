package third;

public interface Calculate {//인터페이스는 메소드 바디가 없다.메소드 바디를 구현해야 쓸 수 있다
	double PI = 3.14; //살짝 누운 파랑이 = 퍼블릭 스태틱 파이널
	//인터페이스는 static, final 딱 정해진 상수값 지정해놓고 물려준다.
	
	public double area();
	public void print(); // 이 규격을 꼭 만들어라!!
	
}
