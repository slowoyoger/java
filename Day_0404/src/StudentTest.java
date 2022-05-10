
public class StudentTest {

	public static void main(String[] args) { // 메인이 있어야 프로그램이 시작! 시작점이 메인이다.

		// 왼쪽 StudentVO = 생성자(Constructor)를 이용해서 객체를 메모리에 생성
		// 개발자가 생성자를 안 만들면 --> JVM(자바버츄얼 머신)이 생성자를 만든다.
		StudentVO s1 = new StudentVO(); // -->생성자!!!생성자가 있어야 메모리에 VO가 올라간다 /s1은 레퍼런스 변수이자 지역변수

		/*
		 * (); 이게 메소드 호출같은데 그게 아니고 생성자라고 한다! 객체를 메모리에 생성! 이래야 가져옴 s1는 studentVO의 주소를
		 * 갖고있는 참조변수. 레퍼런스다
		 */
		s1.setId("1234"); //// = s1.id = "123"; -->직접 접근! 왼쪽 s1.setId("1234")가 세터를 통한 간접 접근
		//s1 라는 메모리를 하나 만든다! (세모 표시는 접근지정자가 없다!)
		s1.setName("홍길동");
		s1.setJavaLang(89);
		s1.setCLang(88);

		StudentVO s2 = new StudentVO(); // s2라는 메모리를 하나 만든다!
		s2.output();

		StudentVO s3 = new StudentVO("436", "손오공", 77.5, 86.7); //생성자 만든 순서대로 넣어주면 된다.
		s1.output();
		
		s3.output();
		/*
		 * System.out.println(s1.getId() + " : " + s1.getName + ", " + s1.getJavaLang +
		 * ", " + s1.getCLang);
		 * 
		 * System.out.println(s2.id + " : " + s2.name + ", " + s2.javaLang + ", " +
		 * s2.cLang); System.out.println(s3.id + " : " + s3.name + ", " + s3.javaLang +
		 * ", " + s3.cLang); }
		 */
	}
}
