
public class StudentTest {

	public static void main(String[] args) { // ������ �־�� ���α׷��� ����! �������� �����̴�.

		// ���� StudentVO = ������(Constructor)�� �̿��ؼ� ��ü�� �޸𸮿� ����
		// �����ڰ� �����ڸ� �� ����� --> JVM(�ڹٹ���� �ӽ�)�� �����ڸ� �����.
		StudentVO s1 = new StudentVO(); // -->������!!!�����ڰ� �־�� �޸𸮿� VO�� �ö󰣴� /s1�� ���۷��� �������� ��������

		/*
		 * (); �̰� �޼ҵ� ȣ�ⰰ���� �װ� �ƴϰ� �����ڶ�� �Ѵ�! ��ü�� �޸𸮿� ����! �̷��� ������ s1�� studentVO�� �ּҸ�
		 * �����ִ� ��������. ���۷�����
		 */
		s1.setId("1234"); //// = s1.id = "123"; -->���� ����! ���� s1.setId("1234")�� ���͸� ���� ���� ����
		//s1 ��� �޸𸮸� �ϳ� �����! (���� ǥ�ô� ���������ڰ� ����!)
		s1.setName("ȫ�浿");
		s1.setJavaLang(89);
		s1.setCLang(88);

		StudentVO s2 = new StudentVO(); // s2��� �޸𸮸� �ϳ� �����!
		s2.output();

		StudentVO s3 = new StudentVO("436", "�տ���", 77.5, 86.7); //������ ���� ������� �־��ָ� �ȴ�.
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
