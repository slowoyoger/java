
public class StaticTest {

	public static void main(String[] args) {
		int radius = 6;
		double area;
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		
		area = radius * radius * Math.PI;// 전체가 다 스태틱인 클래스는 생성없이 그냥 쓴다.
										 //Math m = new Math(); 이렇게 생성 안 한다는거
		
	System.out.println("원의 면적 : " + area);
	}

}
