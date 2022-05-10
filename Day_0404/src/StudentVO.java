
public class StudentVO {//��𼱰� new StudentVO�� �ؾ� �̳��� �� �� �ִ�.
	private String id; // ����Ұ� �ƴ��̻� ��Ʈ������ ����.
	private String name; // (���� ������ �ƴ�cf.���������� ���ο� ���ΰ�!) �������, �ν��Ͻ� ����
	private double javaLang;
	private double cLang; // �����̺� =������ ���� ���ϰ� ���´�. ������ ������� ����xx

	// �⺻������ (�޸𸮿� �ø���!)
	public StudentVO() { //����Ÿ���� ����� �����ڴ�!
	} // �ʱⰪ���� �ʱ�ȭ �Ѵ�.

	// �����ε��� ������(�⺻�����ڰ� �־�� �����ε��� ������ �����.)
	public StudentVO(String id, String name, double javaLang, double cLang) { // ��״� ��������
		// ���������� �켱
		this.id = id; // this = �츮��, ���� Ŭ���� ���� �ִ� ������!
		// �ܺο��� id �Է¹޾� 3°�� �츮�ſ� �����Ѵ�. �ʱ�ȭ�Ѵ�.
		this.name = name; //�츮����� �����ϴ� �����̶�� �� �� �ִ�.
		this.javaLang = javaLang;
		this.cLang = cLang;
	}

	// setter/getter
	public void setId(String id) { //set = ���� �ְڴ�! / �̹� ������ �����ε� �����ڷ� �޸𸮰� �ö��ִµ���
		                           // ���� ���� �ϴ� �뵵!!! 
		this.id = id;
	}

	public String getId(String id) { //get = id �޶�� �ϸ� �����ش�!��ȯ ���̶� ������ �ٴ´�!
		return id;
	}

	public void setName(String name) {
		this.name = name; // this ��������
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
	
	public void output() { //setter getter ����� �� ����� �ִ� �޼ҵ��� �� �� �ִ�.
		System.out.println(id+ ":" + name +"," + javaLang+","+cLang);
	}
	
}