
public class MethodTest5 {

	public static void main(String[] args) {
		myMethod();
		//yourMethod(); // static인 main에서는 non-static인 yourMethod()접근 불가!!!
	}

	public static void myMethod() {
		System.out.println("myMethod는 static입니다.");
	}
	
	public void yourMethod() {
		System.out.println("yourMethod는 non-static입니다.");
	}
	
}
/*static --> static 메소드에서는 non-static을 호출할 수 없다!
 스태틱은 거의 안 만든다!!!! -> 메모리 문제 때문에! 되도록 넌스태틱으로 만든다!
 						클래스를 생성한 후에는 사용할 수 있다.
 public--> 다른 클래스에서도 이 메소드를 사용할 수 있도록 해주는 키워드.
 (퍼블릭 없앤 상태 = default) : 접근지정자가 없는 상태. 현재 클래스에서 접근 가능!
 퍼블릭 없이 쓰면 나혼자 쓸 수 있는거~!
 */
