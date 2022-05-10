class MyClass {  // 여기 파이널하면 상속 안함 	
	int var ; 					//멤버변수
	final double DB = 3.5; 
	static int mydata = 5; 		//클래스 변수 : 우리 안에 들어와 있지만 우리 멤버는 아님. 다른 공간에 있다.
								// 우리게 아니라 this 붙이면 안 됨.
	
	
	public final void myMethod() { //매소드 앞에도 파이널 가능 BUT 이 메소드를 상속받은 자식은
		                           //이 메소드 수정 못함
		System.out.println(this.DB);
		System.out.println(MyClass.mydata);// 마이데이타는 스태틱 우리거가 아니니까 this로 못 데려오고
											//클래스명을 앞에 써야한다
	
	}
	
	/*
	 * //final double db; 이렇게만 쓰면 0으로 초기화 한다는거니까(final 안 써도 걍 0) 값이라고 할 수 없어서 //멤버에
	 * 있는 파이널은 이렇게 한줄로만 초기화 가능 final double DB = 3.5; 
	 * final double DB 
	 *  DB = 3.5; 이렇게 두 줄로 불가
	 * ////
	 */
}
public class FinalTest{
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
}



 	/*public class FinalTest {//메인 메소드를 가진 애만 퍼블릭을 가질 수 있다. 
 							//퍼블릭을 가진놈이 메인이고 파일 이름이랑 같아야함.

	public static void main(String[] args) {
		int a = 10;
		a=22;
		
		final int b = 22;


	}*/

}

